package com.gmail.kutepov89.sergey;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		
		final Class<?> cls = TestClass.class;
		
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Save.class)) {
				Class<?> fieldType = field.getType();
	            str.append("\tName: " + field.getName());
	            str.append("\tType: " + fieldType.getName()+"\n");	
			}
		}
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fil"))) {
			oos.writeObject(str.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fil"))) {
			System.out.println(ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
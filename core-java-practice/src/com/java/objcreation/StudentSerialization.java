package com.java.objcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerialization {
	public static void main(String[] args) {
        // Path to store the Serialized object
        String filePath = "sample.txt";
        Student s1 = new Student("Sandip", "GECA");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(s1);
            outputStream.flush();
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Student s2 = (Student) inputStream.readObject();

            inputStream.close();

            System.out.println(s2.getName());
            System.out.println(s2.getCollege());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}

package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization 
{
	void meth1() throws Exception
	{
		Serialization2 s=new Serialization2();
		s.a=10;
		s.s="data";
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\FileInputStrem\\data5.ser"));
		oos.writeObject(s);
		System.out.println("Object writing is completed");
		oos.close();
		
	}
	void meth2() throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\FileInputStrem\\data5.ser"));
		Serialization2 object =(Serialization2) ois.readObject();
		System.out.println(object.a+" "+object.s);
		ois.close();
		
		
		
		
	}
	public static void main(String[] args) throws Exception {
		Serialization serialization=new Serialization();
		//serialization.meth1();
		serialization.meth2();
	}
	

}

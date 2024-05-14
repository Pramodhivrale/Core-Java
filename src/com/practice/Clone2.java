package com.practice;

public class Clone2 
{
	void meth1()
	{
		Clone1 c=new Clone1(1, "Mahabharat");
		System.out.println(c.id+" "+c.name);
	}
	public static void main(String[] args) {
		new Clone2().meth1();
	}

}

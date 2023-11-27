package com.crnts.Strings;

import java.util.Arrays;

public class StringToCharArrayP1 {

	public static void main(String[] args) {
		StringToCharArrayP1 stringToCharArrayP1 =new StringToCharArrayP1();
		stringToCharArrayP1.stringToArrayP1();
		stringToCharArrayP1.substringP2();
		stringToCharArrayP1.compareStringObjects();	
		stringToCharArrayP1.reverseString();
		stringToCharArrayP1.reverseString1();
		stringToCharArrayP1.reverseOnlyWord();
		stringToCharArrayP1.splitTokenised();
		stringToCharArrayP1.bufferP8();
		stringToCharArrayP1.bufferP9();
	}
//	Convert string characters to char array and then display them.
	void stringToArrayP1()
	{
		String name="rakhi";
		char[]  array=name.toCharArray();
		System.out.print("[");
		for(int index=0;index<array.length;index++)
		{
			System.out.print(array[index]+",");
		}System.out.println("]");
		
		
	}
	
//	Write a program to get substring “CoreNuts Technologies“ from “CoreNuts Technologies Pvt ltd.”;
	void substringP2()
	{
		String name="CoreNuts Technologies Pvt ltd";
		System.out.println(name.substring(0, name.indexOf('P')));
		
	}
	
//	Write a program to compare string values instead of address of string objects
//	Write a program to compare address of string objects
	void compareStringObjects()
	{
		String object1=new String("rakhi");
		String object2=new String("rakhi");
		System.out.println(object1.equals(object2));  //value check
		
		System.out.println(object1==object2);  //address check
		System.out.println(object1.toString());
		String object3="yulu";
		String object4="rakhi";
		
		System.out.println(object3);
		
		System.out.println(object1==object4);
	}
	
//	Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different ways (on only string object)
	void reverseString()
	{
		String name="CoreNuts Technologies Pvt ltd";
		char ch;
		String newName="";
		for(int index=0;index<name.length();index++)
		{
			newName=name.charAt(index)+newName;
			
			
		}System.out.println("way1 :"+newName);
	}
	
//	Write a program to reverse a string “CoreNuts Technologies Pvt ltd.” in different ways (on only string object)
	void reverseString1()
	{
		String name="CoreNuts Technologies Pvt ltd";
		char ch;
		String newName="";
		for(int index=name.length()-1;index>-1;index--)
		{
			newName=newName+name.charAt(index);
			
			
		}System.out.println( "way2 :"+(newName));
	}
	
//	Write a program to reverse words instead of characters ““CoreNuts Technologies Pvt ltd.”
	void reverseOnlyWord()
	{
		String name="CoreNuts Technologies Pvt ltd";
		
		String[] ch=name.split(" ");
		String newName="";
		for(int index=0;index<ch.length;index++)
		{
			newName=ch[index] +" "+newName ;
			
			
		}System.out.println(newName);
	}
	
//	Write a program to split a string and display tokenized strings
	void splitTokenised()
	{
		String name="CoreNuts Tech";
		String[] ch=name.split(" ");
		String newName="";
		for(int index=0;index<ch.length;index++)
		{
			newName=newName+" "+ch[index];
			
			
		}System.out.println(newName);
	}
	
//	Write a program using StringBuffer class to delete a String “Technologies” from “CoreNuts Technologies Pvt ltd.”
	void bufferP8()
	{
		StringBuffer name= new StringBuffer("CoreNuts Technologies Pvt ltd");
		System.out.println(name.delete(name.indexOf("T"),name.lastIndexOf("s")+1));
		System.out.println(name.lastIndexOf("s"));
		
	}
	
//	Write a program using StringBuffer class to insert a String “Technologies” after CoreNuts in “CoreNuts Pvt ltd.”
	void bufferP9()
	{
		StringBuffer name= new StringBuffer("CoreNuts Pvt ltd");
		System.out.println(name.insert(name.indexOf(" ")+1, "Technologies"));
		
	}

}

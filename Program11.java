//Write a program to count repeated characters in a string.
package com.crnts.Strings;

public class Program11 {

	public static void main(String[] args) {
		Program11 program11=new Program11();
	
		program11.countChars();
	}
	void countChars()
	{
		String name="Corebbmbsss";
		
		String distinct="";
		
		for(int index=0;index<name.length();index++)     //occurrences
		{
			char characters=name.charAt(index);
		if(!distinct.contains(characters+""))
				{
					distinct+=characters;
				}
				
			}
		for(int index=0;index<distinct.length();index++) 
		{   int c=0;
			for(int index1=0;index1<name.length();index1++) 
			{
				if(distinct.charAt(index)==name.charAt(index1))
						{
					      c++;
						}
			}System.out.println(distinct.charAt(index)+"--->"+c);
		}
		
			
		}
	}



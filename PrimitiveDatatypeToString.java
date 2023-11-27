//Write convert from primitive data type values to string.
package com.crnts.Strings;

public class PrimitiveDatatypeToString {

	public static void main(String[] args) {
		PrimitiveDatatypeToString primitiveDatatypeToString=new PrimitiveDatatypeToString();
		primitiveDatatypeToString.convertToString();
		primitiveDatatypeToString.convertToString1();
	}
	void convertToString()
	{
		int value=10;
		String sValue=String.valueOf(value);
		System.out.println(sValue);
	}
	
	void convertToString1()
	{
		int value=10;
		String sValue=""+value;
		System.out.println(sValue);
	}

}

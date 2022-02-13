//StringScannerApp.java
//CS257 LAB1C
//Author: Jacob Golden
//Date: Jan. 13, 2020

import java.util.Scanner;

public class StringScannerApp 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		//create String (string str)
		System.out.println("Please enter a string of your choice: ");
		String str = new String(scan.nextLine());
		
		//create char array with length == str.length()
		char[]inputWord = new char[str.length()];
		
		//for loop - string chars into char array
		for(char i = 0; i < str.length(); i++)
			inputWord[i] = str.charAt(i);
		
		//iterator loop - output string w/out spaces
		for(char oneLetter : inputWord)
		{
			
			if(oneLetter == ' ')
			{
				continue;
			}
			
			System.out.print(oneLetter);
			
		}
		
		
		//line break
		System.out.println("\n");
			
		
		//I couldn't figure out the while loop, so I used a for loop
		for(int i = 0; i < str.length(); i++)
		{
			
			if(i == 0)
			{
				
				System.out.print(str.charAt(i));
				
			}
			
			else if(i % 2 == 0)
			{
				
				System.out.print(str.charAt(i));
				
			}

			
		}//end for
		
		//line break
		System.out.println("\n");
		
		//for loop output odd chars in reverse order
		for(int i = str.length() - 1; i >= 0; i = i - 2)
		{
			
			if(i == str.length() - 1)
			{
				
				System.out.print(str.charAt(i));
				
			}
			
			else if(i == 0)
			{
				
				System.out.print(str.charAt(i));
				break;
				
			}
			
			else
			{
				
				System.out.print(str.charAt(i));
				
			}
			
			
		}//end for
		
		scan.close();
		
	}//end main

}//end class

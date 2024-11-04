package TemperatureConverter;

import java.util.Scanner;


public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pseudocode
		//1. ask the user what the temp is
		//2. convert to celsius
		//3. print the new temp in celsius
		Scanner tempGuy = new Scanner (System.in);
		System.out.println("Hey, it's kinda hot/cold in here. I'm a computer, why don't you tell me the temperature?");
		float theTemp = tempGuy.nextFloat();
		//this lets the user input the temperature as a whole number or decimal
		System.out.println("Let me convert that for you, since I work in Celsius.");
		float realTemp = ((theTemp - 32)*5/9);
		//this equation converts it from fahrenheit to celsius
		System.out.println("The real (celsius) temperature is around " + realTemp + " degrees.");
		//final print line
		tempGuy.close();
		//closes the scanner
	}

}

//Program By: Kara Ho


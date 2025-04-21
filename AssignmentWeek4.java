package Week4;

import java.util.*;

public class AssignmentWeek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.

//		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array. Print the result to the console. 
		int[] ages= {3, 9, 23, 64, 2, 8, 28, 93};
		
		int lastElement=ages[ages.length-1];
		int newElement=lastElement-ages[0];
		ages[(ages.length-1)] = newElement;
		for (int i = 0; i < ages.length; i++) {
			  System.out.println(ages[i]);
			}
		
		//Create a new array of int called ages2 with 9 elements
		int[] ages2 = new int[9];
		ages2[0]=48; ages2[1]=89; ages2[2]=25;
		ages2[3]=16; ages2[4]=72; ages2[5]=30;
		ages2[6]=64; ages2[7]=18; ages2[8]=54;
		
		//subtract the value of the first element in the new array ages2 from the last element of ages2
		ages2[(ages2.length-1)] = ages2[ages2.length-1]-ages2[0];
		
		//Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.
		
		double sum = 0;
		for (int age : ages2) {
			  sum += age;
			}
		double average = sum / ages2.length;
			  System.out.println(average);
			  
		String[] names= new String[6];
		names[0]="Sam"; names[1]="Tommy"; names[2]="Tim";
		names[3]="Sally"; names[4]="Buck"; names[5]="Bob";
		
		//calculate the average number of letters per name
		int add=0;
		for (int i = 0; i < names.length; i++) {
			add+=names[i].length();
		}
		double aver= add/names.length;
		System.out.println(aver); //unsure why it doesn't show 3.83
		
		//concatenate all the names together, separated by spaces
		String output="";
		for (String str :names) {
			output=output+str+ " ";
		}
		//print the result to the console.
		System.out.println(output);
		
		//How do you access the last element of any array
		//To access the element stored in the last position
		//take the array length and subtract 1
		System.out.println(names[names.length-1]);
		
		//How do you access the first element of any array?  
		//Call the first element [0]
		System.out.println(names[0]);
		
		//Create a new array of int called nameLengths
		int[] nameLengths = new int[names.length];
		//iterate over the previously created names array and add the length of each name to the nameLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i]=names[i].length();
		}
		//iterate over the nameLengths array and calculate the sum of all the elements in the array
		int add1=0;
		for (int i = 0; i < nameLengths.length; i++) {
			add1+=nameLengths[i];
		}
		//Print the result to the console.
		System.out.println(add1);
		
		//returns the word concatenated to itself n number of times.
		Scanner in= new Scanner(System.in);
		System.out.println("Enter word: ");
		String word=in.nextLine();
		System.out.println("Enter number of times: ");
		int n= in.nextInt();
		strConcat(word, n);
		
		//return a full name
		System.out.println(fullname());
		
		System.out.println(sum100());
		
		double[] dArray= {10.5, 4.32, 5.9, 7, .75};
	
		double arrAvg= dAvg(dArray); 
		System.out.println(arrAvg);
		
		double[] Array1= {8.2, 3.9, 7.1};
		double[] Array2 = {9.3, .25, 5.6};
		
		boolean Array1greater = compareTwo(Array1, Array2);
		System.out.println(Array1greater);
		
		//returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean thirsty=willBuyDrink(false, 11.0);
		System.out.println(thirsty);
		
		//convert imperial height to metric
		System.out.println("Enter height feet: ");
		double heightFeet=in.nextDouble();
		System.out.println("Enter height inches: ");
		double heightInches=in.nextDouble();
		
		returnMetric(heightFeet, heightInches);
}
	//Write a method that takes a String, word, and an int, n, as arguments
	static void strConcat(String word, int n) {
		String word1="";
		for (int i=0; i<n; i++) {
			word1+=word;
		}
		
		System.out.println(word1);
	}
	
	//Write a method that takes two Strings, firstName and lastName, and returns a full name 
	static String fullname() {
		StringBuilder stringBuilder = new StringBuilder();
		String firstName="John";
		String lastName="Smith";
		stringBuilder.append(firstName);
		stringBuilder.append(" ");
		stringBuilder.append(lastName);
		return stringBuilder.toString();
	}
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sum100() {
		//array of int
		int[] numbers= {10, 25, 6, 71, 44, 83};
int sum1=0;
for (int number : numbers) {
	sum1+=number;
}
		if (sum1>100) {
			return true;
		} return false;
	}
	
//Write a method that takes an array of double and returns the average of all the elements in the array.
	static double dAvg(double[] dArray) { 
		double result = 0;
		for (int i=0; i<dArray.length; i++) {
			result+=dArray[i];
		}
		return result/dArray.length;
	}
	//Write a method that takes two arrays of double
	static boolean compareTwo(double[] Array1, double[] Array2) {
		double result=0;
		for (int i=0; i<Array1.length; i++) {
			result+=Array1[i];
			double avg=result/Array1.length;
		}
		double result1=0;
		for (int i=0; i<Array2.length; i++) {
			result1+=Array2[i];
			double avg=result1/Array2.length;
		}
		if (result>result1) {
			return true;
		} return false;
	}
	
	//Write a method called willBuyDrink that takes a boolean isHotOutside, 
	//and a double moneyInPocket, and returns true if it is hot outside and if 
	//moneyInPocket is greater than 10.50.
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket>10.5;
	}
	//Convert height in imperial to metric
	//in case you visit a different country
	static void returnMetric(double heightFeet, double heightInches) {
		double sumInches=(heightFeet*12)+heightInches;
		double metric=(sumInches*2.54)/100;
		System.out.println("Your height in meters: " +metric);
	}
}

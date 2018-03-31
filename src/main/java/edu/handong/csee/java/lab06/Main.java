package edu.handong.csee.java.lab06; //package, edu.handong.csee.java.lab06 
import java.util.Scanner; //java.util.Scanner

/**
 * main class of edu.handong.csee.java.lab06
 */
public class Main {
	/**
	 *
	 *main function, input houseVolume and startPopulation, display final result  
	 **/
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in); //make object scanf of Scanner
		CalculateRoach calro = new CalculateRoach(); // make object calro of CalulateRoach
		
		System.out.println("Enter the total volume of your house "); //ouput, Enter the total volume of your house 
		System.out.println("in cubic feet: "); //ouput in cubic feet:
		calro.houseVolume=scanf.nextInt();//input input value to calro.houseVolume
		System.out.println("Enter the estimated number of "); //output, Enter the estimated number of 
		System.out.println("roaches in your house: "); //output, roaches in your house:
		calro.startPopulation=scanf.nextInt();//save calro.startPopulation
		
		calro.CalRoach(); //calculate CalRoach
		
		System.out.println("Starting with a roach population of "+calro.startPopulation); //output,Starting with a roach population of +calro.startPopulation 
		System.out.println("and a house with a volme of "+calro.houseVolume +" cubic feet,"); //ouput, and a house with a volme of +calro.houseVolume + cubic feet
		System.out.println("after "+ calro.countWeeks+" weeks,"); //output,after + calro.countWeeks+ weeks
		System.out.println("the house will be filled with "+Math.round(calro.population)+" roaches"); //output,the house will be filled with +calro.population+ roaches 
		System.out.println("They will fill a volume of "+Math.round(calro.totalBugVolume)+" cubic feet"); //output, They will fill a volume of +calro.totalBugVolume + cubic feet
		System.out.println("Better call Debugging Experts Inc."); //output, Better call Debugging Experts Inc.
	}

}
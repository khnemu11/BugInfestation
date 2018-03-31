package edu.hadong.csee.java.lab06; //package, edu.handong.csee.java.lab06 

/**
 * class that has method that can calculate several bugsvolume
 */
public class CalculateRoach {
	int houseVolume; //volume of the house
	int startPopulation; //initial number of roaches
	int countWeeks; //week counter
	double GROWTH_RATE= 0.95; //weekly growth rate of the roach population (a constant 0.95)
	double ONE_BUG_VOLUME=0.002; //volume of an average roach (a constant 0.002)
	double population; //current number of roaches
	double totalBugVolume; //total volume of all the roaches
	double newBugs; //number of roaches hatched this week
	double newBugVolume; //volume of new roaches
	
	/**
	 * method that calculates several bugsvolume
	 */
	
	public void CalRoach(){
		population=startPopulation; //initial population to startPopuation
		totalBugVolume = population * ONE_BUG_VOLUME; // initial totalBugVolume
		countWeeks = 0; // initial counweeks
		
		while (totalBugVolume < houseVolume) // repeat under until when totalBugVolume is smaller than houseVolume 
		{
			newBugs = population * GROWTH_RATE; //calculate newBugs
			newBugVolume = newBugs * ONE_BUG_VOLUME;//calculate newBugVolume
			population = population + newBugs;// calculate population
			totalBugVolume = totalBugVolume + newBugVolume;// calculate totalBugVolume
			countWeeks = countWeeks + 1; //calculate countWeeks
		}
	}
}
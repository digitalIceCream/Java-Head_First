/*
Author:			John-Philipp Vogt
Date:			2024-
Synopsis:		
Filename:		
*/

public class PhraseOMatic {
	public static void main(String[] args) {
		String[] wordListOne = {"agnostic" , "opinionated", "voice activated", "haptically driven", "AI enabled", "extensible",
			"voice activated", "agent based", "functional", "strongly typed"};

		String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "modular", "event driven", "pub-sub", "IoT", "cloud native", 
			"service oriented", "containerised", "headless", "serverless", "microservices", "distributed ledger"};

		String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture",
			"perspective", "design", "framework", "orientation" };

		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		java.util.Random randomGenerator = new java.util.Random();

		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("What we need is a " + phrase);

		}
}
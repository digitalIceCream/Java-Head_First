/*
Author:			John-Philipp Vogt
Date:			2024-01-30
Synopsis:		That classic children's favourite...
Filename:		
*/

public class BottleSong {
	public static void main(String[] args) {
		int bottlesNum = 10;
		String word = "bottles";

		while (bottlesNum > 0) {
			if (bottlesNum == 1){
				word = "bottle"; // ONE bottle
			}

			System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
			System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
			System.out.println("And if one green bottle should accidentall fall,");
			bottlesNum = bottlesNum - 1;

			if (bottlesNum > 0) {
				System.out.println("There'll be " + bottlesNum +
						   " green " + word + ", hanging on the wall");
			} else {
				System.out.println("There'll be no green bottles, haning on the wall");
			}
		}
	}
}


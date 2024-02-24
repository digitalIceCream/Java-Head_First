/*
Author:			John-Philipp Vogt
Date:			2024-
Synopsis:		
Filename:		
*/

import java.util.Scanner;

public class GameHelper {
	public int getUserInput(String prompt) {
		System.out.print(prompt + ": ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}

package Desai_project1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		int thirdDigit, fourthDigit, firstDigit, secondDigit;
		System.out.println("Enter encrypted four-digit integer (space inbetween please): ");
		thirdDigit = scnr.nextInt();
		fourthDigit = scnr.nextInt();
		firstDigit = scnr.nextInt();
		secondDigit = scnr.nextInt();

		thirdDigit = (thirdDigit+3)%10;
		fourthDigit = (fourthDigit+3)%10;
		firstDigit = (firstDigit+3)%10;
		secondDigit = (secondDigit+3)%10;

		System.out.println(""+ firstDigit +" "+ secondDigit +" "+ thirdDigit +" "+ fourthDigit);

	}

}
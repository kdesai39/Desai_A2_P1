package Desai_project1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);

		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		System.out.println("Enter your four-digit integer (space inbetween please): ");
		firstDigit = scnr.nextInt();
		secondDigit = scnr.nextInt();
		thirdDigit = scnr.nextInt();
		fourthDigit = scnr.nextInt();
		
		firstDigit = (firstDigit+7)%10;
		secondDigit = (secondDigit+7)%10;
		thirdDigit = (thirdDigit+7)%10;
		fourthDigit = (fourthDigit+7)%10;
		
		System.out.println(""+ thirdDigit +" "+ fourthDigit +" "+ firstDigit +" "+ secondDigit);
		
	}

}
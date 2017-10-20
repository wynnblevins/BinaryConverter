package com.wynnblevins.binaryConverter;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.wynnblevins.binaryConverter.service.BinaryConversionService;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryConversionService converter = new BinaryConversionService();
		
		try {
			System.out.print("Enter an integer: ");
			int inputInt = scanner.nextInt();
			String binaryString = converter.convertToBinary(inputInt);
			System.out.println("Result of converting to binary is " + binaryString);
			int numericResult = converter.convertFromBinary(binaryString);
			System.out.println("Result of converting back from binary is " + numericResult);
		} catch (InputMismatchException ime) {
			System.out.println("Input mismatch exception occured.");
		} catch (NoSuchElementException nse) {
			System.out.println("No such element exception occured.");
		} catch (IllegalStateException ise) {
			System.out.println("Illegal state exception occured.");
		}
		
		scanner.close();
	}
}

package com.wynnblevins.binaryConverter.service;

public class BinaryConversionService {
	public String convertToBinary(int number) {
		return Integer.toBinaryString(number);
	}
	
	public int convertFromBinary(String binaryString) throws NumberFormatException {
		int result = 0;
		
		try {
			result = Integer.parseInt(binaryString, 2);
		} catch (NumberFormatException nfe) {
			throw nfe;
		}
		
		return result;
	}
}

package com.careerit.cj.oops.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionTypesExamples {

	public static void main(String[] args) {

		try {
			readFileData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
	
	public static void readFileData() throws IOException {
	
			Files.readAllLines(Paths.get("hello.txt"));
		
	}
	
	/*
	 * try
	 * catch
	 * throws 
	 * throw
	 * finally
	 */
	
}

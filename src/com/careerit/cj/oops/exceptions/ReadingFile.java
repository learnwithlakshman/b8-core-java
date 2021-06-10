package com.careerit.cj.oops.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {

	public static void main(String[] args) {

		redadDataFromFile("accounts.csv");

	}

	private static List<String> redadDataFromFile(String fileName) {
		List<String> list = new ArrayList<>();
		try (FileReader fr = new FileReader(new File(fileName));BufferedReader br=new BufferedReader(fr);){
			String str = null;
			while ((str = br.readLine()) != null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {	
			e.printStackTrace();
		}	
		return list;
	}
}

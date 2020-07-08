package edu.learn.java;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TextReader {

	String fileName = null;

	public TextReader(String filepath) {
		this.fileName = filepath;
	}

	public String readFile() {
		String line = null;
		String newLine = System.lineSeparator();
		String finalText = null;

		FileReader file;
		try {
			file = new FileReader(fileName);
			BufferedReader St = new BufferedReader(file);
			StringBuffer sb = new StringBuffer();
			
			while((line = St.readLine()) != null) {
				sb.append(line + newLine);
			}
			finalText = sb.toString();
			St.close();
			file.close();

		} catch (Exception e) {

			System.out.println("Error : e");
			
		}
       return finalText;
	}
	public void writeFile(String inputData) {
	
	try {
		FileWriter write = new FileWriter(fileName);
		BufferedWriter bf = new BufferedWriter(write);
		bf.write(inputData);
		bf.close();
		
	}catch(Exception e) {
		System.out.println("Error : e");
	}
	
	}
	}



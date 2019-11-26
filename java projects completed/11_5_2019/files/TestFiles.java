package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;

public class TestFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("textFile.txt");
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		
		try(PrintWriter outStream = new PrintWriter(file);){
			outStream.print("John T Smith ");
			outStream.println(90);
			outStream.print("Eric k Jones ");
			outStream.print(85);
		}
		//PrintWriter class for writing text data to a file.
		//Use the Scanner class for reading text data from a file
		// Read text data from a file
		Scanner inCharStream = new Scanner(new File("textFile.txt"));
		while(inCharStream.hasNext()) {
			String firstName = inCharStream.next();
			String middle = inCharStream.next();
			String lastName = inCharStream.next();
			int score = inCharStream.nextInt();
			System.out.println(firstName + " " + middle + " " +lastName + " " + score);
		}
		inCharStream.close();
		
		System.out.println("-----------------------------------------------------");
		//https://liveexample.pearsoncmg.com/data/Lincoln.txt
		String URLString = "https://liveexample.pearsoncmg.com/data/Lincoln.txt";
		File file3 = new File("webFile.txt");
		try {
			PrintWriter outToFile = new PrintWriter(file3);
			URL url = new URL(URLString);
			Scanner input = new Scanner(url.openStream());
			int count = 0;
			while(input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
				outToFile.println(line);
				System.out.println(line);
			}
			System.out.println("The file size is " + count + " characters");
			input.close();
			outToFile.close();
		}
		catch(MalformedURLException ex) {
			System.out.println("Invalis URL");
		}
		
		catch(IOException ex) {
			System.out.println("An I/O exception of some sort has occurred");
		}
		
		
		
	}
}

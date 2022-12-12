package extrovert;

import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

// Team 4: Freda Mensah
// Sheila Le
// Kamron Bilyou
public class Extrovert 
{
	File file = new File("questions2.txt");
	String[] questions = new String[40];
	boolean read = false; // Read file or not
	int index = 0;        // Index of position in questions.txt
	int introvertPercent = -20, extrovertPercent = 0;
	
	public void readFile()
	{
		try (Scanner fileReader = new Scanner(file))
		{
			int i = 0;
			
			while (fileReader.hasNextLine()) 
			{
				questions[i] = fileReader.nextLine();
				i++;
		    }			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void getAnswer(int answer)
	{
		if (answer == 1) extrovertPercent += 20;
		else if (answer == 2) introvertPercent += 20;
	}
	
	public String printQuestions()
	{
		String question = "";
		
		for (int i = 0; i < 4; i++) 
		{
			question += "" + questions[index] + "\n";
			index++;
		}
		question += "Please provide your answer\n";
		
		return question;
	}
	
	public String intro()
	{
		if (!read) 
		{
			readFile();
			read = true;
		}
		
		return "This program processes will ask you a series of questions.\n"
				+ "Your answers will be recorded to determine your percentage of being an introvert or extrovert.\n";
	}
	
	public String result(int answer)
	{
		getAnswer(answer);
		
		return "Based off questions 1 to 5 you are " + introvertPercent + "% introvert and " + extrovertPercent + "% extrovert.";
	}
	
	public String start(int answer) 
	{
		getAnswer(answer);
		
		return printQuestions();
	}
}

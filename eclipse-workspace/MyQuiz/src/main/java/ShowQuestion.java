

import java.awt.Choice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;



public class ShowQuestion {
	private ArrayList<Question> questions = new ArrayList<Question>();
	
	
	public ShowQuestion() {
		try {
			FileReader file = new FileReader("C:\\Users\\forog\\eclipse-workspace\\Quiz\\src\\main\\resources\\question.text");
			BufferedReader bf = new BufferedReader(file);
			Scanner scan = new Scanner(bf);
			
			String line;
			String question = "";
            String[] choice = null;
            int answer = 0;
            int numberOfChoice = 0;
            int counter = 0;
            
            
            
            do {
            	
            	do {
            		line = scan.nextLine();
            		//store question
            		if(line.contains("?")) {
            			question = line;
            			//store number of choices
            		}else if(counter == 0 && line.length() ==1) {
            			numberOfChoice = Integer.valueOf(line);
            			choice = new String[numberOfChoice];
            		//store choices	
            		}else if(line.contains(")")){
            			
            			
            			choice[counter++]=line;
            			
            			//System.out.println("Test Arrays: " + Arrays.toString(choice));
            			
            		}
            		//store the answers
            		else if(Character.isDigit(line.indexOf(0)) || counter == numberOfChoice) {
            			answer = Integer.valueOf(line);
            			
            		}
            			
					
				} while (answer == 0);
            	questions.add(new Question(question, choice, answer));
            	numberOfChoice =0;
            	counter = 0;
            	answer = 0;
            	
            	Collections.shuffle(questions,new Random());
            	
            	
				
			} while (scan.hasNext());
            
            file.close();
            bf.close();
            scan.close();
          
            
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Question> getQuestions()  {
		return questions;
		}
	
	
	//start the game
	
		public void startMyTest() {
			
			
			Scanner myscan = new Scanner(System.in);
			
			int myScore = 0;
			
			for(int question=0; question<questions.size(); question++) {
				
				System.out.println(questions.get(question).getQuestion());
				
				int numChoice = questions.get(question).getChoices().length;
				
				
				//show choices from question in Question
				for(int choice =0;choice <numChoice;choice++) {
					System.out.println("answer " + (choice + 1) + " : "+
							questions.get(question).getChoices());
				
							
							//questions.get(question).getChoices());
					
							//Arrays.deepToString(questions.get(question).getChoices());
					
					
					
				 }
				
				//player insert the correct answer
				int playAnswer = myscan.nextInt();
				
				//choice set for that potcular question
				
				ArrayList<Choice> choiceSet= questions.get(question).getMychoices();
				//String[] choiceSet = questions.get(question).getChoices();
				
				
				//save the answer for that question to choiceSet
				
				int correctAnswer = questions.get(question).getAnswer();
				
				
				
				int correctAnswerIndex=choiceSet.indexOf(correctAnswer);
				
				if(playAnswer == correctAnswerIndex+1) {
					myScore++;
				}
				
				
				}
			myscan.close();
			System.out.println("You got : " + myScore + " Correct Answer");
			
			}
		
	
	

}

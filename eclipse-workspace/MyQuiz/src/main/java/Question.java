

import java.awt.Choice;
import java.util.ArrayList;


public class Question {
	
	private String question;
	
	private String[] choices;
	private int answer;
	private ArrayList<Choice> mychoices = new ArrayList<Choice>();
	

	public ArrayList<Choice> getMychoices() {
		return mychoices;
	}


	public Question(String question, String[] choices, int answer) {
		super();
		this.question = question;
		this.choices = choices;
		this.answer = answer;
	}





	public String getQuestion() {
		return question;
	}
	

	public String[] getChoices() {
		return choices;
	}


	public int getAnswer() {
		return answer;
	}
	

	
	public String toString() {
		String print = question + "\n";
		for(String choice: choices) {
			print += choice + "\n";
			}
		print += answer + "\n";
		
		return print;
		
	}
	
	

}

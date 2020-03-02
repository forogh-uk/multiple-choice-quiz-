package myQuiz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;




class ShowQuestionTest {
	//create a local instance
	ShowQuestion showQuestion;
	TestInfo testInfo;
	TestReporter testReporter;
	
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo=testInfo;
		this.testReporter =testReporter;
		showQuestion = new ShowQuestion();
	}

	@Test
	@DisplayName("Testing startMyTest")
	void startMyTest() {
		System.out.println("Reporting: "+ testInfo.getDisplayName());
		String question ="What is H20?";
		int answer = 2;
		
		
		
		
	}

}

package com.careerit.cj.collection.setex;

import java.util.ArrayList;
import java.util.List;

class Question {
	private int id;
	private String qdata;
	private List<String> options;
	private int answer;

	Question(int id, String qdata, List<String> options, int answer) {
		super();
		this.id = id;
		this.qdata = qdata;
		this.options = options;
		this.setAnswer(answer);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQdata() {
		return qdata;
	}

	public void setQdata(String qdata) {
		this.qdata = qdata;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}

public class QuizManager {

	public static void main(String[] args) throws InterruptedException {

		List<Question> questions = loadQuestionsFromFile();
		startQuiz(questions);
	}

	private static void startQuiz(List<Question> questions) throws InterruptedException {
		//Logic to start quiz
		List<Integer> userReponse = new ArrayList<>();
		computeResult(questions,userReponse);
	}

	private static void computeResult(List<Question> questions, List<Integer> userReponse) {
			int ccount = 0;
			int wcount = 0;
			
			System.out.println("Total Questions :"+questions.size());
			System.out.println("Wrongs          :"+wcount);
			System.out.println("Rights          :"+ccount);
			
			// Show Result pass or fail 
			
	}

	private static List<Question> loadQuestionsFromFile() {
		List<Question> questions = new ArrayList<Question>();
		//Load question from file (questions.txt)
		return questions;
	}
}

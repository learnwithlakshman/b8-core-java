package com.careerit.cj.collection.setex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.platform.commons.util.RuntimeUtils;

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
		System.out.println("Please wait your quiz is being preparing..... ");
		TimeUnit.SECONDS.sleep(3);
		Scanner sc = new Scanner(System.in);
		for(Question q:questions) {
			System.out.println(q.getId()+".");
			System.out.println(q.getQdata()+"\n");
			List<String> list = q.getOptions();
			for(int i=0;i<list.size();i++) {
				System.out.println((i+1)+". "+list.get(i));
			}
			System.out.println("Enter your answer:(ex 1,2 3,4)");
			int response = sc.nextInt();
			userReponse.add(response);
		}
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
		
		try {
			List<String> list = Files.readAllLines(Paths.get("questions.txt"));
			int totalQuestions = list.size() / 7;
			int end = 7;
			int start = 0;
			for(int i=1;i<=totalQuestions;i++) {
				List<String> qlist = list.subList(start,end);
				int qid = Integer.parseInt(qlist.get(0).substring(1));
				String qdata = qlist.get(1);
				List<String> options = qlist.subList(2, qlist.size()-1);
				int answer = Integer.parseInt(qlist.get(qlist.size()-1).split(":")[1].trim());
				Question question = new Question(qid, qdata, options, answer);
				questions.add(question);
				start = end;
				end = end + 7;
			}
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return questions;
	}
}

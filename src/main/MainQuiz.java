package main;

import java.util.Scanner;

public class MainQuiz
{
	public static void main (String[] args)
	{
		QuizQuestion[] quiz;
		int[] answers;
		int score;
		
		System.out.println("Welcome to your mathematics quiz!");
		
		quiz = createQuiz();
		answers = takeQuiz(quiz);
		score = gradeQuiz(quiz, answers);
		
		System.out.println("Your score was " + score);
		printCorrections(quiz, answers);
		
	}
	
	/***
	 * This method creates the quiz for the user
	 * @returns the quiz the user will take
	 */
	public static QuizQuestion[] createQuiz()
	{
		QuizQuestion[] quiz = new QuizQuestion[10]; 
		QuizQuestion question;
		int randomInt;
		
		for(int i=0; i<5; i++)
		{
			randomInt = (int)(Math.random()*10);
			
			if(randomInt > 5)
				question = new AdditionQuestions();
			else
				question = new SubtractionQuestion(); 
			
			quiz[i] = question;
		}
		
		for(int i=5; i<10; i++)
		{
			randomInt = (int)(Math.random()*10);
			
			if(randomInt > 5)
				question = new MultiplicationQuestion();
			else
				question = new DivisionQuestion();
			
			quiz[i] = question;
		}
		
		return quiz;
	}
	
	/***
	 * This method gets the answers from the user
	 * @param quiz this is the quiz the user takes
	 * @returns the answers from the user in an array
	 */
	public static int[] takeQuiz(QuizQuestion[] quiz)
	{
		Scanner s = new Scanner(System.in);
		int[] answers;
		int question;
		
		answers = new int[quiz.length];
		for(int i=0; i<quiz.length; i++)
		{
			System.out.println();
			question = i+1;
			System.out.println("Question " + question + ":");
			System.out.println(quiz[i].getQuestion());
			answers[i] = s.nextInt();
		}
		
		s.close();
		return answers;
	}
	
	/***
	 * This method grades the quiz
	 * @param quiz the quiz that was taken
	 * @param answers the answers from the user
	 * @returns the score on the test out of 100
	 */
	public static int gradeQuiz(QuizQuestion[] quiz, int[] answers)
	{
		int score;
		
		score = 0;
		for (int i=0; i<quiz.length; i++)
		{
			if(quiz[i].getAnswer() == answers[i])
				score += 10;
		}
		
		return score;
	}
	
	/***
	 * This method prints out the corrections from the quiz
	 * @param quiz needs the quiz that was taken
	 * @param answers needs the users answers
	 */
	public static void printCorrections(QuizQuestion[] quiz, int[] answers)
	{	
		int question;
		
		for (int i=0; i<quiz.length; i++)
		{
			if(quiz[i].getAnswer() != answers[i])
			{	
				System.out.println();
				question = i+1;
				System.out.println("Question " + question + " is incorrect");
				System.out.println(quiz[i].getQuestion());
				System.out.println("Correct answer: " + quiz[i].getAnswer());
			}
		}
		
	}
}

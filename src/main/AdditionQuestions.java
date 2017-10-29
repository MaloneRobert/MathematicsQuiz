package main;

/**
 * This is the simple addition question. You can get the question in
 * the form of a string, and also get the answer in a form of an integer. 
**/
public class AdditionQuestions implements QuizQuestion
{
	private int a;
	private int b;
	private String question;

	public AdditionQuestions ()
	{
		a = (int)(Math.random() * 20) + 1;
		b = (int)(Math.random() * 20) + 1;
	}

	public String getQuestion()
	{
		question = "What is " + a + " + " + b + " ?";
		return question;
	}

	public int getAnswer()
	{
		return a + b;
	}
}

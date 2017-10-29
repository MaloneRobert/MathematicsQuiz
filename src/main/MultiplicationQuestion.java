package main;

/**
 * This is the simple multiplication question. You can get the question in
 * the form of a string, and also get the answer in a form of an integer.
**/
public class MultiplicationQuestion implements QuizQuestion
{
	private int a, b;
	private String question;

	public MultiplicationQuestion()
	{
		a = (int)(Math.random() * 10) + 1;
		b = (int)(Math.random() * 10) + 1;
		question = "What is " + a + " * " + b + " ?";
	}


	public String getQuestion()
	{
		return question;
	}

	public int getAnswer()
	{
		return a * b;
	}
}

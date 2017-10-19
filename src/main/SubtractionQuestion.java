package main;

public class SubtractionQuestion implements QuizQuestion
{
	private int a, b, temp; 
	private String question;
	
	public SubtractionQuestion()
	{
		a = (int)(Math.random() * 10) + 1;
		b = (int)(Math.random() * 10) + 1; 
		if(a < b)
		{
			temp = a; 
			a = b; 
			b = temp;
		}
		question = "What is " + a + " - " + b + " ?";
		
	}
	
	
	public String getQuestion()
	{
		return question;
	}
	
	public int getAnswer()
	{
		return a - b;
	}
}

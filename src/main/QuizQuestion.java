package main;

/**
 * This interface is implemented by all the different types of mathematical
 * questions that the quiz may require. This allows the program to change easily
 * if I wanted to add more types of questions. 
**/
public interface QuizQuestion
{
	public String getQuestion();
	public int getAnswer();
}

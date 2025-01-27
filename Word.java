import java.util.List;
import java.util.ArrayList;

public class Word
{
	//Instance field
	private String word;

	//Class field
	private static final String VOWELS = "AEIOUaeiou";   //static means only one

	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{

		int count = 0;
		//Loop for every letter in "word"

			//Use indexOf to see if the letter is in the string "vowels"
		for(int i = 0; i < word.length(); i++)
			if(VOWELS.indexOf("" + word.charAt(i)) != -1)
				count++;

		return count;
	}

	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}
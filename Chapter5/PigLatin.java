//********************************************************************
// PigLatin.java
//Author: Lewis/Loftus
//
// Driver to exercise the PigLatinTranslator class.
//********************************************************************
import cs1.Keyboard;
public class PigLatin
{
	//-----------------------------------------------------------------
	// Reads sentences and translates them into Pig Latin.
	//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		String sentence, result, another = "";
		do
		{
			System.out.println ();
			System.out.println ("Enter a sentence (no punctuation):");
			sentence = Keyboard.readString();
			System.out.println ();
			result = PigLatinTranslator.translate (sentence);
			System.out.println ("That sentence in Pig Latin is:");
			System.out.println (result);
		}
		while (another.equalsIgnoreCase("y"));
	}
}

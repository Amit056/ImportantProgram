package amit;

import java.util.HashSet;
import java.util.Set;

public class ReverseOfSentence {

	public static void main(String[] args) {
		String sentence= "dhoni is best is the best of the player";
		String[] part=sentence.split(" ");
		String s=" ";
		for(int i=0;i<part.length;i++)
		{
			s=part[i]+" "+s;

	   }
		s.trim();
		System.out.println(s);

}
}
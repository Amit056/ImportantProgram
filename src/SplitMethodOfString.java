package amit;

public class SplitMethodOfString {

	public static void main(String[] args) {
		String sentence= "dhoni is best the best player";
		String[] part=sentence.split(" ");
		for(int i=0;i<part.length;i++)
			System.out.println(part[i]);
		

	}

}

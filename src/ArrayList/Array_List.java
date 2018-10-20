package ArrayList;

import java.util.ArrayList;
public class Array_List {
	
	int vowelcount(String temp)
	{
		int count = 0;
		char[] stringToCharArray = temp.toLowerCase().toCharArray();
		ArrayList<Character> vowel =  new ArrayList<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		for(char c : stringToCharArray)
		{
			if(vowel.contains(c))
			{
				count++;
			}
		}
		return count;
	}
}  
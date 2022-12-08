public class satyam4
{
 
   static boolean isWordPresent(String sentence,String word)
   {
      word = transform(word);
      sentence = transform(sentence);
      String []s = sentence.split(" ");
 

    // To store the individual words of the sentence

    for ( String temp :s)

    {
 

        // Comparing the current word

        // with the word to be searched

        if (temp.compareTo(word) == 0)

        {

            return true;

        }

    }

    return false;
}
 

static String transform(String word) 
{ 

    return word.toUpperCase();
}
 
// Driver code

public static void main(String[] args)
{

    String s = "satyamskeegskggis";

    String word = "geeks";
 

    if (isWordPresent(s, word))

        System.out.print("Yes");

    else

        System.out.print("No");
}
}
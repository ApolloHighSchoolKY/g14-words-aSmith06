public class WordTester 
{

    public static void main(String[] args)
    {

        Word word = new Word("putrid");
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length of word = " + word.getLength());
        System.out.println(word + "\n");

        word.setWord("trouble");
        System.out.println("Num of vowels = " + word.getNumVowels());
        System.out.println("Length of word = " + word.getLength());
        System.out.println(word);
    }
}

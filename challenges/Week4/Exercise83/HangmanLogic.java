
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private static final int LOSINGFAULTAMOUNT = 12;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return LOSINGFAULTAMOUNT;
    }

    public void guessLetter(String letter) {
        if(this.guessedLetters.contains(letter)){
            return ;
        }

        if(!this.word.contains(letter)) {
            this.numberOfFaults++;
        }

        this.guessedLetters += letter;

    }

    public String hiddenWord() {

        int wordLength = this.word.length();
        int i = 0;
        String hidden = "";

        while (i < wordLength) {
            char c = word.charAt(i);
            String character = "" + c;

            if(guessedLetters.contains(character)){
                hidden += word.charAt(i);
            }else {
                hidden += "_";
            }
            i++;
        }

        return hidden;
    }
}

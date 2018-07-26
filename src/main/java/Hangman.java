

public class Hangman {
    private Console console = new Console();

    private Boolean areEqual(char[] xs, char[] ys) {
        for(int i=0; i<xs.length; i++) {
            if(xs[i] != ys[i]) return false;
        }

        return true;
    }

    /*
        A method which masks a word (i.e. replaces all characters with
        stars).
    */
    public char[] mask(char[] word) {
        char[] result = new char[word.length];

        for(int i=0; i<word.length; i++) {
            result[i] = '*';
        }

        return result;
    }

    public int unmask(char[] word, char[] guessed, char c) {
        int result = 0;

        for(int i=0; i<word.length; i++) {
            if(word[i] == c) {
                guessed[i] = c;
                result++;
            }
        }

        return result;
    }

    public void run() {
        // your program starts here
        console.print("Enter a word: ");
        char[] word = console.readLine().toCharArray();
        char[] guessed = mask(word);

        while(!areEqual(word, guessed)) {
            console.println(guessed);

            console.print("Enter a character: ");
            char guess = console.readChar();

            unmask(word, guessed, guess);

            if(areEqual(word, guessed)) {
                console.println("You did it!");
                break;
            }
        }

    }

    // extension: scoring
    // extension: AIs (in alphabetical order, in random order, no duplicates, dictionary)
}

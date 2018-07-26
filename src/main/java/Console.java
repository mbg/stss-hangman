import java.util.Scanner;

/*
*/
public class Console {
    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public String readLine() {
        return this.scanner.nextLine();
    }

    public char readChar() {
        String str = this.scanner.nextLine();
        return str.charAt(0);
    }

    public void print(String text) {
        System.out.print(text);
    }

    public void println(String text) {
        System.out.println(text);
    }

    public void println(char c) {
        System.out.println(c);
    }

    public void println(char[] cs) {
        System.out.println(cs);
    }
}

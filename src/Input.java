import java.util.Scanner;

public class Input {
    private String inputText;
    private int key;
    public Input(String inputText) {
        this.inputText = inputText;
    }

    public Input(int key) {
        this.key = key;
    }

    public String getInputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLase type your plain text.");
        inputText = scanner.nextLine();
        System.out.println("Your plain text to be encrypted is " + inputText);
        return inputText;
    }

    public int getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLase type secret key.");
        key = scanner.nextInt();
        return key;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        int i = 0;
        int numOfCharacters = this.length;

        String characters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";

        while (i < numOfCharacters) {
            int randomNumber = this.random.nextInt(characters.length());
            char symbol = characters.charAt(randomNumber);
            password += symbol;
            i++;
        }
        return password;
    }
}

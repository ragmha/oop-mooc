
public class Smileys {

    private static void printSmileys(int number) {
        for(int i = 0; i < number; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }

    private static String createMiddleString(String characterString) {
        String result = " " + characterString + " ";

        return characterString.length() % 2 == 1 ? result + " " :  result;
    }

    private static void printWithSmileys(String characterString) {
        String middleString = createMiddleString(characterString);
        int number = middleString.length() / 2 + 2;
        String smiley = ":)";

        printSmileys(number);
        System.out.println(smiley + middleString + smiley);
        printSmileys(number);
    }


    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("\\:D/");
    }

}

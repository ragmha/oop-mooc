
public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        word = word.trim().toLowerCase();
        searched = searched.trim().toLowerCase();

        return word.contains(searched);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Changer {
  private List<Change> changes = new ArrayList<Change>();

  public void addChange(Change change) {
    changes.add(change);
  }

  public String change(String characterString) {
    String word = characterString;

    for (Change change: changes) {
      word = change.change(word);
    }

    return word;
  }
}

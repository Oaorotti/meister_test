import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstTest {
    List<String> myList = new ArrayList<String>();

    FirstTest() {
        PopulateList();
    }

    public void PopulateList() {
        myList.add("Abobora");
        myList.add("Feijão");
        myList.add("Cachorro");
        myList.add("alcione");
        myList.add("angular");
        myList.add("ameixa");
        myList.add("apple");
        myList.add("Language");
        myList.add("arm");
        myList.add("aer");
        myList.add("Azu");
    }

    public List<String> ReturnListOfStrings() {
        return myList.stream()
                .filter(element -> element.contains("a") && element.length() == 3)
                .toList();
    }
}

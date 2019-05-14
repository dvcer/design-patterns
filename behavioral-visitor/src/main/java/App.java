import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<TextElement> list = new ArrayList<>();
        list.add(new Letter("A"));
        list.add(new Word("AGA"));
        list.add(new Sentence("AAA BBB CCC"));
        list.forEach(e->e.accept(new LetterCountVisitor()));
    }
}

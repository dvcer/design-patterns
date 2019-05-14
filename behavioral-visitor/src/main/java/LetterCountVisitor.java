import java.util.stream.Stream;

public class LetterCountVisitor implements Visitor {
    @Override
    public void visit(Letter letter) {
        System.out.println("Letter: " + letter.getContent() + ", length: 1");
    }

    @Override
    public void visit(Word word) {
        System.out.println("Word: " + word.getContent() + ", length: " + word.getContent().length());

    }

    @Override
    public void visit(Sentence sentence) {
        Integer count;
        String sentContent = sentence.getContent();
        count = Stream.of(sentContent.split(" ")).reduce(0, (acc, e) -> acc + e.length(), (x, y) -> x + y);
        System.out.println("Sentence: " + sentence.getContent() + ", length: " + count);
    }
}

public class Sentence extends TextElement {
    public Sentence(String content) {
        super(content);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

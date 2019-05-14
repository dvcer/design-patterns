public class Word extends TextElement {
    public Word(String content) {
        super(content);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

public class Letter extends TextElement {

    public Letter(String content) {
        super(content);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

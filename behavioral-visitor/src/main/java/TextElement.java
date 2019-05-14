public abstract class TextElement {
    private String content;

    public TextElement(String content) {
        this.content = content;
    }

    abstract void  accept(Visitor visitor);

    public String getContent() {
        return content;
    }
}

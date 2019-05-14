public interface Visitor {
    void visit(Letter letter);

    void visit(Word word);

    void visit(Sentence sentence);
}

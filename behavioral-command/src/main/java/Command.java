public abstract class Command {
    protected Editor editor;

    public Command(Editor editor) {
        this.editor = editor;
    }

    private String backup;

    protected void backup() {
        backup = editor.getText();
    }

    public void undo() {
        editor.setText(backup);
    }

    public abstract boolean execute();

}

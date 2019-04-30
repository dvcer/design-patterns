public class DeleteLastWordCommand extends Command {
    public DeleteLastWordCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        String text = editor.getText();
        String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length-1; i++) {
            builder.append(words[i]).append(" ");
        }
        builder.deleteCharAt(builder.length()-1);
        editor.setText(builder.toString());
        return true;
    }
}

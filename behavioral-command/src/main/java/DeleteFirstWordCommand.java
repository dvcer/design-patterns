public class DeleteFirstWordCommand extends Command {
    public DeleteFirstWordCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        String text = editor.getText();
        String[] words = text.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < words.length; i++) {
            builder.append(words[i]).append(" ");
        }
        builder.deleteCharAt(builder.length()-1);
        editor.setText(builder.toString());
        return true;
    }
}

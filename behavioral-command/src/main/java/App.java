public class App {
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        Editor editor = new Editor(history);
        editor.setText("pora domoi idti a ya tut siju");
        editor.execute(new DeleteFirstWordCommand(editor));
        editor.execute(new DeleteFirstWordCommand(editor));
        editor.undo();
        editor.undo();
        editor.undo();
        editor.execute(new DeleteLastWordCommand(editor));
        editor.execute(new DeleteFirstWordCommand(editor));
    }
}

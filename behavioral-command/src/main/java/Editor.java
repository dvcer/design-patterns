public class Editor {
    private String text;
    private CommandHistory history;

    public Editor(CommandHistory history) {
        this.history = history;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pollCommand().undo();
        }
        System.out.println(text);
    }

    public void execute(Command command) {
        boolean status = command.execute();
        if (status) {
            history.offerCommand(command);
        }
        System.out.println("status: " + status);
        System.out.println(text);
    }
}

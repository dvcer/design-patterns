public abstract class Template {
    void execute(){
        begin();
        middle();
        end();
    }

    private final void end() {
        System.out.println("END");
    }

    protected abstract void middle();

    private final void begin() {
        System.out.println("BEGIN");
    }
}

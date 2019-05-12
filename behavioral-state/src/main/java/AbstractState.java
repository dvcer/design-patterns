public abstract class AbstractState implements State {
    protected TurnStile turnStile;

    public AbstractState(TurnStile turnStile) {
        this.turnStile = turnStile;
    }

}

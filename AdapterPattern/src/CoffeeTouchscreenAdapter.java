public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine _oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldCoffeeMachine)
    {
        _oldCoffeeMachine = oldCoffeeMachine;
    }

    public void chooseFirstSelection()
    {
        _oldCoffeeMachine.SelectA();
    }

    public void chooseSecondSelection()
    {
        _oldCoffeeMachine.SelectB();
    }
}
package AbstractFactory;

public class MacFactory implements AbstractFactory{


    @Override
    public AbstractWindow createWindow() {
        return new MacWindow();
    }

    @Override
    public AbstractButton createbutton() {
        return new MacButton();
    }
}

package AbstractFactory;

public class MSFactory implements AbstractFactory{


    @Override
    public AbstractWindow createWindow() {
        return new MSWindow();
    }

    @Override
    public AbstractButton createbutton() {
        return new MSButton();
    }
}

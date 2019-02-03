package AbstractFactory;

public class Display {

    private AbstractButton button;
    private AbstractWindow window;

    Display(AbstractFactory factory){
        this.button = factory.createbutton();
        this.window = factory.createWindow();
    }

    @Override
    public String toString() {
        return this.window.getButtonType() + " " + this.button.getWindowType();
    }

    public static void main(String[] args) {

     Display display;
     String os = System.getProperty("os.name").toLowerCase();
     if(os.contains("mac"))
         display = new Display(new MacFactory());
     else
         display = new Display(new MSFactory());

        System.out.println(display.toString());
    }

}

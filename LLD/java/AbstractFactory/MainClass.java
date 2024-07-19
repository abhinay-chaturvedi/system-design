package AbstractFactory;

public class MainClass {
    public static void main(String args[]) {
        // GUIFactory factory = new WinFactory();
        // Button btn = factory.createButton();
        // btn.paint();
        String os = "windows";
        Application app;
        GUIFactory factory;
        if(os == "windows") {
            factory = new WinFactory();
            app = new Application(factory);
        } else {
            factory = new MacFactory();
            app = new Application(factory);
        }
        app.createButton();
        app.renderButton();
    }
}
class Application {
    private GUIFactory factory;
    private Button btn;
    Application(GUIFactory factory) {
        this.factory = factory;
    }
    void createButton() {
        btn = this.factory.createButton();
    }
    void renderButton() {
        btn.paint();
    }
}

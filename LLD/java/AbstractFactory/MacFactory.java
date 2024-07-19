package AbstractFactory;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createButton'");
        // System.out.println("Created button for Mac");
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createCheckbox'");
        System.out.println("Created checkbox for mac");
        return null;
    }
    
}

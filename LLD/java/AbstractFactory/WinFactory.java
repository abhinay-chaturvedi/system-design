package AbstractFactory;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createButton'");
        // System.out.println("Created button for windows");
        return new WinButton();
    }

    @Override
    public CheckBox createCheckbox() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'createCheckbox'");
        System.out.println("Created checkbox for windows");
        return null;
    }
    
}

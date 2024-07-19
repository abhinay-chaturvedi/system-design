package FactoryMethod;

public class WebDialog extends Dialog{
    
    @Override
    Button createButton() {
        return new HtmlButton();
    }
}

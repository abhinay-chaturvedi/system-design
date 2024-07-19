package FactoryMethod;

public class Dialog {
    
    Button createButton(){
        return null;
    };
    void render(String msg) {
        Button btn = createButton();
        btn.onClick(msg);
        btn.render();
    }
}

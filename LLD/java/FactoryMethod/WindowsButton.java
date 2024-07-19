package FactoryMethod;

public class WindowsButton implements Button {

    @Override
    public void onClick(String a) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'onClick'");
        System.out.println(a);
    }

    @Override
    public void render() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'render'");
        System.out.println("rendering windows button");
    }
    
}

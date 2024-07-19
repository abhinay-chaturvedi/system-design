package FactoryMethod;

public class HtmlButton implements Button {

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
        System.out.println("Rendering html button");
    }
    
}

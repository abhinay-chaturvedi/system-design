package DecoratorPattern;
import DecoratorPattern.BasePizza.*;
public class Main {

    public static void main(String args[]) {
        BasePizza pizza = new ExtraCheese(new FarmHouse());

        int cost = pizza.cost();
        System.out.println("cost is: "+ cost);
    } 
}


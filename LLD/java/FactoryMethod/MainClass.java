package FactoryMethod;

public class MainClass {
    public static void main(String args[]) {
        System.out.println("Calling main method!");
        String os = "windows";
        Dialog dialog;
        if(os == "windows") {
            dialog = new WindowsDialog();
        } else if(os == "linux") {
            dialog = new WebDialog();
        } else {
            dialog = null;
        }
        dialog.render(os);
    }
}

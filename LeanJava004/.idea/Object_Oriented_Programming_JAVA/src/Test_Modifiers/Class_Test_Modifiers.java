package Test_Modifiers;

public class Class_Test_Modifiers {

    public void printMessage1(){
        System.out.println("this method is public, so is accessible of any package");
    }

    void printMessage2(){
        System.out.println("this method is default, only accessible of your package");
    }

    private void printMessage3(){
        System.out.println("this method is private, only accessible of your class");
    }
    protected void printMessage4(){
        System.out.println("this method is protected, only accessible of your package ou subclass");
    }



}

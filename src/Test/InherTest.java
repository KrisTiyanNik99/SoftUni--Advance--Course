package Test;

abstract class InherTest extends ATest{

    @Override
    public void drive() {
        System.out.println("Drive!");
    }

    public void Scream(){
        System.out.println("AAAAAAAAAAAAAAA");
    }

    protected void Something(){
        System.out.println("Burger");
    }
}

package Test;

class AnotherTest extends ATest{
    @Override
    public void drink() {
        System.out.println("Another Drink");
    }

    @Override
    protected void drive() {
        System.out.println("Drive Golf 3!");
    }
}

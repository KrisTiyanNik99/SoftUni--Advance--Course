package Test;

class InherTestNotAbs extends InherTest{
    @Override
    protected void drink() {
        System.out.println("Drink");
    }

    @Override
    public void Something() {
        System.out.println("Water!");
    }
}

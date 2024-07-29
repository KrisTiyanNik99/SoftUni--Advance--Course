package Inheritance.playersandmonsters;

class MuseElf extends Elf {

    private int power;
//    public MuseElf(String username, int level) {
//        super(username, level);
//    }

    public MuseElf(int power) {
        this.power = power;
    }

    public MuseElf(){

    }

    public int getPower() {
        return power;
    }
}

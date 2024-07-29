package Inheritance.playersandmonsters;

class Elf extends Hero{
    private int Kills;
    public Elf(String username, int level) {
        super(username, level);
    }

    public Elf(int kills) {
        this("Merlin", 24);
        this.Kills = kills;
    }

    public Elf() {
        this(5);
    }

    public int getKills() {
        return Kills;
    }
}

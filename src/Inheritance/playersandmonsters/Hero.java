package Inheritance.playersandmonsters;

class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        setLevel(level);
    }

    private void setLevel(int level) {
        if (level < 10) {
            System.out.println("Week");
        }else {
            System.out.println("You are strong");
        }

        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return String.format("Type: %s Username: %s Level: %s",
                this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }

}

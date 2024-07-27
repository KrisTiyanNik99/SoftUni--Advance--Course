package Encapsulation.footballteamgenerator;

class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    private void setEndurance(int endurance) {
        setAttribute("Endurance", endurance);
    }

    private void setSprint(int sprint) {
        setAttribute("Sprint", sprint);
    }

    private void setDribble(int dribble) {
        setAttribute("Dribble", dribble);
    }

    private void setPassing(int passing) {
        setAttribute("Passing", passing);
    }

    private void setShooting(int shooting) {
        setAttribute("Shooting", shooting);
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (double) (endurance + sprint + dribble + passing + shooting) / 5;
    }

    private boolean validateStatusInput(int i) {
        return i < 0 || i > 100;
    }

    private void setAttribute(String attributeName, int value) {
        if (!validateStatusInput(value)) {
            switch (attributeName) {
                case "Endurance":
                    this.endurance = value;
                    break;
                case "Sprint":
                    this.sprint = value;
                    break;
                case "Dribble":
                    this.dribble = value;
                    break;
                case "Passing":
                    this.passing = value;
                    break;
                case "Shooting":
                    this.shooting = value;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid attribute: " + attributeName);
            }
        } else {
            System.out.println(attributeName + " should be between 0 and 100.");
        }
    }
}

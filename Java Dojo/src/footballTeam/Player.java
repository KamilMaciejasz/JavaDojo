package footballTeam;

public class Player {
    private String name;
    private Position position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    Player() {

    }

    Player(String name, Position position) {
        this.name = name;
        this.position = position;
    }

}

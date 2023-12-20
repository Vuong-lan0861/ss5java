package baitap2;

public class Player {
    private String playerCode;
    private String playerName;

    public Player() {
    }

    public Player(String playerCode, String playerName) {
        this.playerCode = playerCode;
        this.playerName = playerName;
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerCode='" + playerCode + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}

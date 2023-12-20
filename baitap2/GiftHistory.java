package baitap2;

public class GiftHistory {
    private String giftCode;
    private String playerName;

    public GiftHistory() {
    }
    public GiftHistory(String giftCode, String playerName) {
        this.giftCode = giftCode;
        this.playerName = playerName;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Override
    public String toString() {
        return "GiftHistory{" +
                "giftCode='" + giftCode + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}

package nl.duo.enums;

public class Person {
    private String name;
    private Season myFavoriteSeason;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Season getMyFavoriteSeason() {
        return myFavoriteSeason;
    }

    void setMyFavoriteSeason(Season myFavoriteSeason) {
        this.myFavoriteSeason = myFavoriteSeason;
    }
}

package nl.duo.enums;

public class Application {
    public static void main(String[] args) {
        Person ikke = new Person();
        ikke.setMyFavoriteSeason(Season.FALL);

        System.out.println(ikke.getMyFavoriteSeason());
        System.out.println("--------------------------------");

        for(Season season : Season.values()) {
            System.out.println(season);
        }
    }
}

package logic;

import data.Season;

import java.util.Scanner;

public class SeasonUtils {
    private SeasonUtils() {
    };

    public static void getSeasonInfoByPolishDescription() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz polską nazwę pory roku");
        String userInput = scanner.nextLine();
        Season season = Season.fromDescription(userInput);
        System.out.println("Wybrana pora roku: " + season);
        if (season != null) {
            String[] months = season.getMonths();
            System.out.println(season.getDescription() + " jest w miesiącach");
            for (String month : months) {
                System.out.println(month);
            }
        } else {
            System.out.println("Podana pora roku nie istnieje");
        }
    }
}

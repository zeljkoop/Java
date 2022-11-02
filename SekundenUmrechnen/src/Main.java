import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String eingabe;
        eingabe = new java.util.Scanner(System.in).nextLine();
        int sekundenEingabe = Integer.parseInt(eingabe);
        int stunden = sekundenEingabe / 3600;
        int minuten = (sekundenEingabe % 3600) / 60;
        int sekunden = sekundenEingabe % 60;

        System.out.println(stunden + ":" + minuten + ":" + sekunden);
    }
}
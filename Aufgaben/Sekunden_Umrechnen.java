import java.util.*;
public class Sekunden_Umrechnen {
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
	    	int seconds = in.nextInt();
        int S = seconds % 60;
        int H = seconds / 60;
        int M = H % 60;
        H = H / 60;
        System.out.print( H + ":" + M + ":" + S);
		System.out.print("\n");
    }
 }

/**
 * Schreiben Sie ein Java-Programm, das eine Anzahl von Sekunden einliest und in die Anzahl von Stunden, 
 * Minuten und Sekunden umrechnet und ausgibt. Die Eingabe 1234 soll also zur Ausgabe 0:20:34 führen. 
 * Testen Sie Ihr Programm mit vernünftigen Eingaben, zum Beispiel: 0, 59, 60, 100, 3600 und 4000.
 * Zeichnen Sie als Unterstützung zuerst ein Flussdiagramm.
 */
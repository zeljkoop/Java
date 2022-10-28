import java.util.Scanner;

public class folienaufgabe_1
{
    public static void main(String[] args) {
        String Eingabe1 = new java.util.Scanner(System.in).nextLine();
        String Eingabe2 = new java.util.Scanner(System.in).nextLine();
        float Wert1 = Float.parseFloat(Eingabe1);
        float Wert2 = Float.parseFloat(Eingabe2);
        System.out.println(Wert1 + Wert2);
        int ganzzahl = (int)Wert1;
        int ganzzahl2 = (int)Wert2;
        System.out.println(ganzzahl + ganzzahl2);
    }
}
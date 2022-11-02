public class Main {
    public static void main(String[] args) {

        System.out.println("Geben Sie bitte Ihren ersten Punkt an (x/y):");
        int x1 = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        int y1 = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        System.out.println("(" + x1 + "/" + y1 + ")");
        System.out.println("Dasselbe noch einmal für den zweiten Punkt:");
        int x2 = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        int y2 = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        System.out.println("(" + x2 + "/" + y2 + ")");
        float resultat = (float)Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
        System.out.println(resultat);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int broj = 0;
        boolean brojIspravan = false;

        do {
            try {
                System.out.print("Unesi cijeli broj: ");
                broj = Integer.parseInt(input.nextLine());
                if (broj <= 0) {
                    throw new NumberFormatException();
                } else {
                    faktorijelBroja(broj);
                    brojIspravan = true;
                }
            } catch (Exception e) {
                System.out.println("Unesen krivi format broja. Molim te, ponovi unos.");
            }
        } while (!brojIspravan);
        input.close();
    }

    public static void faktorijelBroja(int broj) {
        int faktorijelRezultat = 1;
        for (int i = 1; i <= broj; i++) {
            faktorijelRezultat *= i;
        }
        System.out.println("Faktorijel broja " + broj + " je " + faktorijelRezultat);
    }
}
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("vinter projekt");
        Scanner scan = new Scanner(System.in);
        System.out.println("namnge din tamagochi");
        scan.nextLine();
        String name;
        name = scan.nextLine();
        scan.nextLine();
        tamagochi tam = new tamagochi(name);
        tam.feed();
        tam.teach("hej");
        tam.Hi();
    }

}
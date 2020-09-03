package tictactoe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("---------");
        System.out.println("|" + input.substring(0,3).replace(""," ") + "|");
        System.out.println("|" + input.substring(3,6).replace(""," ") + "|");
        System.out.println("|" + input.substring(6,9).replace(""," ") + "|");
        System.out.println("---------");
    }
}

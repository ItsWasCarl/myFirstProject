import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i++) {
            for (int j = value; j >= 1; j--)
                if (i * j == value) {
                    System.out.println(i + " * " + j);
                }
            }
        }
    }

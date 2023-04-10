import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2== 1) {
            System.out.println("Ganjil");
        } else if (angka % 2== 0) {
            System.out.println("Genap");
        }
    }
}
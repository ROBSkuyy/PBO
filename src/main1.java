import java.util.Scanner;

public class main1 {

    public static void bilangan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2== 1) {
            System.out.println("Ganjil");
        } else if (angka % 2== 0) {
            System.out.println("Genap");
        }
    }
    public static void looping() {
        Scanner number = new Scanner(System.in);
        System.out.print("\nMasukkan bilangan ");
        int a = number.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " x " + i + " = " + (a * i) + "\n");
        }
    }
    public static void looping2(){
        Scanner number = new Scanner(System.in);
        System.out.print("\nMasukkan bilangan ");
        int a = number.nextInt();
        int i = 1;
        while(i <= 10 ){
            System.out.print(a + " x " + i + " = " + (a * i) + "\n");
            i++;
        }
    }
    public static void main(String[] args) {
//    bilangan();
//    looping();
//    looping2();
    }
    }
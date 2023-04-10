package Tokoku;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String user, password;
        int check = 2;

        Masuk user1 = new Masuk();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("......... MASUK .........");
            System.out.println("| Masukkan username : |");user = scanner.nextLine();
            System.out.println("| Masukkan password : |");password = scanner.nextLine();

            if (user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin()) ||
                user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user())){
                check = 0;
                if (user.equals(user1.getUsername_admin())){
                    System.out.println("Hallo Admin");
                }else if (user.equals(user1.getUsername_user())){
                    System.out.println("Hallo User");
                }
            }else{
                System.out.println("Username/Password anda salah!!");
            }
        }while (check == 2);
    }
}

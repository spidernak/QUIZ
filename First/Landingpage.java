package First;

import java.util.Scanner;

public class Landingpage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Menu;
        while(true){
        System.out.println("\n================Welcome to Typing Speed====================");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Reset Password");
        System.out.println("4. Typing");
        System.out.println("5. Result");
        System.out.println("6. Exit");
        System.out.println("===========================================================");
        System.out.print("Please choose one option: ");
        Menu = sc.nextLine();
        
        switch(Menu){
            case "1":
            Register.main(args);break; 
            case "2": 
            userlogin.main(args); break;
            case "3":
            ResetPw.main(args); break;
            case "4":
            usertyping.main(args); break;
            case "5":
            ResultList.main(args);break;
             
            case "6":
            System.out.println("Thank for your attention!");
            break;
        }
    }
    }
}

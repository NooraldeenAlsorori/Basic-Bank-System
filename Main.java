package sample;


import javafx.scene.layout.GridPane;

import java.util.Scanner;

public class Main  {



   static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        String ch;
        int f=1;
        while(f!=0) {
            System.out.println("للدخول الى قائمه ال Admin اكتب Admin ,,, للدخول الى قائمه ال User اكتب User ,,, للخروج اكتب Exit ");
            ch = in.next();
            System.out.println();
            switch (ch) {
                case "admin":
                case "ADMIN":
                case "Admin":
                    String x, y;

                    for (int i = 0; i < 3; i++) {

                        System.out.println(" ادخل اسم المستخدم  " + "المحاوله : " + (i + 1));
                        x = in.next();
                        System.out.println(" : ادخل كلمه المرور" + "المحاوله : " + (i + 1));
                        y = in.next();
                        if ((x.equals("Nour") || x.equals("nour") || x.equals("NOUR")) && y.equals("773090580")) {
                            Department d1 = new Department(123, "AAA");
                            Admin a1 = new Admin();
                            d1.add(a1);
                            Admin a2 = new Admin();
                            d1.add(a2);
                            break;
                        }


                        continue;


                    }
                    System.out.println("أنتهت المحاولات");
                    break;
                case "user":
                case "USER":
                case "User":
                    String un, up;
                    for (int i = 0; i < 3; i++) {

                        System.out.println(" ادخل اسم المستخدم  " + "المحاوله : " + (i + 1));
                        un = in.next();
                        System.out.println(" : ادخل كلمه المرور" + "المحاوله : " + (i + 1));
                        up = in.next();
                        if ((un.equals("Ammar") || un.equals("AMMAR") || un.equals("ammar")) && up.equals("777777777")) {
                            Department d1 = new Department("AAA",333);
                            Salaried_User s1 = new Salaried_User(1, "Ali", "Sanaa", "July", 775115602, 2000, 100, 600, Gender.Male);
                            d1.E_client_add(s1);
                            d1.PrintAllOfUser();
                            break;
                        }
                        continue;
                    }
                    System.out.println("أنتهت المحاولات");
                    break;
                case "exit":
                case "Exit":
                case "EXIT":
                    System.exit(0);
                default:
                    System.out.println("لم نستطيع فهم اختيارك الرجاء المحاوله اخرى ...");
                    break;
            }
            f++;
        }
















    }
}

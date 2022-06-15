package sample;

import java.util.Scanner;

/**
 * Created by Osama Jaber on 07/11/21.
 */
enum Gender{Male,Female}
public abstract class  Emp_User implements Team {
    private static double balance=100000,remain,amount,ree,receiver,receiver_balance;
    private static String receiver_name;
    private static int phone;
    private  String name , address , birthday ;
    protected   int id ;
    private int phoneNumber;
    private  Gender g;

    public Emp_User (int id , String name , String address , String birthday , int phoneNnubmer ,Gender g)  {
        this.id=id;

        this.name = name;
        this.address = address;
        this.birthday= birthday;
        this.phoneNumber = phoneNnubmer;
        this.g = g;
    }

    public  int getPhone() {
        return phone;
    }

    public  String getName() {
        return name;
    }

    public  String getAddress() {
        return address;
    }

    public  String getBirthday() {
        return birthday;
    }

    public  int getId() {
        return id;
    }

    public  int getPhoneNumber() {
        return phoneNumber;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  void setAddress(String address) {
        this.address = address;
    }

    public  void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public  void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


   public Emp_User () {
       double r = 0, ree = 0, re1 = 0;
       int choose, x = 1;
       Scanner in = new Scanner(System.in);

       while (x != 0) {
           System.out.println("$$__اختار نوع العملية الحسابية __$$");
           System.out.println("1- للسحب من الرصيد                  ");
           System.out.println("2- لايداع مبلغ الى الحساب            ");
           System.out.println("3- للتحويل الى حساب اخر             ");
           System.out.println("4- للاستعلام عن الرصيد الحالي         ");
           System.out.println("0- للخروج من قائمة العمليات الحسابية");
           choose = in.nextInt();

           switch (choose) {
               case 1:
                   r = sahb();
                   break;
               case 2:
                   ree = iedaa();
                   break;
               case 3:
                   re1 = send();
                   break;
               case 4:
                   remain = balance;
                   System.out.println("رصيدك الحالي = " + remain);
                   break;
               case 0:
                   x = 0;
                   break;

               default: {
                   System.out.println("_________________________");
                   System.out.println("Erorr erntring try agine");
                   System.out.println("_________________________");
               }
           }
       }

    }



    public static double send() {
        Scanner in=new Scanner(System.in);
        System.out.println("ادخل اسم المستلم");
        receiver_name=in.next();
        System.out.println("ادخل رقم الهاتف ");
        phone=in.nextInt();
        System.out.println("ادخل المبلغ المراد تحويله");
        amount=in.nextInt();
        if ( amount<=100000)
            if (amount<= balance )
            {balance=balance-amount;
                receiver_balance=receiver_balance+amount;
                System.out.println("__________________");
                System.out.println("تمت العملية بنجاح ");
                System.out.println("__________________");}
            else {
                System.out.println("___________________________________________");
                System.out.println("المبلغ المراد تحويله اكبر من الرصيد الحالي ");
                System.out.println("___________________________________________");  }
        else {
            System.out.println("______________________________________________");
            System.out.println("المبلغ المراد تحويله اكبر من المبلغ المسموح به");
            System.out.println("______________________________________________");}
        return balance;
    }

    public static double sahb() {
        System.out.println("ادخل المبلغ المراد سحبه");
        Scanner in=new Scanner(System.in);
        amount=in.nextInt();
        if ( amount<=30000)
            if (amount<= balance )
            {balance=balance-amount;
                System.out.println("__________________");
                System.out.println("تمت العملية بنجاح ");
                System.out.println("__________________");}
            else {
                System.out.println("__________________________________________");
                System.out.println("المبلغ المراد سحبة اكبر من الرصيد الحالي ");
                System.out.println("__________________________________________");  }
        else {
            System.out.println("______________________________________________");
            System.out.println("المبلغ المراد سحبة اكبر من المبلغ المسموح به");
            System.out.println("______________________________________________");}
        return balance;
    }

    public static double iedaa(){
        System.out.println("ادخل المبلغ المراد ايداعه");
        Scanner in=new Scanner(System.in);
        amount=in.nextInt();
        balance=balance+amount;
        ree=balance;
        System.out.println("__________________");
        System.out.println("تمت العملية بنجاح");
        System.out.println("__________________");
        return balance;
    }

    public void display(){
        System.out.println("أسم العميل "+name);
        System.out.println("رقم العميل "+id);
        System.out.println("ميلاد العميل "+birthday);
        System.out.println("موقع العميل "+address);
        System.out.println("رقم هاتف العميل "+phoneNumber);
    }

    public abstract double Erning ();

}

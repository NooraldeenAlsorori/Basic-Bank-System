package sample;

import java.util.ArrayList;
import java.util.Scanner;



/**
 * Created by Osama Jaber on 17/09/21.
 */


public class Admin  {

    public String name;
    public int id;
    public String address;
    public String birthday;
    public int phone;
    public Gender g;

    enum Gender{male,fmale}

    static Scanner in = new Scanner(System.in);


    public Admin() {
        int i,ph;
        System.out.println("أدخل أسم المستخدم");
        name=in.next();
        System.out.println("أدخل رقم المستخدم");
        id=in.nextInt();
        System.out.println("أدخل موقع المستخدم");
        address = in.next();
        System.out.println("أدخل  ميلاد المستخدم");
        birthday = in.next();
        System.out.println("أدخل رقم هاتف المستخدم");
        phone = in.nextInt();

    }

    public String getName() {
        return name;
    }

    public void setName( String n) {
       name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Gender getG() {
        return g;
    }

    public void setG(Gender g) {
        this.g = g;
    }



    }




package sample;

import java.util.ArrayList;

/**
 * Created by Osama Jaber on 18/09/21.
 */
public class Department {
    int dnum;
    String dname;
    static     ArrayList<Admin> a;

  static   ArrayList<Emp_User> b;

    public  Department(int dnum, String dname) {
        this.dnum = dnum;
        this.dname = dname;
        a  = new  ArrayList <Admin>();

    }
    public  Department(String dname , int dnum) {
        this.dnum = dnum;
        this.dname = dname;
        b = new ArrayList<>();

    }
    public int getDnum() {
        return dnum;
    }

    public void setDnum(int dnum) {
        this.dnum = dnum;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public static   void add(  Admin ad ) {
    for(int i=0; i<a.size();i++){
        if(a.get(i).id==ad.id){
            System.out.println("Error");
        }
        else {
            System.out.println("");
        }

    }

        a.add(ad);
        
    }

   final public void remove(Admin r) {
       a.remove(r);
    }

    public int size() {
        return a.size();
    }
    public void Search(int z){
       for(int i=0; i<a.size();i++){
                   if(z==a.get(i).id){
               System.out.println(a.get(i).getName() + " " + a.get(i).getId() + " " + a.get(i).getAddress() + " " + a.get(i).getPhone() + " " + a.get(i).getG());
           }
           else{
               System.out.println("Not found");
           }
       }

    }


    public void print() {
        for (int i = 0; i < a.size(); i++) {



            System.out.println(a.get(i).getName() + " " + a.get(i).getId() + " " + a.get(i).getAddress() + " " + a.get(i).getPhone() + " " + a.get(i).getG());


        }


    }
    public void E_client_add(Emp_User u){
        for (int i=0; i<b.size(); i++){
            if(b.get(i).id==u.id){
                System.out.println("Error");
            }
            else {
                System.out.println("");
            }
        }
        b.add(u);
    }
    public int E_client_size(){
        return b.size();
    }
    public void Search_Client(int su){
        for (int i=0; i<b.size(); i++){
            if (su==b.get(i).id){
                System.out.println();
            }
            else{
                System.out.println("Not Found ");
            }


        }
    }
    public void Print_Super_Client (){
        for (int u = 0 ; u< b.size(); u++) {
            System.out.println(b.get(u).getName()+" "+ b.get(u).getId()+" "+ b.get(u).getBirthday()+" "+b.get(u).getAddress()+" "+b.get(u).getPhoneNumber());
        }

    }
    public void PrintAllOfUser() {
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i) instanceof Salaried_User) {
                ((Salaried_User) b.get(i)).DisplayAll();
            }
            if (b.get(i) instanceof Hour_User) {
                ((Hour_User) b.get(i)).DisplayAll();
            }
            if (b.get(i) instanceof Comation_User) {
                ((Comation_User) b.get(i)).DisplayAll();
            }
        }


    }
}

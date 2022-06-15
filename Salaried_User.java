package sample;

/**
 * Created by Osama Jaber on 13/11/21.
 */
public class Salaried_User extends Emp_User implements Team {
    double Salary;
    double Bonas;
    double Didction;

    public Salaried_User(int id, String name, String address, String birthday, int phoneNnubmer, double salary, double bonas, double didction,Gender g) {
        super(id, name, address, birthday, phoneNnubmer , g);
        Salary = salary;
        Bonas = bonas;
        Didction = didction;

    }

    public Salaried_User (){}

    public double getSalary() {
        return Salary;
    }

    public double getBonas() {
        return Bonas;
    }

    public double getDidction() {
        return Didction;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


    public void setBonas(double bonas) {
        Bonas = bonas;
    }

    public void setDidction(double didction) {
        Didction = didction;
    }
    @Override
    public double Erning (){
        return Salary + Bonas - Didction;
    }

    public void Display () {
        System.out.println(" = الراتب   "+Salary+" = الحوافز = "+ Bonas + " = الخصومات   ");
    }
    public void DisplayAll () {
        super.display();
        System.out.println(" = الراتب   "+Salary+" = الحوافز = "+ Bonas + " = الخصومات   ");
        DisplayErning();
    }
    public void DisplayErning () {
        System.out.println(" = مجموع الراتب "+Erning());
    }

}

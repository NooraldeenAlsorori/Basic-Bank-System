package sample;

/**
 * Created by Osama Jaber on 13/11/21.
 */
public class Comation_And_Salaried extends Comation_User  {
    double BaseSalary ;

    public Comation_And_Salaried(int id, String name, String address, String birthday, int phoneNnubmer, Gender g, double grouSels, double comationRead, double base) {
        super(id, name, address, birthday, phoneNnubmer, g, grouSels, comationRead);
        BaseSalary = base;
    }

    public Comation_And_Salaried() {}

    public double getBase() {
        return BaseSalary;
    }

    public void setBase(double base) {
        BaseSalary = base;
    }
    public double Erning () {
        return BaseSalary + super.Erning();
    }
    public void DisplayErning() {
        Erning();
    }
    public void DisplayAll(){
        super.DisplayAll();
        DisplayErning();
    }

}

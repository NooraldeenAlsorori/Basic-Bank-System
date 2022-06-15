package sample;

/**
 * Created by Osama Jaber on 13/11/21.
 */
public class Comation_User extends Emp_User implements Team {
   private double GrouSels ;
   private double ComationRead;

    public Comation_User(int id, String name, String address, String birthday, int phoneNnubmer, Gender g, double grouSels, double comationRead) {
        super(id, name, address, birthday, phoneNnubmer, g);
        GrouSels = grouSels;
        ComationRead = comationRead;
    }

    public Comation_User() {}

    public double getGrouSels() {
        return GrouSels;
    }

    public double getComationRead() {
        return ComationRead;
    }

    public void setGrouSels(double grouSels) {
        GrouSels = grouSels;
    }

    public void setComationRead(double comationRead) {
        ComationRead = comationRead;
    }
    @Override
    public double Erning () {
        return GrouSels * ComationRead ;
    }

    public void Dsiplay () {
        System.out.println(" = حجم المبيعات " + GrouSels + " = سعر المبيعات " + ComationRead);
    }


    public void DisplayErning () {
        System.out.println(" = الراتب "+Erning());
    }
    public void DisplayAll () {
        super.display();
        Dsiplay();
        DisplayErning();
    }

}

package sample;

/**
 * Created by Osama Jaber on 13/11/21.
 */
public class Hour_User extends Emp_User implements Team {
    double Price;
    int Hours;

    public Hour_User(int id, String name, String address, Gender g, String birthday, int phoneNnubmer, double price, int hours) {
        super(id, name, address, birthday, phoneNnubmer , g);
        Price = price;
        Hours = hours;
    }

    public Hour_User() {}

    public double getPrice() {
        return Price;
    }

    public int getHours() {
        return Hours;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setHours(int hours) {
        Hours = hours;
    }
    @Override
    public double Erning () {
        return Price * Hours;
    }
    public void Display () {
        System.out.println(" = عدد الساعات "+Hours+" = السعر "+Price);
    }
    public void DisplayErning () {
        System.out.println(" = الراتب  "+Erning());
    }
    public void DisplayAll() {
        super.display();
        System.out.println(" = عدد الساعات "+Hours+" = السعر "+Price);
        DisplayErning();
    }
}

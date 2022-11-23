import model.booking;
import model.rate;
import model.shows;

public class mains {
    public static void main(String[] args) {
        booking one = new booking(500,5,true);
        rate two = new rate("Wakanda",200,true);
        shows three = new shows("Wakanda","FCube","5PM");

        three.show();
        System.out.println("----------------------");
        two.rates();
        System.out.println("----------------------");
        one.book();

    }
}

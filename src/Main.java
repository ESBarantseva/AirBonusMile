//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 4000; //стоимость билета
        int milePrice = 20; //стоимость одной бонусной мили

        int bonusMiles = ticketPrice / milePrice;

        System.out.println("Вам будет начислено" + bonusMiles + "миль за купленный билет");

        int bonus = 200;

        System.out.println(bonus + "миль");
    }
}

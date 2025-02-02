//class called salarycalculato 
public class SalaryCalculator {
    //attribute called bonus
    private double bonus;

    // calculating the bonus
    public void calculateBonus(double salary) {
        bonus = salary * 0.1;
    }

    //displaying the bonus
    public void displayBonus() {
        System.out.println("Bonus: " + bonus);
    }
}

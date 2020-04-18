public class TechnicalWriter extends Employee {
    private int vacationDays;

    public TechnicalWriter(){

    }

    public String toString() {
        return super.toString() + "\n" + vacationDays;
    }

    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}

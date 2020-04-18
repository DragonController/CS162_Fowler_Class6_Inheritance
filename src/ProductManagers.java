public class ProductManagers extends Employee {
    private int vacationDays;
    private int stockOptions;

    public ProductManagers(){

    }

    public String toString() {
        return super.toString() + "\n" + vacationDays + " $" + stockOptions;
    }

    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
}

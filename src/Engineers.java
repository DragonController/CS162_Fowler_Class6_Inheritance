public class Engineers extends Employee {
    private int vacationDays;
    private int signOnBonus;

    public Engineers(){

    }

    public String toString() {
        return super.toString() + "\n" + vacationDays + " $" + signOnBonus;
    }

    public String motto() {
        return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }
}

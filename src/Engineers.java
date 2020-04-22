public class Engineers extends Employee {
    private int vacationDays;
    private int signOnBonus;
    private final int DEFAULT_VACATION_DAYS = 0;
    private final int DEFAULT_SIGN_ON_BONUS = 0;
    private final int VACATION_DAYS_FOR_0_YEARS = 0;
    private final int VACATION_DAYS_FOR_1_YEAR = 14;
    private final int VACATION_DAYS_FOR_2_YEARS = 21;
    private final int SIGN_ON_BONUS_FOR_0_YEARS = 5000;
    private final int SIGN_ON_BONUS_FOR_5_YEAR = 10000;

    /**
     * Parameterless constructor
     */
    public Engineers(){
        super();
        vacationDays = DEFAULT_VACATION_DAYS;
        signOnBonus = DEFAULT_SIGN_ON_BONUS;
    }

    /**
     * Parameterized constructor
     * @param name a variable of type String
     * @param baseSalary a variable of type double
     * @param yearsOfExperience a variable of type int
     * @param yearsAtCompany a variable of type int
     */
    public Engineers(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
        if (yearsAtCompany == 0) {
            vacationDays = VACATION_DAYS_FOR_0_YEARS;
        } else  if (yearsAtCompany == 1) {
            vacationDays = VACATION_DAYS_FOR_1_YEAR;
        } else {
            vacationDays = VACATION_DAYS_FOR_2_YEARS;
        }
        if (yearsOfExperience < 5) {
            signOnBonus = SIGN_ON_BONUS_FOR_0_YEARS;
        } else {
            signOnBonus = SIGN_ON_BONUS_FOR_5_YEAR;
        }
    }

    /**
     * Returns the employees name, salary, motto, vacation days, and sign on bonus
     * @return A value of data type String
     */
    public String toString() {
        return super.toString() + "\n" + vacationDays + " $" + signOnBonus;
    }

    /**
     * Returns a generic engineer motto
     * @return A value of data type String
     */
    public String motto() {
        return "To the optimist, the glass is half full.To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }
}

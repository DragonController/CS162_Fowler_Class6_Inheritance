public class TechnicalWriter extends Employee {
    private int vacationDays;
    private final int DEFAULT_VACATION_DAYS = 0;
    private final int VACATION_DAYS_FOR_0_YEARS = 0;
    private final int VACATION_DAYS_FOR_1_YEAR = 7;
    private final int VACATION_DAYS_FOR_2_YEARS = 14;

    /**
     * Parameterless constructor
     */
    public TechnicalWriter(){
        super();
        vacationDays = DEFAULT_VACATION_DAYS;
    }

    /**
     * Parameterized constructor
     * @param name a variable of type String
     * @param baseSalary a variable of type double
     * @param yearsOfExperience a variable of type int
     * @param yearsAtCompany a variable of type int
     */
    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
        if (yearsAtCompany == 0) {
            vacationDays = VACATION_DAYS_FOR_0_YEARS;
        } else  if (yearsAtCompany == 1) {
            vacationDays = VACATION_DAYS_FOR_1_YEAR;
        } else {
            vacationDays = VACATION_DAYS_FOR_2_YEARS;
        }
    }

    /**
     * Returns the employees name, salary, motto, and vacation days
     * @return A value of data type String
     */
    public String toString() {
        return super.toString() + "\n" + vacationDays;
    }

    /**
     * Returns a generic technical writer motto
     * @return A value of data type String
     */
    public String motto() {
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}

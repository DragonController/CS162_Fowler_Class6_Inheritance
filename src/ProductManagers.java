public class ProductManagers extends Employee {
    private int vacationDays;
    private int stockOptions;
    private final int DEFAULT_VACATION_DAYS = 0;
    private final int DEFAULT_STOCK_OPTIONS = 0;
    private final int VACATION_DAYS_FOR_0_YEARS = 0;
    private final int VACATION_DAYS_FOR_1_YEAR = 21;
    private final int VACATION_DAYS_FOR_2_YEARS = 28;
    private final int STOCK_OPTIONS_PER_YEAR = 100;

    /**
     * Parameterless constructor
     */
    public ProductManagers(){
        super();
        vacationDays = DEFAULT_VACATION_DAYS;
        stockOptions = DEFAULT_STOCK_OPTIONS;
    }

    /**
     * Parameterized constructor
     * @param name a variable of type String
     * @param baseSalary a variable of type double
     * @param yearsOfExperience a variable of type int
     * @param yearsAtCompany a variable of type int
     */
    public ProductManagers(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
        if (yearsAtCompany == 0) {
            vacationDays = VACATION_DAYS_FOR_0_YEARS;
        } else  if (yearsAtCompany == 1) {
            vacationDays = VACATION_DAYS_FOR_1_YEAR;
        } else {
            vacationDays = VACATION_DAYS_FOR_2_YEARS;
        }
        stockOptions = yearsAtCompany * STOCK_OPTIONS_PER_YEAR;
    }

    /**
     * Returns the employees name, salary, motto, vacation days, and stock options
     * @return A value of data type String
     */
    public String toString() {
        return super.toString() + "\n" + vacationDays + " $" + stockOptions;
    }

    /**
     * Returns a generic product manager motto
     * @return A value of data type String
     */
    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
}

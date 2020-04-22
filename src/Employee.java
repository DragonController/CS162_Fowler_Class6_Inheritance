/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private final String DEFAULT_NAME = "";
    private final double DEFAULT_BASE_SALARY = 0;
    private final int DEFAULT_YEARS_OF_EXPERIENCE = 0;
    private final int DEFAULT_YEARS_AT_COMPANY = 0;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = DEFAULT_NAME;
        baseSalary = DEFAULT_BASE_SALARY;
        yearsOfExperience = DEFAULT_YEARS_OF_EXPERIENCE;
        yearsAtCompany = DEFAULT_YEARS_AT_COMPANY;
    }

    /**
     * Parameterized constructor
     * @param name a variable of type String
     * @param baseSalary a variable of type double
     * @param yearsOfExperience a variable of type int
     * @param yearsAtCompany a variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Gets the employees name
     * @return A value of data type String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employees name
     * @param name a variable of type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the employees base salary
     * @return A value of data type double
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Sets the employees base salary
     * @param baseSalary a variable of type String
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Gets the employees years of experience
     * @return A value of data type int
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Sets the employees years of experience
     * @param yearsOfExperience a variable of type String
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Gets the employees years at the company
     * @return A value of data type int
     */
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    /**
     * Sets the employees years at the company
     * @param yearsAtCompany a variable of type String
     */
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString() {
        return name + " $" + baseSalary + "\n" + motto();
    }

    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto() {
        return "We value our employees";
    }
}
public class Main {
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        System.out.println(new Employee("William", 20, 0, 1).toString());
        System.out.println(new TechnicalWriter("Will", 20, 1, 3).toString());
        System.out.println(new Engineers("Bill", 30, 2, 5).toString());
        System.out.println(new ProductManagers("Billy", 40, 3, 7).toString());
    }
}

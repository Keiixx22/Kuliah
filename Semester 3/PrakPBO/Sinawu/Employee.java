public class Employee {
    private double wage;

    public Employee(double wage) {
        this.wage = wage;
    }

    public void showData() {
        String comment;

        System.out.println(comment="oh no" + "\nWage : " + wage);
    }

    public static void main(String[] args) {
        Employee e = new Employee(90000);

        e.showData();
    }
}

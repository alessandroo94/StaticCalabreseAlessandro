public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Pippo", "Baudo", "Milano");
        Employee employee2 = new Employee("Carlo", "Conti", "Roma");

        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }

}

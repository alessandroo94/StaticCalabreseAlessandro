import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber(){
        totalNumberOfEmployees++;
    }
    private String generateBadgeIdCode(){
        String randomCode1 = generateRandomString();
        String randomCode2 = generateRandomString();
        return randomCode1 + employee.getName() + employee.getSurname() + randomCode2;
    }
    private String generateRandomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 3;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString().toUpperCase();
        return generatedString;
    }
    public void showBadgeDetails(){
        System.out.println("Total number of employees: " + totalNumberOfEmployees);
        System.out.println("Employees details : " + employee.getEmployeeDetails());
        System.out.println("Badge Id Code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        keepTrackOfEmployeesNumber();
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();

    }

}

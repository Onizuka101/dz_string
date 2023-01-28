public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivanov";
        String middleName  = "Ivan";
        String lastName = "Ivanovich";
        String fullName  = firstName + " " + middleName+ " " + lastName;
        System.out.println("ФИО сотрудника —  " + fullName);
    }
    private static void task2() {
        String firstName = "Ivanov";
        String middleName  = "Ivan";
        String lastName = "Ivanovich";
        String fullName  = firstName + " " + middleName+ " " + lastName;
        System.out.println("ФИО сотрудника —  " + fullName.toUpperCase());
    }
    private static void task3() {
        String firstName = "Иванов";
        String middleName  = "Семён";
        String lastName = "Семёнович";
        String fullName  = firstName + " " + middleName+ " " + lastName;
        String fullName2 = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника —  " + fullName2);
    }
}

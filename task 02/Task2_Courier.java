public class Task2_Courier {
    public static void main(String[] args) {
        int floors = 12;
        int apartmentsPerFloor = 6;

        for (int floor = 1; floor <= floors; floor++) {
            for (int apartment = 1; apartment <= apartmentsPerFloor; apartment++) {
                System.out.println("Этаж: " + floor + ", Квартира: " + apartment + " - посылка доставлена");
            }
        }

        System.out.println("Все посылки доставлены!");
    }
}
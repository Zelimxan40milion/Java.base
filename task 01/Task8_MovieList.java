import java.util.Scanner;

public class Task8_MovieList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mov = new String[30];
        int movCount = 0;

        System.out.println("Введите фильмы для просмотра (максимум 30). Для выхода введите 'exit'");

        while (movCount < 30) {
            System.out.print("Фильм " + (movCount + 1) + ": ");
            String movie = scanner.nextLine();

            if (movie.equalsIgnoreCase("exit")) {
                break;
            }

            mov[movCount] = movie;
            movCount++;
        }

        if (movCount == 0) {
            System.out.println("Список фильмов пуст!");
        } else {
            System.out.println("\n=== ВАШ СПИСОК ФИЛЬМОВ ===");
            for (int i = 0; i < movCount; i++) {
                System.out.println((i + 1) + ". " + mov[i]);
            }
        }

        scanner.close();
    }
}
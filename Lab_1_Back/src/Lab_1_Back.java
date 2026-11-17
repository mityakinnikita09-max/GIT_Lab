import java.util.Scanner;

public class Lab_1_Back {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printWelcome();

        while (true) {

            //Филёнов
            printMenu();

            //Николай
            //int choice = readMenuChoice(scanner);

            switch (choice) {

                case 1:
                    //Антом
                    findPalindromes(scanner);
                    break;

                case 2:
                    System.out.println("\nПрограмма завершена.");
                    scanner.close();
                    return;
            }
        }
    }

    /**
     * Выводит приветственное сообщение при запуске программы.
     */
    public static void printWelcome() {

        System.out.println("Лабораторная 1");
        System.out.println("Ввести с консоли n целых чисел и поместить их в массив. На консоль");
        System.out.println("вывести числа-полиндромы, значения которых в прямом и обратном");
        System.out.println("порядке совпадают.");
        System.out.println();
    }

    

    /**
     * Проверяет, является ли переданная строка целым числом.
     * Поддерживаются положительные и отрицательные числа.
     */
    public static boolean isInteger(String value) {

        try {

            Long.parseLong(value);
            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    /**
     * Проверяет, является ли переданное число палиндромом.
     * Палиндром читается одинаково слева направо и справа налево.
     */
    public static boolean isPalindrome(String number) {

        String value = number;

        if (value.startsWith("-")) {
            value = value.substring(1);
        }

        String reverse = new StringBuilder(value).reverse().toString();

        return value.equals(reverse);
    }

    //Филёнов
    /**
     * Выводит главное меню программы.
     */
    public static void printMenu() {

        System.out.println("--------------------------------------");
        System.out.println("1. Ввести числа и найти палиндромы");
        System.out.println("2. Выход");
        System.out.println("--------------------------------------");
    }

    //Антон
    /**
     * Запрашивает у пользователя строку с целыми числами,
     * проверяет ввод и выводит найденные числа-палиндромы.
     */
    public static void findPalindromes(Scanner scanner) {

        System.out.println();
        System.out.println("Введите целые числа через пробел.");
        System.out.println("Например: 121 45 33 -121 789 1001");
        System.out.print("> ");

        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {

            System.out.println("Ошибка: строка не может быть пустой.");
            return;
        }

        String[] numbers = input.split("\\s+");

        int count = 0;

        System.out.println();
        System.out.println("Числа-палиндромы:");

        for (String item : numbers) {

            if (!isInteger(item)) {

                System.out.println("Пропущено значение \"" + item + "\" — это не целое число.");

                continue;
            }

            if (isPalindrome(item)) {

                System.out.println(item);
                count++;
            }
        }

        if (count == 0) {

            System.out.println("Палиндромов не найдено.");

        } else {

            System.out.println("--------------------------------------");
            System.out.println("Найдено палиндромов: " + count);
        }

        System.out.println();
    }
}

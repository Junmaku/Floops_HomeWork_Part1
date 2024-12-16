public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 2
        System.out.println("Задание 2:");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Task 3
        System.out.println("Задание 3:");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Task 4
        System.out.println("Задание 4:");
        int j = 10;
        do {
            System.out.print(j + " ");
            j--;
        } while (j >= -10);
        System.out.println();
        //Task 5
        System.out.println("Задание 5:");
        int year = 1904;
        do {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println(year + " год является высокосным");
            }
            year++;
        } while (year != 2096);
        //Task 6
        System.out.println("Задание 6:");
        for (int i = 7; i < 100; i += 7) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        //Task 7
        System.out.println("Задание 7:");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        //Task 8
        System.out.println("Задание 8:");
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            String mounth = "";
            sum += 29000;
            mounth = switch (i) {
                case 1 -> "Январь";
                case 2 -> "Февраль";
                case 3 -> "Март";
                case 4 -> "Апрель";
                case 5 -> "Май";
                case 6 -> "Июнь";
                case 7 -> "Июль";
                case 8 -> "Август";
                case 9 -> "Сентябрь";
                case 10 -> "Октябрь";
                case 11 -> "Ноябрь";
                case 12 -> "Декабрь";
                default -> mounth;
            };
            System.out.printf("Месяц %s, сумма накоплений равна %d рублей\n", mounth, sum);

        }
        //Task 9
        System.out.println("Задание 9:");
        double sumWithPercent = 0;
        for (int i = 1; i <= 12; i++) {
            String mounth = "";
            if (i != 1) {
                sumWithPercent = 29000 + sumWithPercent + sumWithPercent / 100;
            } else {
                sumWithPercent += 29000;
            }
            mounth = switch (i) {
                case 1 -> "Январь";
                case 2 -> "Февраль";
                case 3 -> "Март";
                case 4 -> "Апрель";
                case 5 -> "Май";
                case 6 -> "Июнь";
                case 7 -> "Июль";
                case 8 -> "Август";
                case 9 -> "Сентябрь";
                case 10 -> "Октябрь";
                case 11 -> "Ноябрь";
                case 12 -> "Декабрь";
                default -> mounth;
            };
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", mounth, sumWithPercent);
        }
        //Task 10
        System.out.println("Задание 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d\n", 2, i, (2 * i));
        }

    }
}
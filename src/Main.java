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
        //Task 2.1
        System.out.println("\nЗадание 1: \n");
        int summa = 0;
        int countMounth = 0;
        while (summa < 2459000) {
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", countMounth++, summa += 15000);
        }
        //Task 2.2
        System.out.println("\nЗадание 2: \n");
        boolean flag = true;
        int countForTask2_2 = 1;
        while (flag) {
            flag = 10 > countForTask2_2;
            System.out.printf(countForTask2_2 == 10 ? "%d\n" : "%d ", countForTask2_2++);
        }
        for (countForTask2_2 = 10; countForTask2_2 > 0; countForTask2_2--) {
            System.out.printf(countForTask2_2 != 1 ? "%d " : "%d\n", countForTask2_2);
        }
        //Task 2.3
        System.out.println("\nЗадание 3: \n");
        int populationY = 12000000;
        int popPerYear = populationY + (populationY * 17 / 1000) - (populationY * 8 / 1000);
        for (int l = 0; l <= 10; l++) {
            System.out.printf("Год %d, численность населения составляет %d\n", l, populationY + popPerYear * l);
        }
        //Task 2.4
        System.out.println("\nЗадание 4:\n");
        double deposit = 15000;
        countMounth = 1;
        while (deposit < 12000000) {
            deposit += deposit * 7 / 100;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", countMounth++, deposit);
        }
        //Task 2.5
        System.out.println("\nЗадание 5:\n");
        deposit = 15000;
        countMounth = 1;
        while (deposit < 12000000) {
            deposit += deposit * 7 / 100;
            countMounth++;
            if (countMounth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", countMounth, deposit);
            }
        }
        //Task 2.6
        System.out.println("\nЗадание 6:\n");
        deposit = 15000;
        countMounth = 1;
        for (; countMounth <= 12 * 9; countMounth++) {
            deposit += deposit * 7 / 100;
            if (countMounth % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", countMounth, deposit);
            }
        }
        //Task 2.7
        System.out.println("\nЗадание 7:\n");
        int firstFriday = (int) (Math.random() * 7);
        for (; firstFriday <= 31; firstFriday += 7) {
            System.out.printf("Сегодня пятница, %d число. Необходимо подгоотовить отчет.\n", firstFriday);
        }
        //Task 2.8
        System.out.println("\nЗадание 8:\n");
        int cometYear = 0;
        int count = 1;
        while (cometYear < 2124) {
            cometYear += 79;
            if (cometYear > 1824 && count <= 3) {
                System.out.printf((cometYear < 2024 ? "В этом году пролетела комета: %d\n" : "В этом году пролетит комета: %d\n"), cometYear);
                count++;
            }
        }
    }
}
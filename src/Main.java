public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int part = 15_000;
        int total = 0;
        int count = 0;
        while (total < 12_000_000) {
            total = total + (total * 7) / 100;
            total = total + part;
            System.out.println(total);
            count = count + 1;
        }
        System.out.println("Месяц " + count + ", сумма накоплений равна " + total + " рублей");

        //Задание 2
        System.out.println("Задание 2");
        int payment = 15_000;
        int total1 = 0;
        int i = 0;
        while (total1 < 12_000_000) {
            total1 = total1 + (total1 * 7) / 100;
            total1 = total1 + payment;
            i += 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
            }
        }

        //Задание 3
        System.out.println("Задание 3");
        int payment2 = 15_000;
        int total2 = 0;
        int j = 0;
        while (j <= 12 * 9) {
            total2 = total2 + (total2 * 7) / 100;
            total2 = total2 + payment2;
            j += 1;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + total2 + " рублей");
            }
        }

        //Задание 4
        System.out.println("Задание 4");
        int day = 3;
        while (day <= 31) {
            day += 7;
            if (day <= 31) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }
}

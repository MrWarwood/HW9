public class Main {
    public static void main(String[] args) {
        System.out.println("HW9");
        System.out.println();
        System.out.println("  Задача №1.");
        int[] wastes = {11_500, 7_654, 15_000, 13_610, 11_118};
        int sums = 0;
        for (int i : wastes) {
            sums += i;
        }
        System.out.println("Сумма трат за месяц составила " + sums + " рублей");


        System.out.println();
        System.out.println("  Задача №2.");
        //Минимальная сумма трат за неделю составила … рублей. Максимальная сумма трат за неделю составила … рублей
        int miniWastes = 1_000_000;
        int maxWastes = -1;
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] < miniWastes) {
                miniWastes = wastes[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + miniWastes + " рублей.");


        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maxWastes) {
                maxWastes = wastes[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxWastes + " рублей.");


        System.out.println();
        System.out.println("  Задача №3.");
        //Средняя сумма трат за месяц составила … рублей
        double averageWaster = sums / wastes.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageWaster + " рублей.");


        System.out.println();
        System.out.println("  Задача №4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println(".");
    }
}
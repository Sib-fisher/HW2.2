public class Main {
    public static void main(String[] args) {
        int initialAmount = 350;
        int deposit = 1850;
        if (deposit > 1000) {
            int result = deposit / 100 + initialAmount + deposit;
            int bonus = deposit / 100;
            System.out.println("Итоговая сумма: " + result);
            System.out.println("Бонусные рубли: " + bonus);
        } else {
            int result = deposit + initialAmount;
            System.out.println("Итоговая сумма: " + result);
            System.out.println("Бонусные рубли: 0");
        }
    }
}
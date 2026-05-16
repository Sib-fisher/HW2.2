public class Main {
    public static void main(String[] args) {
        int initial_amount = 350;
        int deposit = 1850;
        if (deposit > 1000) {
            int itog = deposit / 100 + initial_amount + deposit;
            int bonus = deposit /100;
            System.out.println("Итоговая сумма: " + itog);
            System.out.println("Бонусные рубли: " + bonus);
        }
        else{
            int itog = deposit + initial_amount;
            System.out.println("Итоговая сумма: " + itog);
            System.out.println("Бонусные рубли: 0");
        }
    }
}
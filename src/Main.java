public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        int start = 100;
        int amount = 1350;
        int bonus = amount / 100;
        if (amount > 1000) {
            System.out.println("Бонус за оплату:" + amount / 100 + " На счете:" + (start + amount + bonus));
        } else {
            System.out.println("Бонус за оплату:0. " + "На счете:" + (start + amount));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int account = 500;
        int amount = 1100;
        int rub = 100;
        int bonus;
        boolean b = amount > 1000;

        if (b) {
            bonus = amount / rub;
        } else {
            bonus = 0;
        }
        int accountBonus = account + amount + bonus;
        System.out.println("Bonuses: " + bonus);
        System.out.println("Account " + accountBonus);

    }
}

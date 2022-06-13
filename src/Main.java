public class Main {
    public static void main(String[] args) {

        int balance = 50;
        int paid = 1500;
        int bonus;
        if (paid >= 1000) {
            bonus = paid / 100;
            System.out.println(bonus + paid + balance);
        } else {
            System.out.println(paid + balance);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int balance = 2_000_000_000;
        int transfer = 500_000_000;
        int account = balance + transfer;
        System.out.println("Текущий счет: " + account + " руб");
    }
}

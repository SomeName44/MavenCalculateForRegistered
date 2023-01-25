public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(1_000, true);
        System.out.println("Test1. " + expected + " == ? == " + actual);

        expected = 500;
        actual = service.calculate(1_000_000, true);
        System.out.println("Test2. " + expected + " == ? == " + actual);

    }
}

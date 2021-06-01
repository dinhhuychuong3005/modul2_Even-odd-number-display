public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd = new OddThread("Thread1");
        EvenThread even = new EvenThread("Thread2");
        odd.start();
        odd.join();
        even.start();
    }
}

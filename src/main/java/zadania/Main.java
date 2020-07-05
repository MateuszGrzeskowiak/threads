package zadania;

public class Main {

    public static void main(String[] args) {

        Juhuu juhuu = new Juhuu();
        Thread watek = new Thread(juhuu);
        watek.start();
    }
}

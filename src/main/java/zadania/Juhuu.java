package zadania;

public class Juhuu implements Runnable {
    private int howManyLoops;

    @Override
    public void run() {
        try {
            Thread.sleep(30000);
            System.out.println("Juhuu");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}






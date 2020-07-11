package zadania;

import java.util.Scanner;

public class HelloWorld implements Runnable {
    Scanner scanner = new Scanner(System.in);
    private String tekst = "tekst";

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public void run() {
        tekst = scanner.nextLine();
        do {
            System.out.println("Hello World! " + tekst);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (tekst.equals("quit"));
    }
}

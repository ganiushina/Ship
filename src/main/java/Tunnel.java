import java.util.concurrent.Semaphore;

public class Tunnel {
    Semaphore sem = new Semaphore(2);

    int length;
    String description;

    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    public void go(Ship s) {
        try {
            try {
                System.out.println(s.getName() + " готовится к тунелю(ждет): " + description);
                sem.acquire();
                System.out.println(s.getName() + " начал этап: " + description);
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s.getName() + " закончил этап: " + description);
            sem.release();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

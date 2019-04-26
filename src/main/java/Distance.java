import java.util.concurrent.Semaphore;

class Distance {

    int length;
    int tunnelLength = 30;
    String description;

    Semaphore sem = new Semaphore(2);

    public Distance(int length) {
        this.length = length;
        this.description = "Путь " + length + " метров";
    }


    public void go(Ship s) {
        try {
            try {
                System.out.println(s.getName() + " начал этап: " + description);
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s.getName() + " закончил этап: " + description);
            tunnel(s);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void go(Ship s, int length) {
        try {
            try {
                System.out.println(s.getName() + " начал этап: " + length);
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(s.getName() + " закончил этап: " + length);
            s.pul.setCargo(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void tunnel(Ship s) {
         try {
             try {
                 System.out.println(s.getName() + " готовится к тунелю(ждет): " + tunnelLength);
                 sem.acquire();
                 System.out.println(s.getName() + " начал этап тунелю: " + tunnelLength);
                 Thread.sleep(2 * 1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(s.getName() + " закончил этап: " + description);
             go(s, 20);
             sem.release();

         } catch (Exception e) {
             e.printStackTrace();
         }
     }


}

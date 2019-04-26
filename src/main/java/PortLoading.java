import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Semaphore;


public class PortLoading {  // погрузка

    Cargo cargo;

    private HashMap<Integer, Cargo> typeCargo = new HashMap<Integer, Cargo>();


    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    boolean isBusy = false;

    int weight;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    ArrayList<PortLoading> portLoading;

    public PortLoading(Cargo cargo, int weight){
        this.cargo =cargo;
        this.weight = weight;
        System.out.println(" Создали порт с товаром " + cargo.getName() + " объемом " + weight );
    //    insTypeLoading();
    }



    public void getCargo(Ship s) {
        while (this.getWeight() > 0 && s.isEmpty) {
            try {
                System.out.println(" Порт " + " ожидает корабля");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Корабль " + s.getName() + " берет товар " + this.cargo.getName() + " весом " + s.getCapacity());

            try {
                if (this.getWeight() >= s.getCapacity()) {
                    s.setCargo(this.cargo, s.getCapacity());
                    this.setWeight(this.getWeight() - s.getCapacity());
                }
                else {
                    s.setCargo(this.cargo, this.getWeight());
                    this.setWeight(0);
                }
                System.out.println("В порту осталось  " + this.getWeight() + " " + this.cargo.getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

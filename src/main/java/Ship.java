import java.util.ArrayList;

public class Ship implements Runnable {

    private String name;
    private int capacity;

    ArrayList<PortLoading> portLoading;
    PortuUloading pul;

    Distance dis;
    Cargo cargo;

    boolean isEmpty;

    int weight;

    public boolean isEmpty() {
        return isEmpty;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public Ship(String name, int capacity, ArrayList<PortLoading> portLoading ) {
        this.name = name;
        this.capacity = capacity;
        this.isEmpty = true;
        this.portLoading = portLoading;
        this.isEmpty = true;
    }


    public Cargo getcargo() {
        return cargo;
    }

    public int getWeight() {
        return weight;
    }

    public void setCargo(Cargo cargo, int weight) {
        this.cargo = cargo;
        this.weight = weight;
        if (cargo == null){
            isEmpty = true ;
        }
        if (cargo != null){
            isEmpty = false;
        }
        System.out.println("В корабле  " + this.name + " лежит товар " + cargo.getName() + " весом  " + weight);

    }

    public void run() {

            for (int i = 0; i < portLoading.size(); i++) {
                synchronized (portLoading.get(i)) {
                    if (this.isEmpty) {
                        portLoading.get(i).getCargo(this);
                    }
                }
            }

    }

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }


}

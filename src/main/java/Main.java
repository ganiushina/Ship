import java.util.ArrayList;

public class Main {

    public static Object monitor = new Object();

    public static void main(String[] args) {


        Cargo cargo1 = new Cargo("food");
        Cargo cargo2 = new Cargo("clothes");
        Cargo cargo3 = new Cargo("oil");

//        ArrayList<Cargo> cargo = new ArrayList<Cargo>();
//        cargo.add(cargo1);
//        cargo.add(cargo2);
//        cargo.add(cargo3);

        PortLoading pl1 = new PortLoading(cargo1, 500);
        PortLoading pl2 = new PortLoading(cargo2, 200);
        PortLoading pl3 = new PortLoading(cargo3, 700);

        ArrayList<PortLoading> portLoading = new ArrayList<PortLoading>();
        portLoading.add(pl1);
        portLoading.add(pl2);
        portLoading.add(pl3);

        final Distance distance = new Distance(60);


        PortuUloading pul = new PortuUloading();


        Ship ship1 = new Ship("Jonn", 200, portLoading);
        Ship ship2 = new Ship("Jeck", 100, portLoading);
        Ship ship3 = new Ship("Jonny", 300, portLoading);
        Ship ship4 = new Ship("Jim", 200, portLoading);
        Ship ship5 = new Ship("Bim", 400, portLoading);

        Thread t1 = new Thread(ship1);
        t1.start();
        Thread t2 = new Thread(ship2);
        t2.start();
        Thread t3 = new Thread(ship3);
        t3.start();
        Thread t4 = new Thread(ship4);
        t4.start();
        Thread t5 = new Thread(ship5);
        t5.start();



    }
}

import java.util.HashMap;

public class PortuUloading { // разгрузка


    private HashMap<Integer, Cargo> typeCargoUloading = new HashMap<Integer, Cargo>();

    public PortuUloading(){

    }

    public void putGoods(Ship s, int port){
        typeCargoUloading.put(port, s.getcargo());
       // s.setCargo(null);
    }

    public void setCargo(Ship s){
//        if (typeCargoUloading.size() <3 ) {
////            for (Integer key : typeCargoUloading.keySet()) {
////                if (key == 1) {
////                    putGoods(s, 2);
////                }
////                if (key == 0) {
////                    putGoods(s, 1);
////                }
//              //  break;
//                if (typeCargoUloading.size() == 0) {
//                    putGoods(s, 0);
//
//                } else if (typeCargoUloading.size() == 1) {
//                    putGoods(s, 1);
//                } else if (typeCargoUloading.size() == 2) {
//                    putGoods(s, 2);
//                }
//            }
//
//        else {
//
//            for (int i = 0; i < typeCargoUloading.size(); i++) {
//                synchronized (typeCargoUloading.get(i)) {
//                    if (typeCargoUloading.get(i).equals(s.getcargo())) {
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(" Порт номер " + (i + 1) + " занят." + " Разгружается корабль " + s.getName());
//                        System.out.println("Корабль " + s.getName() + " кладет товар " + s.getcargo().getName() + " весом " + s.getcargo().getWeight() + " в порт " + (i + 1));
//                        s.putCargo(typeCargoUloading.get(i), 0);
//                        putGoods(s, i);
//                        try {
//                            Thread.sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    System.out.println(s.getName() + " освобождает порт ");
//                    //    s.dis.go(s);
//                }
//            }
//        }
    }


}

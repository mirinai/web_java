package OOP;

public class Factory {
    public static void main(String[] args) {
//        Chocolate one = new Chocolate("바닐라", 200);
//        System.out.println(one.getFlavor());
//        System.out.println(one.flavor);
//        System.out.println(one.kcal);
//
//        System.out.println();
//
//        Car vantz = new Car("G-class","gasoline","vantz");
//
//        for (int i = 0; i < 15; i++) {
//            vantz.raising_velocity(); // 속도를 올린 후 보여줌
//            vantz.showSpeed();
//        }
////        vantz.present_velocity = -100;
//        // 속도를 줄이는 로직도 추가해보세요
//        for (int i = 0; i < 5; i++) {
//            vantz.lowering_velocity(); // 속도를 낮춘 후 보여줌
//            vantz.showSpeed();
//        }
//
//        // 속도를 0으로 설정
//        vantz.setting_velocity_to_zero();
//        vantz.showSpeed();
        Time time = new Time();
        System.out.printf("초기 시간: %02d:%02d:%02d\n", time.getHour(), time.getMinuite(), time.getSecond());
        for (int i = 0;i<=32*60*60;i++){
            System.out.printf("%02d:%02d:%02d\n",time.getHour(),time.getMinuite(),time.getSecond());
            time.rasing_time();
            System.out.flush();
        }


    }
}

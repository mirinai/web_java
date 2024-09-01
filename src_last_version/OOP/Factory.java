package OOP;

import OOP.Enumeration.Role;
import OOP.Enumeration.WeekDays;
import OOP.Generic.*;

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
//        Time time = new Time();
//        System.out.printf("초기 시간: %02d:%02d:%02d\n", time.getHour(), time.getMinuite(), time.getSecond());
//        for (int i = 0;i<=32*60*60;i++){
//            System.out.printf("%02d:%02d:%02d\n",time.getHour(),time.getMinuite(),time.getSecond());
//            time.rasing_time();
//            System.out.flush();
//        }
//        WeekDays today = WeekDays.SUN;
//        WeekDays tomorrow = WeekDays.MON;
//
//        System.out.println(today);
//        System.out.println(tomorrow);
//
//        Role user = Role.ADMIN;
//
//        if(user==Role.ADMIN){
//            System.out.println("안됨");
//        } else if (user==Role.SUPER_ADMIN) {
//            System.out.println("됨");
//        }
//
//        switch (today){
//            case MON:
//                System.out.println("monday");
//            break;
//            case TUE:
//                System.out.println("tuesday");
//                break;
//            default:
//                System.out.println("...");
//                break;
//        }

//        Box<Fruit> box1 = new Box<>();
//        box1.setItem(new Apple());
//
//        Box<Banana> box2 = new Box();
//        box2.setItem(new Banana());

        AndroidPhone<AndroidApp> myPhone1 = new AndroidPhone<>("ZFlip");
        myPhone1.downloadApp(new AndroidApp("국민은행 앱",200));
        myPhone1.downloadApp(new AndroidApp("카카오",200));
        myPhone1.downloadApp(new AndroidApp("신한은행 앱",200));
        myPhone1.downloadApp(new AndroidApp("토스",200));
        myPhone1.downloadApp(new AndroidApp("키움증권",200));
        myPhone1.getNameApp();
        myPhone1.getTotalVolume();




    }
}

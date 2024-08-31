package OOP;

import java.util.Scanner;

public class Chocolate {

        String flavor;
        double kcal;
        
        //변수 + 생성자 함수[만들어 주는 함수] + 함수
    //특징: 리턴타입 없음, 함수이름이 클래스 이름과 같아야 함
    Chocolate(String flavor, double kcal){
        this.flavor = flavor;
        this.kcal = kcal;
    }
        
        
        
        
        //() => {}
        double getKcal(){
            return 100;
        }

        String getName(){
            return "godiva";
        }

        //숫자를 입력받고 1번 밀크 2번 피스타치오 3번 다크로 돌려주는 함수
        String getFlavor(){
//            switch (n){
//                case 1:
//                    return "밀크";
//                    break;
//                case 2:
//                    return "피스타치오";
//                    break;
//                case 3:
//                    return "다크";
//                    break;
//                default:
//                    break;
//            }
//
//            return "";
            Scanner sc = new Scanner(System.in);
            System.out.print("번호 입력:");
            int num = sc.nextInt();

//            if (n == 1){
//                return "밀크";
//            }
//            else if( n == 2){
//                return "피스타치오";
//            } else if (n == 3) {
//                return
//            }
            switch (num){
                case 1: return "밀크";
                case 2: return "피스타치오";
                case 3: return "다크";
                default:return "?";
            }

        }

}

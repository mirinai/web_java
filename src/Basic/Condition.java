package Basic;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        //조건문: if문, switch문
        //ctrl + alt + l : 자동 줄 맞춤
        
//        int num = 10;
//        if (num < 20) {
//            System.out.println("20보다 작음");
//        } else if (num < 30) {
//            System.out.println("30보다 작음");
//        } else {
//            System.out.println("30보다 큼");
//        }

        //유저에게 정수를 입력받고 양의 홀수, 양의 짝수, 0, 음의 홀수, 음의 짝수를 판별해주는 프로그램
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력:");
//        int inum = sc.nextInt();
//        boolean isPositive = inum>0;
//        boolean is2by = inum % 2 == 0;
//
//        if(isPositive){
//            if(is2by){
//                System.out.println("양의 짝수");
//
//            }
//            else {
//                System.out.println("양의 홀수");
//            }
//
//        } else if (inum<0) {
//            if(is2by){
//                System.out.println("음의 짝수");
//
//            }
//            else {
//                System.out.println("음의 홀수");
//            }
//
//        }
//        else{
//            System.out.println("값 = 0");
//        }
        int num = 1;

        switch (num){
            case 1:
                System.out.println("숫자 1");
                break;
            case 2:
                System.out.println("숫자 2");
                break;
            case 3:
                System.out.println("숫자 3");
                break;
            default:
                System.out.println("1 2 3 아님");
                break;
        }


    }
}

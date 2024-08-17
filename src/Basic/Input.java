package Basic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        int a = 1;
//
//        //@@ a = new @@()
//        System.out.print("숫자입력:");
//        Scanner b = new Scanner(System.in);
//
//        int c = b.nextInt(); //유저에게 정수를 입력받는 함수
//        System.out.printf("입력한 숫자: %d",c);

        //유저에게 두 정수를 입력 받고, 합, 차, 곱을 출력하는 프로그램
//        Scanner num1 = new Scanner(System.in);
//        Scanner num2 = new Scanner(System.in);
//        System.out.println("두 수 한 줄씩 입력");

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 숫자:");

//        int a = num1.nextInt();
//        int b = num2.nextInt();

        int i1 = sc.nextInt();
        System.out.println("두번째 숫자:");
        int i2 = sc.nextInt();
// 버퍼에 남아있는 엔터 키를 처리하기 위해 nextLine()을 한 번 호출
        sc.nextLine();  // 이 줄을 추가하여 버퍼를 비웁니다.
        System.out.println("이름입력:");
        String name = sc.nextLine();


        System.out.printf("더하기= %d",i1+i2);
        System.out.println();
        System.out.printf("빼기= %d",i1-i2);
        System.out.println();
        System.out.printf("곱하기= %d",i1*i2);
        System.out.println();
        System.out.printf("name: %s",name);



    }
}

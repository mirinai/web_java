package Basic;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        //1. 산술연산자
        //*,+,-,%,/,++,--

        //2. 비교, 논리연산자
        //*,<,>,>=,<=,==,!=,&&,||,!

        //3. 삼항연산자
        // 조건식 ? true: false;

        //퀴즈, 세 과목이름 입력 받고, 세 과목의 시험 점수를 입력 받고, 세 과목의 평균이 60점 이상이면 합격 아니면 불합격
        Scanner sc = new Scanner(System.in);

        System.out.print("A과목 이름:");
        String name_a= sc.nextLine();

        System.out.print("A과목 점수입력:");
        int a= sc.nextInt();
        sc.nextLine();  // 버퍼에 남아있는 엔터를 처리

        System.out.print("B과목 이름:");
        String name_b= sc.nextLine();

        System.out.print("B과목 점수입력:");
        int b= sc.nextInt();
        sc.nextLine();  // 버퍼에 남아있는 엔터를 처리

        System.out.print("C과목 이름:");
        String name_c= sc.nextLine();

        System.out.print("C과목 점수입력:");
        int c= sc.nextInt();
        double result = (double)(a + b + c) / 3.0;
        boolean isAllowed= (a + b + c) / 3 >= 60 ? true : false;

        if (isAllowed) {
            System.out.printf("합격, %s, %s, %s의 평균: %.2f", name_a, name_b, name_c, result);
        } else {
            System.out.printf("불합격, %s, %s, %s의 평균: %.2f", name_a, name_b, name_c, result);
        }

    }
}

package Basic2;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Objects;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //조건문: 조건에 따라 실행되는 문법코드
        //반복문: n번 반복되게 실행해주는 문법코드
        //for - while

//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }
//        System.out.println();
//        for(int i=1;i<10;i=i+2){
//            System.out.print(i+"\t");
//        }
//        System.out.println();
//
//        //유저에게 정수 n을 입력받고, n개의 정수를 입력받은 뒤 n개의 평균을 구하기
//
        Scanner sc = new Scanner(System.in);
//        System.out.print("넣을 숫자의 수:");
//        int n = sc.nextInt();
//        int[] num = new int[n];
//        int sum = 0;
//        for(int i = 0; i < n ; i++){
//            System.out.print("숫자입력:");
//            num[i] = sc.nextInt();
//
//            sum = sum + num[i];
//        }
//        double avg = sum / (double) n;  // n을 double로 캐스팅
//        for (int i=0;i< num.length;i++){
//            System.out.print(num[i]);
//            System.out.print(" ");
//        }
//        System.out.printf("%d개의 정수의 평균: %.2f",n,avg);

        //for문 안에 for문[2중 for문]
//        System.out.print("input row:");
//        int row = sc.nextInt();
//        System.out.print("input col:");
//        int col = sc.nextInt();
//        for (int i = 0; i < row; i++) { // 행 되풀이
//            for (int j = 0; j < col; j++) { // 열 되풀이
//                // i와 j를 써서 1씩 오르는 값을 출력
//                System.out.printf("%d\t", i * row + j);
//            }
//            System.out.println(); //줄 바꾸기
//        }
        
        
        //while
        //1. 조건을 바꾸기 ex)cnt++
        //2. break 예약어 쓰기
//        int cnt = 1;
//        //
//        while(cnt < 5){
//            System.out.println("sjsjs");
//            cnt++;
//
//        }

        //유저에게 n 정수를 입력받고
        //n번 정수를 입력받은 뒤 양의 정수의 합을 나타내는 프로그램

//        System.out.print("넣을 값들의 수를 입력하기:");
//        int n = sc.nextInt();
//        int sum = 0;
//        int num = 0;
//
//        int i = 0;
//        while(true){
//
//            if (i>=n){
//                break;
//            }
//            System.out.print("정수 입력하기:");
//            num = sc.nextInt();
//            if(num>0) {
//                sum += num;
//            }
//            i++;
//        }
//        System.out.printf("양의 정수의 합: %d",sum);


        //유저에게 프로그램 명령러 입력
        // 실행종료라고 입력하면 프로그램 끝나기
        // 명령어가 잘못되었음
        //프로그램 명령어 입력하기:
//        System.out.print("명령어 입력하기(프로그램을 끝내고 싶다면 \"EXIT\" 넣기)");
//        String com = sc.nextLine();
//
//        while(true){
//            if (Objects.equals(com, "EXIT")){
//                System.out.println("프로그램 끝남");
//                break;
//            }
//            System.out.println("명령어가 잘못되었음");
//        }

        //계산기 프로그램
        //1. 더하기
            //두 숫자를 입력:
            // 합 결과:
        //2. 빼기
            // 두 숫자를 입력:
            // 빼기 결과:
        //3. 곱하기
        //4. 나누기
        //5. 프로그램 종료
            //프로그램 종료

//        System.out.println("계산기 프로그램");
//        System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 프로그램 종료");
//        System.out.print("입력하기:");
        int select = 0;
//        sc.nextLine();  // 추가: 개행 문자를 소비하기 위해 사용
        int result = 0;
        double fresult = 0.0;

        while(true){
            System.out.println();
            System.out.println();
            System.out.println("계산기 프로그램");
            System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 프로그램 종료");
            System.out.print("입력하기:");
            select = sc.nextInt();
            sc.nextLine();  // 추가: 개행 문자를 소비하기 위해 사용
            result = 0;
            fresult = 0.0;

            if(select == 1){
                System.out.println("두 숫자를 띄어 써서 넣기");
                String input = sc.nextLine();
                String[] numbers = input.split(" ");
                int[] intNumbers = new int[numbers.length];
                for(int i=0;i<numbers.length;i++){
                    intNumbers[i] = Integer.parseInt(numbers[i]);
                }
                result = intNumbers[0] + intNumbers[1];
                System.out.printf("더하기 결과: %d", result);

            } else if (select == 2) {
                System.out.println("두 숫자를 띄어 써서 넣기");
                String input = sc.nextLine();
                String[] numbers = input.split(" ");
                int[] intNumbers = new int[numbers.length];
                for(int i=0;i<numbers.length;i++){
                    intNumbers[i] = Integer.parseInt(numbers[i]);
                }
                result = intNumbers[0] - intNumbers[1];
                System.out.printf("빼기 결과: %d", result);
            } else if (select == 3) {
                System.out.println("두 숫자를 띄어 써서 넣기");
                String input = sc.nextLine();
                String[] numbers = input.split(" ");
                int[] intNumbers = new int[numbers.length];
                for(int i=0;i<numbers.length;i++){
                    intNumbers[i] = Integer.parseInt(numbers[i]);
                }
                result = intNumbers[0] * intNumbers[1];
                System.out.printf("곱하기 결과: %d", result);
            }
            else if(select == 4){
                System.out.println("두 숫자를 띄어 써서 넣기");
                String input = sc.nextLine();
                String[] numbers = input.split(" ");
                int[] intNumbers = new int[numbers.length];
                for(int i=0;i<numbers.length;i++){
                    intNumbers[i] = Integer.parseInt(numbers[i]);
                }
                fresult = intNumbers[0] / (double)intNumbers[1];
                System.out.printf("나누기 결과: %.2f", fresult);
            }
            else if(select == 5) System.out.println("프로그램 끝남");
            else System.out.println("잘못된 입력");

        }

//        while(true) {
//            System.out.println();
//            System.out.println();
//            System.out.println("계산기 프로그램");
//            System.out.println("1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 프로그램 종료");
//            System.out.print("입력하기:");
//            int codeNumber = sc.nextInt();
//            int a, b;
//            switch (codeNumber){
//                case 1:
//                    System.out.print("첫번째 수 입력:");
//                    a = sc.nextInt();
//                    System.out.print("두번째 수 입력:");
//                    b = sc.nextInt();
//                    System.out.printf("%d + %d = %d",a,b,a+b);
//                    System.out.println();
//                    break;
//                case 2:
//                    System.out.print("첫번째 수 입력:");
//                    a = sc.nextInt();
//                    System.out.print("두번째 수 입력:");
//                    b = sc.nextInt();
//                    System.out.printf("%d + %d = %d",a,b,a-b);
//                    System.out.println();
//                    break;
//                case 3:
//                    System.out.print("첫번째 수 입력:");
//                    a = sc.nextInt();
//                    System.out.print("두번째 수 입력:");
//                    b = sc.nextInt();
//                    System.out.printf("%d + %d = %d",a,b,a*b);
//                    System.out.println();
//                    break;
//                case 4:
//                    System.out.print("첫번째 수 입력:");
//                    a = sc.nextInt();
//                    System.out.print("두번째 수 입력:");
//                    b = sc.nextInt();
//                    System.out.printf("%d + %d = %.2f",a,b,(double)a/b);
//                    System.out.println();
//                    break;
//                case 5:
//                    System.out.println("프로그램 끝남");
//                    System.out.println();
//                default:
//                    System.out.println("잘못된 입력");
//                    System.out.println();
//                    break;
//            }
//
//        }


    }
}

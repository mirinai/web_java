package Basic2;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int[] score = new int[5];
//        score[0] = 100;
//        for (int i = 0; i < 5; i++){
//            score[i] = 0;
//        }
        Scanner sc = new Scanner(System.in);
        //유저에게 반 학생 수를 물어보고
        //첫번째 학생부터 ~n번째 학생의 수학점수를 모두 입력받고
        //첫번째 학생부터 n번째 학생의 수학점수를 모두 보여주고
        //평균까지 나타내는 프로그램
//        System.out.print("학생 수:");
//        int n = sc.nextInt();
//        int[] std = new int[n];
//        int sum = 0;
//
//        for (int i = 0; i< std.length;i++){
//            System.out.printf("%d번째 학생의 수학점수 입력:",i+1);
//            std[i] = sc.nextInt();
//            sum+=std[i];
//
//        }
//        System.out.println();
//        for (int i = 0;i < n; i++){
//            System.out.printf("%d번째 학생의 수학점수: %d\n",i+1,std[i]);
//
//        }
//        System.out.printf("평균 점수: %.2f",sum/(double)n);

//        int[] scores = new int[5];
        int[][] test = new int[3][5];

        //반 학생수를 입력받고, 학생의 국어 점수, 수학 점수, 영어 점수
        //국어 평균, 수학평균, 영어평균을 나타내는 프로그램

//        System.out.print("학생 수 입력하기: ");
//        int n = sc.nextInt();
//        int[][] scores = new int[n][3];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//                switch (j) {
//                    case 0:
//                        System.out.printf("%d번째 학생의 국어점수 입력: ", i + 1);
//                        scores[i][j] = sc.nextInt();
//                        break;
//                    case 1:
//                        System.out.printf("%d번째 학생의 수학점수 입력: ", i + 1);
//                        scores[i][j] = sc.nextInt();
//                        break;
//                    case 2:
//                        System.out.printf("%d번째 학생의 영어점수 입력: ", i + 1);
//                        scores[i][j] = sc.nextInt();
//                        break;
//                    default:
//                        break;
//                }
//
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//                switch (j) {
//                    case 0:
//                        System.out.printf("%d번째 학생의 국어점수: %d\n", i+1,scores[i][j]);
//
//                        break;
//                    case 1:
//                        System.out.printf("%d번째 학생의 수학점수: %d\n", i + 1, scores[i][j]);
//
//                        break;
//                    case 2:
//                        System.out.printf("%d번째 학생의 영어점수: %d\n", i + 1, scores[i][j]);
//
//                        break;
//                    default:
//                        break;
//                }
//            }
//
//
//        }
        System.out.print("학생 수 입력하기: ");
        int students = sc.nextInt();
        int[][] scores = new int[students][3];



        for(int i = 0;i<students;i++){
            for(int j = 0;j<3;j++){
                System.out.println(i+1+"번째의 학생");
                System.out.print("이름 입력: ");
                switch (j) {
                    case 0:
                        System.out.print("국어점수 입력: ");
                        scores[i][j] = sc.nextInt();
                        break;
                    case 1:
                        System.out.print("수학점수 입력: ");
                        scores[i][j] = sc.nextInt();
                        break;
                    case 2:
                        System.out.print("영어점수 입력: ");
                        scores[i][j] = sc.nextInt();
                        break;
                    default:
                        break;
                }
            }
        }
//        double[] avg = new double[3];
        double korean = 0;
        double math = 0;
        double english = 0;
        double[] avg = new double[3];
        double[] avg1 = {0,0,0};
//        for(int i=0;i<avg.length;i++){
//            avg[i] = 0;
//        }

        for (int i = 0; i<students;i++){
            korean+= scores[i][0];
            math+=scores[i][1];
            english+=scores[i][2];


        }
        System.out.printf("국어 평균: %.2f\n",korean);
        System.out.printf("수학 평균: %.2f\n",math);
        System.out.printf("영어 평균: %.2f\n",english);
    }
}

package Basic2;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class Qiuz {
    public static void main(String[] args) {
        //유저에게 학생 이름과 국영수 점수를 n명 입력받고
        // 반 평균 점수를 나타내고, 1등 학생 구하기
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수 입력하기:");

        int n = sc.nextInt();


        Student[] std = new Student[n];
        sc.nextLine();
//        double[] avg = new double[n];
//        String[] name = new String[n];
//        double[] temp = new double[3];

        for (int i = 0;i< std.length;i++){
//            System.out.print("이름 입력하기:");
//            std[i].name = sc.nextLine();
//            sc.nextLine();
//            System.out.print("국어 점수 입력하기:");
//
//            std[i].korean = sc.nextInt();
//
//            System.out.print("수학 점수 입력하기:");
//            std[i].math = sc.nextInt();
//            System.out.print("영어 점수 입력하기:");
//            std[i].english = sc.nextInt();
//
//            avg[i] = (std[i].korean+std[i].math+std[i].english)/(double)3;

            std[i] = new Student();
            System.out.print("이름: ");
            std[i].name =sc.nextLine();



            System.out.print("국어 점수:");
            std[i].korean = sc.nextInt();
            sc.nextLine();
            System.out.print("수학 점수:");
            std[i].math = sc.nextInt();
            sc.nextLine();
            System.out.print("영어 점수:");
            std[i].english = sc.nextInt();
            sc.nextLine();
        }
        double avg = 0;

        double max = 0;
        int summa = 0;
        for (int i = 0;i< std.length;i++){
            double studentAvg=(std[i].korean + std[i].math+std[i].english)/3.0;
            if(max<studentAvg){
                max += studentAvg;
                summa = i;
            }
            avg+=studentAvg;

        }
        System.out.printf("반 평균 : %.2f", avg/std.length);
        System.out.println("반 일등 학생:"+std[summa].name);


    }
}

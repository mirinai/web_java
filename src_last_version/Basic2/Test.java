package Basic2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //기본타입 <->참조타입
        Student lim = new Student();
        lim.name = "aaa";
        lim.korean = 78;
        lim.math = 67;
        lim.english = 88;
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수:");
        int studentNum = sc.nextInt();
        Student[] school = new Student[studentNum];
        sc.nextLine(); // 엔터 대신 먹어서 밑의 코드에 아무 일도 없게 함
//        int[][] scores = new int[school.length][3];
//        for(int i = 0;i<school.length;i++){
//            for(int j=0;j<3;j++){
//                scores[i][j] = 0;
//            }
//        }

//        school[0] = lim;
//        school[1] = new Student();
//        school[1].
        for (int i = 0;i<school.length;i++){
            school[i] = new Student();
            System.out.printf("%d번째 이름 입력: ",i+1);
            school[i].name = sc.nextLine();


            System.out.printf("%d번째 국어점수 입력: ",i+1);
            school[i].korean =sc.nextInt();
            
//            scores[i][0]+= school[i].korean;
            
            System.out.printf("%d번째 수학점수 입력: ",i+1);
            school[i].math =sc.nextInt();
            
//            scores[i][1]+= school[i].math;
            
            System.out.printf("%d번째 영어점수 입력: ",i+1);
            school[i].english =sc.nextInt();
            sc.nextLine();
//            scores[i][2]+= school[i].english;
        }
        System.out.println();

        for(int i = 0;i<school.length;i++){
            System.out.println("학생 이름: "+school[i].name);
            System.out.println("국어 점수: "+school[i].korean);
            System.out.println("수학 점수: "+school[i].math);
            System.out.println("영어 점수: "+school[i].english+"\n");
        }

        double[] avg = {0,0,0};

        for(int i = 0; i < school.length;i++){
            avg[0] += school[i].korean;
            avg[1] += school[i].math;
            avg[2] += school[i].english;
        }
        System.out.printf("국어 평균: %.2f\n", avg[0] / (double) school.length);
        System.out.printf("수학 평균: %.2f\n", avg[1] / (double) school.length);
        System.out.printf("영어 평균: %.2f\n", avg[2] / (double) school.length);




    }
}

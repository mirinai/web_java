package OOP.Try;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("정수 입력: ");
            int a = sc.nextInt();
            System.out.printf("입력한 정수: %d\n",a);
        } catch (Exception e){
            System.out.println("다른거 넣음");
            throw new RuntimeException(e);
        }
    }
}

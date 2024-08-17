package Basic;

public class Print {
    public static void main(String[] args) {
        System.out.print("몰라1\n");
        System.out.println("몰라2");
        System.out.println("몰라3");

        int age = 21;
        System.out.println("나이: " + age);
        //formatter(바꿔주기)
        //%d - 정수, %f - 실수, %c - 문자, %s - 문자열(string), %b - 불리언
        System.out.printf("나이: %d", age);
        System.out.println("\n");

        //현재 코스피를 담는 변수를 선언해서
        //출력으로 현재 코스피는 ~~이다
        double kospi = 2697.23;

        

        //저년 메뉴 변수를 선언해서 데이터 넣고 아래와 같이 출력
        //오늘 저녁메뉴는 ~~이다.
        String dinnerMenu = "as";

        System.out.println("현재 코스피는 "+kospi+"이다");
        System.out.printf("현재 코스피는 %.2f이다\n",kospi);
        System.out.println("저녁메뉴는 "+dinnerMenu+"이다");
        System.out.printf("저녁메뉴는 %s이다",dinnerMenu);
    }
}

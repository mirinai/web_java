package Basic;

public class DataType {
    public static void main(String[] args) {
        //컴파일 언어 => 데이터타입 변수이름 = 값;

        //기본 데이터 타입

        // RAN[4byte]
        //4byte => 32bit
        // -2^32 ~ 2^32-1 ( 2^32 + 1[부호비트])
        int num = 1;//정수

        //double[8byte], float[4byte]
        double pi = 3.14;//실수

        //boolean[1byte]
        boolean is12 = true;//불리언

        //char[2byte(16bit)]
        char initial = 'K';//문자



        //참조 데이터 타입
        //@@ 타입 참조 [heap(동적) 메모리]
        String lunch = "쌀국수";
        System.out.println(lunch);

        System.out.println(num);
        System.out.println(pi);
        System.out.println(is12);
        System.out.println(initial);


    }
}

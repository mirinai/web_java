package Basic;

public class TypeCasting {
    public static void main(String[] args) {
        //타입 바꾸기

        //기본 타입 변환
        // 작은 범위 -> 큰 범위(암묵적 타입캐스팅)
        int inum1 = 10;
        int inum2 = inum1;
        double fnum1 = inum1; //실수 넓은 범위(정수)
        
        //(타입): 타입 캐스팅 연산자
        //강제적, 명시적 타입 캐스팅
        double fnum2 = 3.14;
        int inum3 = (int)fnum2;
        
    }
}

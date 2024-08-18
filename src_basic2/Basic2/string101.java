package Basic2;

public class string101 {
    public static void main(String[] args) {
        String nugu1 = "몰라";
        String nugu2 = "몰라";
        String nugu3 = new String("몰라");
        System.out.println(nugu1);
        System.out.println(nugu2);
        System.out.println(nugu3);
        System.out.println(nugu1 == nugu2);
        System.out.println(nugu1 == nugu3);
        System.out.println(nugu1.equals(nugu3));

        /*
        *
몰라
몰라
몰라
true
false
true

nugu1과 nugu2
nugu1과 nugu2는 동일한 문자열 리터럴 "몰라"를 참조하고 있습니다.
Java에서는 문자열 리터럴이 동일할 경우, 자바 런타임이 이를 효율적으로 처리하기 위해 String Pool이라는 메모리 영역에 문자열을 저장합니다.
이때, 동일한 리터럴을 가진 nugu1과 nugu2는 같은 메모리 주소를 참조하게 되므로, nugu1 == nugu2는 true를 반환합니다.
2. nugu3
nugu3는 new String("몰라")로 생성되었습니다.
이 경우, 새로운 String 객체가 힙 메모리에 할당되며, nugu3는 새로운 메모리 주소를 참조하게 됩니다.
따라서, nugu1 == nugu3는 서로 다른 메모리 주소를 비교하게 되므로 false를 반환합니다.
결론
nugu1 == nugu2는 true입니다. 둘 다 같은 문자열 리터럴 "몰라"를 가리키고 있으며, 같은 메모리 주소를 참조합니다.
nugu1 == nugu3는 false입니다. nugu3는 new String()을 사용하여 새로운 객체를 생성했기 때문에, nugu1과 nugu3는 서로 다른 메모리 주소를 참조하고 있기 때문입니다.
이와 같은 결과가 나오는 이유는 자바에서 == 연산자는 객체의 메모리 주소를 비교하기 때문에, 문자열 내용을 비교하려면 equals() 메서드를 사용하는 것이 좋습니다.
        * */
    }
}

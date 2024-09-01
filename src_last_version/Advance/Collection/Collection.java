package Advance.Collection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

// Data - List[순서있음, 겹쳐도 됨], Set[겹치면 안됨, 순서없음], Map(JS의 Object)
public class Collection {
    public static void main(String[] args) {
        //list, string만 들어감
        ArrayList<String> baskin = new ArrayList<>();
        baskin.add("바닐라");
        baskin.add("소금우유");
        baskin.add("피스타치오");

        for(int i = 0;i<baskin.size();i++){
            System.out.println(baskin.get(i));
        }
        System.out.print("\n\n");
        HashSet<String> coupangCart = new HashSet<>();
        coupangCart.add("폴란드 우유");
        coupangCart.add("8핀 이어폰");
        coupangCart.add("옷");
        coupangCart.add("선크림");
        
//        for (int i = 0;i<coupangCart.size();i++){
//            System.out.println(coupangCart.);
//        }
        for (String item:coupangCart){
            System.out.println(item);
        }

        HashMap<Integer,String> itClass = new HashMap<>();
        itClass.put(1,"자바");
        itClass.put(2,"C");
        itClass.put(3,"파이썬");

        System.out.print("\n\n");
        System.out.println(itClass.get(2));
    }
}

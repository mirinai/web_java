package OOP.Generic;

import java.util.ArrayList;

public class AndroidPhone<T extends AndroidApp> {
    private String name;
    ArrayList<T> app = new ArrayList<>();


    public AndroidPhone(String name){
        this.name=name;
    }
    public void downloadApp(T newApp){
        this.app.add(newApp);
    }
    public void getNameApp(){
        for (int i = 0;i<this.app.size();i++){
            System.out.println(this.app.get(i).getName());
        }


    }
    public void getTotalVolume(){
        double totalVolume = 0;
        for (int i = 0;i<this.app.size();i++){
            totalVolume+=this.app.get(i).getVolume();

        }
        System.out.println("모든 용량:"+totalVolume);
    }
}

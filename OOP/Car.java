package OOP;

//접근 제한자: public, private..


//variables: name, car_species, company_name, present_velocity
//메소드: raising_velocity, lowering_velocity, setting_velocity_to_zero
public class Car {
    String name;
    String car_species;
    String company_name;
    private double present_velocity;

    public Car(String name, String car_species, String company_name) {
        this.name = name;
        this.car_species = car_species;
        this.company_name = company_name;
        this.present_velocity = 0;
    }

    //    Car(String name, String car_species, String company_name, double present_velocity){
//        this.name = name;
//        this.car_species= car_species;
//        this.company_name= company_name;
//        this.present_velocity=present_velocity;
//
//    }

    void raising_velocity(){
        this.present_velocity += 10;

    }
    void lowering_velocity(){
        if(this.present_velocity <=0){
            this.present_velocity=0;
        }
        else {
            this.present_velocity -= 10;
        }


    }
    void setting_velocity_to_zero(){
        this.present_velocity = 0;

    }
    void showSpeed(){
        System.out.println("현재속도: "+this.present_velocity);
    }

}

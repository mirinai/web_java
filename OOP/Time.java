package OOP;


//00:00:00
//23:59:59
//00:00:00
public class Time {
    int hour;
    int minuite;
    int second;

    public Time() {
        this.hour = 0;
        this.minuite = 0;
        this.second = 0;
        System.out.println("Time initialized to 00:00:00");
    }

    public int getHour(){
        return this.hour;
    }
    public int getMinuite(){
        return this.minuite;
    }
    public int getSecond(){
        return this.second;
    }
    void rasing_time(){
        this.second++;
        if (this.second>=60){
            this.second = 0;
            this.minuite++;

        }
        if (this.minuite>=60){
            this.minuite=0;
            this.hour++;

        }
        if(this.hour>=24){
            this.hour=0;

        }


    }
}

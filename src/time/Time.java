/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Gabriela
 */
public class Time {

    private int hour;
    private int minute;
    
    public void setHour(int h){
        hour = h;
    }
    
    public void setMinute(int m){
        minute = m;
    }
    
    public int getHour(){
        return(hour);
    }
    
    public int getMinute(){
        return(minute);
    }
    
    Time() {};
    
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(16);
        t.setMinute(47);
        System.out.println("The time now is " + t.hour + ":" + t.minute);        
    }
    
}

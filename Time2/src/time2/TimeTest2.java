/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time2;

/**
 *
 * @author Dar Computers
 */
final class Time2 {

    private int hour;	// 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

//	Time2 no-argument constructor:
//	initializes each instance variable to zero 
    public Time2() {
        this(0, 0, 0); // invoke Time2 constructor with three arguments 
    } // end Time2 no-argument constructor

//Time2 constructor: hour supplied, minute and second defaulted to 0 
    public Time2(int h) {

        this(h, 0, 0); // invoke Time2 constructor with three arguments 
    } // end Time2 one-argument constructor

//Time2 constructor: hour and minute supplied, second defaulted to 0 
    public Time2(int h, int m) {
        this(h, m, 0); // invoke Time2 constructor with three arguments
    } // end Time2 two-argument constructor

//Time2 constructor: hour, minute and second supplied 
    public Time2(int h, int m, int s) {
        setTime(h, m, s); // invoke setTime to validate time 
    } // end Time2 three-argument constructor

//Time2 constructor: another Time2 object supplied 
    public Time2(Time2 time) {
// invoke Time2 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    } // end Time2 constructor with a Time2 object argument
//	Set Methods
//	set a new time value using universal time;
//	validate the data

    public void setTime(int h, int m, int s) {
        setHour(h); // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    } // end method setTime

//validate and set hour
    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } else {
            throw new IllegalArgumentException("hour must be 0-23");
        }
    } // end method setHour

//validate and set minute
    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } else {
            throw new IllegalArgumentException("minute must be 0-59");
        }
    } // end method setMinute

//validate and set second 
    public void setSecond(int s) {

        if (s >= 0 && s < 60) {
            second = ((s >= 0 && s < 60) ? s : 0);
        } else {
            throw new IllegalArgumentException("second must be 0-59");
        }
    } // end method setSecond

//	Get Methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {

        return second;
    }
//convert to String in universal-time format (HH:MM:SS)

    public String toUniversalString() {

        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

//convert to String in standard-time format (H:MM:SS AM or PM) 
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    } // end method toString
    
    // increments time by 1 second
    public void tick() {
        
        // if second is 59
        if (getSecond() == 59) {
            
            // second gets back to 0, minute is incremented
            setSecond(0);
            incrementMinute();
            
        } // end of if body
        
        // if second is between 0 - 59, incremented by 1
        else
            setSecond(getSecond() + 1);
        
    } // end of tick method
    
    // increments time by 1 minute
    public void incrementMinute() {
        
        // if minute is 59
        if (getMinute() == 59) {
            
            // minute gets back to 0, hour is incremented
            setMinute(0);
            incrementHour();
            
        } // end of if body
        
        // if minute is between 0 - 59, incremented by 1
        else
            setMinute(getMinute() + 1);
        
    } // end of incrementMinute method
    
    // increments time by 1 hour
    public void incrementHour() {
        
        // if hour is 23
        if (getHour() == 23)
            // hour gets back to zero
            setHour(0);
        
        // if hour is between 0 - 23, incremented by 1
        else
            setHour(getHour() + 1);
        
    } // end of tick method

} // end class Time2

// This class tests the Time Class by creating different objects. 
public class TimeTest2 {

    public static void main(String[] args) {
        Time2 t0 = new Time2();	// Set Time to 00:00:00 
        Time2 t1 = new Time2(11);	// Set Time to 11:00:00
        Time2 t2 = new Time2(12, 59);// Set Time to 12:40:00 
        Time2 t33 = new Time2(23, 40, 55); // Set Time to 23:40:55
        Time2 t3 = new Time2(t33); // using copy contructor
        Time2 t4 = new Time2(23, 59, 59); // Set Time to 23:40:65 
        
// Print All Times in Universal Format 
        System.out.printf("Before tick(): %s\n", t0.toUniversalString());
        t0.tick();
        System.out.printf("After tick(): %s\n\n", t0.toUniversalString());
        
        System.out.printf("Before incrementMinute(): %s\n", t1.toUniversalString());
        t1.incrementMinute();
        System.out.printf("After incrementMinute(): %s\n\n", t1.toUniversalString());
        
        System.out.printf("Before incrementMinute(): %s\n", t2.toUniversalString());
        t2.incrementMinute();
        System.out.printf("After incrementMinute(): %s\n\n", t2.toUniversalString());
        
        System.out.printf("Before incrementHour(): %s\n", t3.toUniversalString());
        t3.incrementHour();
        System.out.printf("After incrementHour(): %s\n\n", t3.toUniversalString());
        
        System.out.printf("Before tick(): %s\n", t4.toUniversalString());
        t4.tick();
        System.out.printf("After tick(): %s\n\n", t4.toUniversalString());
        
// Print All Times in Standard Format
        System.out.println("In Universal Format:\n");
        System.out.println(t0);// toString method invoked on objects implicitly 
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
    } // end of main method
    
} // end of class TimeTest2

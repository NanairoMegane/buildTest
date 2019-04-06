package hello;

import org.joda.time.LocalTime;

public class Hello{
    public static void main(String[] args) {
        printTime();
        Greeter g = new Greeter();
        System.out.println(g.say());
    }

    public static void printTime(){
        LocalTime time = new LocalTime();
        System.out.println(time);
    }
}
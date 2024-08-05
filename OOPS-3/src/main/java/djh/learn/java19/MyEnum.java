package djh.learn.java19;

import java.util.Arrays;

public class MyEnum {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(Arrays.stream(Day.values()).toList());
        System.out.println(Day.MONDAY instanceof Day);
        System.out.println(Day.MONDAY instanceof Enum<?>);
        System.out.println(Day.MONDAY instanceof Enum);
        print(Day.FRIDAY);
        print(Day.SATURDAY);
        print(Day.MONDAY);
        print(Day.SUNDAY);
        System.out.println(Day.MONDAY.CURRENT_VALUE);
    }

    public static void print(Day day){
        switch (day){
            case SATURDAY,SUNDAY -> System.out.println("Weekand");
            case MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY -> System.out.println("Working Day");
            default -> System.out.println("Unknown Day");
        }
    }
}

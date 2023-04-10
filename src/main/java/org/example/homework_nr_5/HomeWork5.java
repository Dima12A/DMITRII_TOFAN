package org.example.homework_nr_5;

public class HomeWork5 {
    public static void main(String[] args) {
        for (Month month : Month.values()) {
            System.out.println(month);
        }

        Weekday weekday = Weekday.SUNDAY;
        System.out.println(weekday.isHoliday()); // true
    }

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekDay() {
            return this != SATURDAY && this != SUNDAY;
        }

        public boolean isHoliday() {
            return !isWeekDay();
        }
    }

        }







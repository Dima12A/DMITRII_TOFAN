package org.example.homework_nr_5;

public class convert {
    public static void main(String[] args) {

        // Преобразование в примитивные типы данных:

        // “true” -> boolean

        String str = "true";
        boolean a = Boolean.parseBoolean(str);
        System.out.println(a);

        // “120" -> byte

        String b = "120";
        byte num = Byte.parseByte(b);
        System.out.println(num);

        // “32000” -> short

        String c = "32000";
        short num2 = Short.parseShort(c);
        System.out.println(num2);

        // “147895632" -> int

        String d = "147895632";
        int num3 = Integer.valueOf(d);
        System.out.println(num3);

        // “987654321987654321” -> long

        String e = "987654321987654321";
        long num4 = Long.valueOf(e);
        System.out.println(num4);

        // “4444.5d” -> double

        String f = "4444.5d";
        double num5 = Double.valueOf(f);
        System.out.println(num5);

        // “2354.56f” -> float

        String r = "2354.56f";
        float num6 = Float.valueOf(r);
        System.out.println(num6);


    }
}


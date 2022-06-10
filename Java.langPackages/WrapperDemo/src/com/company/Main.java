package com.company;

public class Main {

    public static void main(String[] args) {
        Integer a = new Integer(10);//deprecated method
        Integer b = Integer.valueOf(10);
        Integer c = 10;
        Integer d = Integer.valueOf("10");
        int e = 10;

        byte f = 10;
        Byte h = 10;
        Byte i = Byte.valueOf(f);
        Byte j = Byte.valueOf("10");

        short k = 10;
        Short l = 10;
        Short m = Short.valueOf((short) 10);
        Short n = Short.valueOf("10");

        float o = 12.4f;
        Float p = 12.4f;
        Float q = Float.valueOf(12.4f);
        Float r = Float.valueOf("12.4");

        double s = 12.4556;
        Double t = 12.4556;
        Double u = Double.valueOf(12.4556);
        Double v = Double.valueOf("12.4556");

        boolean w = true;
        Boolean x = true;
        Boolean y = Boolean.valueOf(true);
        Boolean z = Boolean.valueOf("true");

        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        char char1 = 'a';
        Character char2 = 'b';
        Character char3 = Character.valueOf('a');









    }
}

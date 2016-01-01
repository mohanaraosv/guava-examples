package com.mycompany.guava.base;

import com.google.common.base.Converter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;

/**
 * @author mohanarao_sv
 *
 */
public class ConverterExample {

    public static void main(final String[] args) {

        // short to string - string to shrot
        Short shortVal = Shorts.stringConverter().convert("5");

        System.out.println(shortVal);

        String valAsString = Shorts.stringConverter().reverse().convert(new Short("5"));

        System.out.println(valAsString);

        // same float, double, int, long

        BiMap<String, String> stateCapitals = HashBiMap.create();
        stateCapitals.put("Wisconsin", "Madison");
        stateCapitals.put("Iowa", "Des Moines");
        stateCapitals.put("Minnesota", "Saint Paul");
        stateCapitals.put("Illinois", "Springfield");
        stateCapitals.put("Michigan", "Lansing");
        Converter<String, String> converter = Maps.asConverter(stateCapitals);
        String state = converter.reverse().convert("Madison");
        System.out.println(state);

        doublesConverter();

        floatConverter();

        integerConverter();

        shortConverter();

        longConverter();
    }

    private static void doublesConverter() {
        Double val = Doubles.stringConverter().convert("1.0");
        System.out.println("Double Value :" + val);
        String valAsString = Doubles.stringConverter().reverse().convert(new Double(1));
        System.out.println("Double String value :" + valAsString);
    }

    private static void floatConverter() {
        Float val = Floats.stringConverter().convert("2.0");
        System.out.println("Float Value :" + val);
        String valAsString = Floats.stringConverter().reverse().convert(new Float(2));
        System.out.println("Float String value :" + valAsString);
    }

    private static void integerConverter() {
        Integer val = Ints.stringConverter().convert("3");
        System.out.println("Float Value :" + val);
        String valAsString = Ints.stringConverter().reverse().convert(new Integer(3));
        System.out.println("Float String value :" + valAsString);
    }

    private static void longConverter() {
        Long val = Longs.stringConverter().convert("4");
        System.out.println("Long Value :" + val);
        String valAsString = Longs.stringConverter().reverse().convert(new Long(4));
        System.out.println("Long String value :" + valAsString);
    }

    private static void shortConverter() {
        Short val = Shorts.stringConverter().convert("5");
        System.out.println("Short Value :" + val);
        String valAsString = Shorts.stringConverter().reverse().convert(new Short("5"));
        System.out.println("Short String value :" + valAsString);
    }
}

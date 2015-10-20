package com.mycompany.guava.base;

import com.google.common.base.Converter;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
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
    }
}

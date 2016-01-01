package com.mycompany.guava.common;

import java.util.List;

import com.google.common.collect.Lists;
import com.google.common.primitives.Booleans;

/**
 * @author mohanarao_sv
 *
 */
public class BooleansExample {

    public static void main(final String[] args) {

        System.out.println("Boolean Count : " + getBooleansCount());

        System.out.println("Boolean List : " + getBooleansList());

        System.out.println("Concat Boolean List : " + getConcatBooleans());

        System.out.println("Boolean Contains : " + booleanContains());

        System.out.println("Boolean Index : " + booleanIndex());

        System.out.println("Boolean Joined : " + booleanJoin());

        System.out.println("Boolean Convert to primitive : " + convertToPrimitive());

    }

    private static int getBooleansCount() {
        boolean[] values = { true, true, false, true, false };
        int count = Booleans.countTrue(values);
        return count;
    }

    private static List<Boolean> getBooleansList() {
        boolean[] booleanArray = { true, false, true, false };
        List<Boolean> booleans = Booleans.asList(booleanArray);
        return booleans;
    }

    private static boolean[] getConcatBooleans() {
        boolean[] booleanArray1 = { true, false };
        boolean[] booleanArray2 = { true, false };
        boolean[] concatedArray = Booleans.concat(booleanArray1, booleanArray2);
        return concatedArray;
    }

    private static boolean booleanContains() {
        boolean[] booleanArray = { true, false, true, false };
        boolean arrayContains = Booleans.contains(booleanArray, true);
        return arrayContains;
    }

    private static int booleanIndex() {
        boolean[] booleanArray = { true, false, true, false };
        int index = Booleans.indexOf(booleanArray, false);
        return index;
    }

    private static String booleanJoin() {
        boolean[] booleanArray = { true, false, true, false };
        String joinedElements = Booleans.join("-", booleanArray);
        return joinedElements;
    }

    private static boolean[] convertToPrimitive() {
        List<Boolean> booleans = Lists.newArrayList(
                Boolean.TRUE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE);
        boolean[] primitiveArray = Booleans.toArray(booleans);
        return primitiveArray;
    }
}

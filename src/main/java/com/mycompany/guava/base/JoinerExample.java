package com.mycompany.guava.base;

import java.util.Arrays;

import com.google.common.base.Joiner;

/**
 * @author mohanarao_sv
 *
 */
public class JoinerExample {

    public static void main(final String[] args) {
        String joinerString = Joiner.on(",").skipNulls().join(Arrays.asList("Larry", "Moe", null, "Curly"));
        System.out.println(joinerString);
    }
}

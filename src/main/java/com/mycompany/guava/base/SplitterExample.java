package com.mycompany.guava.base;

import com.google.common.base.Splitter;

/**
 * @author mohanarao_sv
 *
 */
public class SplitterExample {

    public static void main(final String[] args) {

        Iterable<String> values = Splitter.on(",").trimResults().omitEmptyStrings().split("foo,bar,,   qux");
        for (String currentValue : values) {
            System.out.println(currentValue);
        }
    }
}

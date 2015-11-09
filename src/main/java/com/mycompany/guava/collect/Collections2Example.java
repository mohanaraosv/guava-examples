package com.mycompany.guava.collect;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

/**
 * @author mohanarao_sv
 *
 */
public class Collections2Example {

    public static void main(final String[] args) {
        // Filter using collection utils
        List<String> strings = Lists.newArrayList(null, "www", null, "leveluplunch", "com", null);

        Collection<String> filterStrings = Collections2.filter(
                strings, new Predicate<String>() {

                    @Override
                    public boolean apply(final String input) {
                        return (input != null) && (input.length() >= 3);
                    }
                });
        System.out.println(filterStrings);

        // Permutation
        List<Integer> vals = Ints.asList(new int[] { 1, 2, 3 });

        Collection<List<Integer>> orderPerm = Collections2.permutations(vals);

        for (List<Integer> val : orderPerm) {
            System.out.println(val);
        }
    }

}

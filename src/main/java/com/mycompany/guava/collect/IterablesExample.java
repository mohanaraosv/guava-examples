package com.mycompany.guava.collect;

import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @author mohanarao_sv
 *
 */
public class IterablesExample {

    /**
     * Filter by class type
     */
    public void filter_elements_by_type() {
        List<Object> randomObjects = Lists.newArrayList();
        randomObjects.add(new Integer(15));
        randomObjects.add(new Double(12));
        randomObjects.add("hello");
        randomObjects.add(Lists.newArrayList());
        randomObjects.add(Maps.newConcurrentMap());
        randomObjects.add("world");
        Iterable<String> strings = Iterables.filter(randomObjects, String.class);
        System.out.println("Strings objects in list :" + strings);
    }

    /**
     * Combine two iterables
     */
    public void concat_two_iterables() {
        List<String> list1 = Lists.newArrayList("one");
        List<String> list2 = Lists.newArrayList("two");
        Iterable<String> oneAndTwo = Iterables.concat(list1, list2);
        System.out.println("combining two lists : " + oneAndTwo);
    }

    /**
     * Find element
     */
    public void find_element_in_iterable() {
        List<Integer> numbers = Lists.newArrayList(new Integer(1), new Integer(2), new Integer(3));
        Integer value = Iterables.find(numbers, new Predicate<Integer>() {

            @Override
            public boolean apply(final Integer number) {
                return number == 3;
            }
        });
        System.out.println("Finding value in the list :" + value);
    }

    /**
     * First non null
     */
    public void find_first_non_null() {
        List<String> strings = Lists.newArrayList(null, "Little", null, "Drummer", "Boy");
        String firstNonNull = Iterables.find(strings, Predicates.notNull());
        System.out.println("First non null value :" + firstNonNull);
    }

    /**
     * Frequency of objects
     */
    public void frequency_of_object_in_iterable() {
        String jingleChorus = "Oh, jingle bells, jingle bells " + "Jingle all the way " + "Oh, what fun it is to ride " + "In a one horse open sleigh "
                + "Jingle bells, jingle bells " + "Jingle all the way " + "Oh, what fun it is to ride " + "In a one horse open sleigh";
        List<String> words = Splitter.on(CharMatcher.anyOf(" .")).trimResults(CharMatcher.is('.')).omitEmptyStrings().splitToList(jingleChorus.toLowerCase());
        int numberOfOccurences = Iterables.frequency(words, "jingle");
        System.out.println("No of occurences : " + numberOfOccurences);
    }

    /**
     * First element
     */
    public void get_first_element_in_list() {
        List<String> strings = Lists.newArrayList("one", "two", "three");
        String firstElement = Iterables.getFirst(strings, null);
        System.out.println("First element in the list :" + firstElement);
    }

    /**
     * Last element
     */
    public void get_last_element_in_iterable() {
        List<String> strings = Lists.newArrayList("one", "two", "three");
        String lastElement = Iterables.getLast(strings, null);
        System.out.println("Last element in the list :" + lastElement);
    }

    /**
     * All elements
     */
    public void iterable_contains_all() {
        List<String> cookies = Lists.newArrayList("Peanut Butter Cookies", "Oatmeal-Raisin Cookies", "Basic Chocolate Chip Cookies");
        boolean containsCookie = Iterables.all(cookies, new Predicate<String>() {

            @Override
            public boolean apply(final String input) {
                return input.toLowerCase().contains("cookie");
            }
        });

        System.out.println("Match case in list : " + containsCookie);
    }

    /**
     * Any element in iterable
     */
    public void iterable_contains_any() {
        List<String> cookies = Lists.newArrayList("Peanut Butter", "Oatmeal-Raisin", "Basic Chocolate Chip Cookies");
        boolean containsCookie = Iterables.any(cookies, new Predicate<String>() {

            @Override
            public boolean apply(final String input) {
                return input.toLowerCase().contains("cookie");
            }
        });

        System.out.println("Match case in list :" + containsCookie);
    }

    /**
     * Number of elements in iterable
     */
    public void iterables_size() {
        List<Integer> randomNumbers = Lists.newArrayList(new Integer(23), new Integer(33), new Integer(44));
        int iterableSize = Iterables.size(randomNumbers);
        System.out.println("Iterable Size : " + iterableSize);
    }

    /**
     * Get element at specified position
     */
    public void get_iterable_element_by_index() {
        String baconIpsum = "Bacon ipsum dolor sit " + "amet tri-tip rump shoulder " + "kielbasa strip steak";
        Iterable<String> chars = Splitter.on(CharMatcher.WHITESPACE).split(baconIpsum);
        String elementAtPos5 = Iterables.get(chars, 5);
        System.out.println("Get iterable element by index : " + elementAtPos5);

    }

    /**
     * Tranform elements in iterable
     */
    public void tranform_elements_in_iterable() {
        List<String> numbersAsStrings = Lists.newArrayList("1", "2", "3");
        Iterable<Double> doubles = Iterables.transform(numbersAsStrings, new Function<String, Double>() {

            @Override
            public Double apply(final String input) {
                return new Double(input);
            }
        });

        System.out.println("Transform list to iterables : " + doubles);
    }

    public static void main(final String[] args) {
        IterablesExample iterablesExample = new IterablesExample();
        iterablesExample.filter_elements_by_type();
        iterablesExample.concat_two_iterables();
        iterablesExample.find_element_in_iterable();
        iterablesExample.find_first_non_null();
        iterablesExample.frequency_of_object_in_iterable();
        iterablesExample.get_first_element_in_list();
        iterablesExample.get_last_element_in_iterable();
        iterablesExample.iterable_contains_all();
        iterablesExample.iterable_contains_any();
        iterablesExample.iterables_size();
        iterablesExample.get_iterable_element_by_index();
        iterablesExample.tranform_elements_in_iterable();
    }
}

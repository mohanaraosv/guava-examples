package com.mycompany.guava.collect;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * @author mohanarao_sv
 *
 */
public class BiMapExample {

    public static void main(final String[] args) {
        // Made map key to value, value to key vice versa

        BiMap<String, String> dialectConverterForWisconsinites = HashBiMap.create();

        dialectConverterForWisconsinites.put("bratwurst", "brat");
        dialectConverterForWisconsinites.put("drinking fountain", "bubbler");
        dialectConverterForWisconsinites.put("that", "dat");
        dialectConverterForWisconsinites.put("alright", "iet");
        dialectConverterForWisconsinites.put("soda", "pop");

        BiMap<String, String> dialectConverterForEveryoneElse = dialectConverterForWisconsinites.inverse();

        System.out.println(dialectConverterForEveryoneElse);

    }
}

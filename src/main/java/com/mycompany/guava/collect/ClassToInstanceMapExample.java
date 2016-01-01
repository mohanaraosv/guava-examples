/*
 * This software is produced by EVRY FS. Unauthorized redistribution,
 * reproduction or usage of this software in whole or in part without
 * the express written consent of EVRY FS is strictly prohibited.
 * Copyright © 2016 EVRY. ALL RIGHTS RESERVED
 */
package com.mycompany.guava.collect;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

/**
 * @author mohanarao_sv
 *
 */
public class ClassToInstanceMapExample {

    class Person {

        private final String name;

        public Person(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("name", name)
                    .toString();
        }
    }

    class Jobs {

        private final String jobName;

        public Jobs(final String jobName) {
            this.jobName = jobName;
        }

        public String getJobName() {
            return jobName;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("jobName", jobName)
                    .toString();
        }
    }

    class Address {

        private final String streetName;

        public Address(final String streetName) {
            this.streetName = streetName;
        }

        public String getStreetName() {
            return streetName;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this)
                    .add("streetName", streetName)
                    .toString();
        }
    }

    public void classToInstanceMap() {
        Person person = new Person("Jackson");
        Jobs jobs = new Jobs("IT person");
        Address address = new Address("505 Williams Street");
        ClassToInstanceMap<Object> classToInstanceMap = MutableClassToInstanceMap.create();
        classToInstanceMap.put(Person.class, person);
        classToInstanceMap.put(Jobs.class, jobs);
        classToInstanceMap.put(Address.class, address);
        System.out.println("Job Name : " + classToInstanceMap.getInstance(Jobs.class).getJobName());
    }

    public static void main(final String[] args) {
        ClassToInstanceMapExample classToInstanceMapExample = new ClassToInstanceMapExample();
        classToInstanceMapExample.classToInstanceMap();
    }

}

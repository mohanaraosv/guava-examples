package com.mycompany.guava.collect;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;

/**
 * @author mohanarao_sv
 *
 */
public class FunctionsExample {

    class Person {

        private final int    personId;
        private final String jobDescription;

        public Person(final int personId, final String jobDescription) {
            super();
            this.personId = personId;
            this.jobDescription = jobDescription;
        }

        public int getPersonId() {
            return personId;
        }

        public String getJobDescription() {
            return jobDescription;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(Person.class)
                    .add("personid", personId)
                    .add("job description", jobDescription)
                    .toString();
        }
    }

    class Job {

        private final int    personId;
        private final String description;

        public Job(final int personId, final String description) {
            super();
            this.personId = personId;
            this.description = description;
        }

        public int getPersonId() {
            return personId;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(Job.class)
                    .add("personid", personId)
                    .add("job description", description)
                    .toString();
        }
    }

    /**
     * Map a list of persons to jobs
     */
    public void map_obects_with_guava_function() {

        Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {

            @Override
            public Job apply(final Person person) {
                Job job = new Job(person.getPersonId(), person.getJobDescription());
                return job;
            }
        };

        List<Person> persons = Lists.newArrayList(
                new Person(1, "Husband"),
                new Person(2, "Dad"),
                new Person(3, "Software engineer"),
                new Person(4, "Adjunct instructor"),
                new Person(5, "Pepperoni hanger"));
        List<Job> jobs = Lists.transform(persons, mapPersonToJob);

        System.out.println(jobs);
    }

    public static void main(final String[] args) {
        FunctionsExample functionsExample = new FunctionsExample();
        functionsExample.map_obects_with_guava_function();
    }
}

package com.mycompany.guava.collect;

import java.util.List;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

/**
 * @author mohanarao_sv
 *
 */
public class FluentIterableExample {

    class State {

        private final String  stateAbbreviation;
        private final boolean expandedMedicade;

        public State(final String stateAbbreviation, final boolean expandedMedicade) {
            super();
            this.stateAbbreviation = stateAbbreviation;
            this.expandedMedicade = expandedMedicade;
        }

        public String getStateAbbreviation() {
            return stateAbbreviation;
        }

        public boolean isExpandedMedicade() {
            return expandedMedicade;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(State.class)
                    .add("stateAbbreviation", stateAbbreviation)
                    .add("expandedMedicade", expandedMedicade)
                    .toString();
        }
    }

    class Message {

        private String stateAbbreviation;
        private String messageToResidence;

        public String getMessageToResidence() {
            return messageToResidence;
        }

        public void setMessageToResidence(final String messageToResidence) {
            this.messageToResidence = messageToResidence;
        }

        public String getStateAbbreviation() {
            return stateAbbreviation;
        }

        public void setStateAbbreviation(final String stateAbbreviation) {
            this.stateAbbreviation = stateAbbreviation;
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(State.class)
                    .add("stateAbbreviation", stateAbbreviation)
                    .add("messageToResidence", messageToResidence)
                    .toString();
        }
    }

    /**
     * This test will filter a list of states and then transform
     * elements into messages
     *
     */
    public void filter_transform_list() {

        List<State> states = Lists.newArrayList(
                new State("MT", false),
                new State("ID", false),
                new State("WY", false),
                new State("SD", false),
                new State("NE", false),
                new State("WI", false),
                new State("IN", false),
                new State("TX", false),
                new State("CA", true),
                new State("AZ", true),
                new State("NM", true),
                new State("AR", true),
                new State("IL", true),
                new State("IA", true));
        Predicate<State> byExpandedMedicade = new Predicate<State>() {

            @Override
            public boolean apply(final State input) {
                return input.isExpandedMedicade();
            }
        };
        Function<State, Message> messages = new Function<State, Message>() {

            @Override
            public Message apply(final State state) {
                String stateCode = state.getStateAbbreviation();
                Message message = new Message();
                message.setStateAbbreviation(stateCode);
                message.setMessageToResidence("<a href='" + stateCode + "'>" + stateCode + "</a>");
                return message;
            }
        };

        List<Message> stateMessages = FluentIterable.from(states).filter(byExpandedMedicade).transform(messages).toList();

        System.out.println(stateMessages);
    }

    public static void main(final String[] args) {
        FluentIterableExample fluentIterableExample = new FluentIterableExample();
        fluentIterableExample.filter_transform_list();
    }
}

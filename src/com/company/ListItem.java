package com.company;

public class ListItem {

        String value;
        ListItem next;

        public ListItem(String value, ListItem next) {
            this.value = value;
            this.next = next;
        }



        public String getvalue() {
            return value;

        }

        public ListItem getnext() {
            return next;

        }
    }


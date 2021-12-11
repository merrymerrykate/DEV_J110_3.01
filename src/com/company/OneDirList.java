package com.company;


public class OneDirList {
    private ListItem head;
    private ListItem tail;

    public String print(){
        String line = "";
        ListItem tempEl = head;
        while (tempEl!=null){
            line = line + " "+ tempEl.getvalue();
            tempEl = tempEl.next;

        } return line;

    }

    public void addFromStart(String value) {
        if (head != null) {
            ListItem newItem = new ListItem(value, head);
            head = newItem;
        } else
            head = tail = new ListItem(value, null);

    }


    public String getFromStart() {
        if (head != null) {
            String val = head.getvalue();
            return val;
            //return head.getvalue();
        } else
            return null;
    }

    public String getRemoveFromStart() {
        if (head != null) {
            String number = head.getvalue();
            this.head = head.getnext();
            return number;
        } else
            return null;
    }

    public boolean con(String value) {
        if (head != null) {
            ListItem current = head;
            while (current != tail) {
                if (current.getvalue() == value)
                    return true;
                else current = current.getnext();
            }
            return false;
        } else
            return false;

    }

    public void addFromEnd(String value) {
        if (tail != null) {
            ListItem newItem = new ListItem(value, tail);
            tail = newItem;
        } else
            tail = head = new ListItem(value, tail);
    }


    public String getFromEnd(){
        if (tail != null) {
            return tail.getvalue();
        } else
            return null;
    }

    public String getRemoveFromEnd(){
        if (tail != null) {
            String numberof = tail.getvalue();
            ListItem movepr = head;
            while (movepr != tail){
               if (movepr.getnext() == tail) {
                   tail = movepr;
               } else

                    movepr = movepr.getnext();
            }
            return numberof;
        } else
            return null;
    }
    public boolean find (String value){
        if (head != null) {
            return true;
        } else
            return false;
    }

    public ListItem printAll () {

            ListItem move = head;
            while (move != tail) {
                String start = move.getvalue();
                move = move.getnext();
                System.out.println(start);
            }
            return move;




    }
}












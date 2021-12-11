package com.company;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Односвязный список");
	OneDirList list = new OneDirList();
	list.addFromStart("0");
	list.addFromStart("1");
	list.addFromStart("2");
	list.addFromStart("3");



	System.out.println(list.print());


    }


}

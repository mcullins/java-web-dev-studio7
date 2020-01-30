package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<Integer, String> cd1contents = new HashMap<>();
        cd1contents.put(1, "Sing with Me");
        cd1contents.put(2, "Dance with Me");
        cd1contents.put(3, "Come with Me");
        HashMap<Integer, String> dvd1contents = new HashMap<>();
        dvd1contents.put(1, "An Unexpected Journey");
        dvd1contents.put(2, "The Trolls");
        dvd1contents.put(3, "The Trolls Den");
        // TODO: Declare and initialize a CD and a DVD object.

        CD loveSongs = new CD("The Best Love Songs", 10, cd1contents, "CD", "200-500");
        DVD hobbit = new DVD("The Hobbit", 50, dvd1contents, "DVD", "570-1600");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        loveSongs.spinDisc();
        hobbit.spinDisc();
        loveSongs.readData();
        hobbit.readData();
    }
}

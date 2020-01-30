package org.launchcode.studio7;

import java.util.HashMap;

public class BaseDisc implements OpticalDisc {
    private String name;
    private int capacity;
    private HashMap<Integer, String> contents;
    private String discType;
    private String speedRange;

    public BaseDisc(String name, int capacity, HashMap<Integer, String> contents, String discType, String speedRange){
        this.name = name;
        this. capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.speedRange = speedRange;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public HashMap<Integer, String> getContents() {
        return contents;
    }

    public void setContents(HashMap<Integer, String> contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + "\nCapacity: " + this.capacity + "\nContents: " + this.contents + "\nDiscType: "
                + this.discType;
    }

    @Override
    public void spinDisc() {
        System.out.println("A "+ this.discType + " spins at a rate of " + this.speedRange + " rpm.");
    }

    @Override
    public String pauseDisc() {
        return "*Silence*";
    }

    @Override
    public void rewindDisc() {
        System.out.println("Rewind, rewind!");
    }

    @Override
    public String reportData() {
        return this.toString();
    }

    @Override
    public String readData() {
        return this.toString();
    }
}

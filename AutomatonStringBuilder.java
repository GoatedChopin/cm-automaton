package com.colbymeline;

public class AutomatonStringBuilder {
    String signature = "\n\nFrom,\nInsert your automaton's name here

    public String customizeMessage(String message, String name) {
        String newMessage = name + ",\n\n" + message + this.signature;
        return newMessage;
    }
}

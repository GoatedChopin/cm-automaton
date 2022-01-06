package com.colbymeline;

public class AutomatonStringBuilder {
    String signature = "\n\nFrom,\nAutomaton 1\nP.S. Don't respond to me, I'm illiterate. Send inquiries to colbysmeline@gmail.com";

    public String customizeMessage(String message, String name) {
        String newMessage = name + ",\n\n" + message + this.signature;
        return newMessage;
    }
}
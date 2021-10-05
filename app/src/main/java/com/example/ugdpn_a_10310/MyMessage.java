package com.example.ugdpn_a_10310;

public class MyMessage {
    private CharSequence message;
    private CharSequence sender;
    private long timeStamp;

    public MyMessage(CharSequence message, CharSequence sender) {
        this.message = message;
        this.sender = sender;
        timeStamp = System.currentTimeMillis();
    }

    public CharSequence getMessage() {
        return message;
    }

    public CharSequence getSender() {
        return sender;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}

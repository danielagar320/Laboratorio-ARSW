package edu.eci.arsw.math;

public class DigitsThread extends Thread {

    private byte[] piDigits;
    private int start;
    private int count;

    public DigitsThread(int start, int count){
        this.start = start;
        this.count = count;
    }


    public void run(){
        piDigits = PiDigits.getDigits(start, count);

    }

    public byte[] traerResultado(){
        return piDigits;
    }


}



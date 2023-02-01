package edu.eci.arsw.threads;

import edu.eci.arsw.math.PiDigits;

public class DigitsThread extends Thread {

    private byte[] piDigits;
    private int start;
    private int count;

    public DigitsThread(int start, int count){
        this.start = start;
        this.count = count;
        this.piDigits = null;
    }

    @Override
    public void run(){
        piDigits = PiDigits.getDigits(start, count);

    }

    public byte[] traerResultado(){
        return piDigits;
    }


}



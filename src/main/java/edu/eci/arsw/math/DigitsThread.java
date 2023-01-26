package edu.eci.arsw.math;

public class DigitsThread extends Thread {

    private byte[] digitosGlobales;
    private int start;
    private int count;
    private int N;

    public DigitsThread(int start, int count, int N){
        this.N = N;
        this.start = start;
        this.count = count;
    }

    @Override
    public void run(){
        byte[] pDigits = PiDigits.getDigits(start, count);
        for(int i= start,  j = 0; i <start+count; i++, j++){
            pDigits = digitosGlobales[i-start]
        }


    }



}

package stu.ilexa;

public class Printer {
    public synchronized void printPing(String output){
        try{
            Thread.sleep(1500);
            wait();}
        catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println(output);
        notify();
    }
    public synchronized void printPong(String output){
        System.out.println(output);
        notify();
        try{
            Thread.sleep(1500);
            wait();}
        catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}

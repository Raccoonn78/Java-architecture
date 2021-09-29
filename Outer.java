package stu.ilexa;

public class Outer implements Runnable{
    private String output;
    private Printer printer;

    public Outer(String output,Printer printer) {
        this.output = output;
        this.printer=printer;
    }

    @Override
    public void run() {
        while (true){
            if (output.equals("PING")){printer.printPing(output);}
            else{printer.printPong(output);}
        }
    }



}

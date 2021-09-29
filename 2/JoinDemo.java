
public class JoinDemo {
    public static void main(String[] args) {
        JoinRunnable a = new JoinRunnable("ping");
        JoinRunnable b = new JoinRunnable("pong");
        
        a.start();
        try {
            a.join();
            b.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        b.start();
       
    }


    
}
public class thread implements Runnable{
    public void run(){
        for (int i=0;i<10;i++)
        {
            System.out.println("Thread..1....(hiii)");
        try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}


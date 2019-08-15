class main{
    public static void main(String[] args) {
        thread obj1=new thread();
        thread2 obj2=new thread2();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try{Thread.sleep(10);}catch (Exception e){}
        t2.start();
    }
}

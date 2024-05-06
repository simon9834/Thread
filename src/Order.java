public class Order extends Thread{

    private Kitchen k;
    @Override
    public void run() {
        System.out.println("got it il start!");
        k.letHimCook();
        System.out.println("cooking-");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        k.finished();
        System.out.println("done bro");
    }
    Order(Kitchen k){
        this.k = k;
    }
}

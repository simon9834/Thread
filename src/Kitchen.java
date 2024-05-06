public class Kitchen {
    private int currentOrders;
    private int maxOrders = 5;

    public void createOrder() {
        Order o = new Order(this);
        o.start();
    }

    public synchronized void letHimCook() { //this a wait potřebuje vždy synchronized
        while(currentOrders >= maxOrders){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        currentOrders++;
    }

    public synchronized void finished() { //using this so needing to use synchronized
        currentOrders--;
        this.notify();
    }


}

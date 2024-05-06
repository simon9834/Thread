public class MyThread implements Runnable{

    private int yourMom;


    @Override
    public void run() {
        for( int i  = 0;  i < 350000; i++){
            bodyFat();
        }
        System.out.println(yourMom);
    }
    public synchronized Integer bodyFat(){
        return yourMom++;
    }

}

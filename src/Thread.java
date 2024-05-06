public class Thread implements Runnable{

    private int yourMom;

    @Override
    public void run() {
        for( int i  = 0;  i < 35; i++){
            bodyFat();
        }
    }
    public Integer bodyFat(){
        return yourMom++;
    }

}

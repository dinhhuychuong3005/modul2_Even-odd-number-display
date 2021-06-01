public class OddThread extends Thread{
    public OddThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            if (i % 2 != 0){
                System.out.println(this.getName() + " :" + i);
            }try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

import java.util.Random;

public class JavaApplication23 {

    public static void main(String[] args) {
        GlobalData.array = new int[GlobalData.ARRAY_LENGTH];
        GlobalData.results = new long[GlobalData.THREAD_COUNT];

        Random rnd = new Random();

        for (int i = 0; i < GlobalData.ARRAY_LENGTH; i++){
            GlobalData.array[i] = rnd.nextInt(10);
        }

        long sum1 = 0;
        long t1 = System.currentTimeMillis();
        for(int i =0; i< GlobalData.ARRAY_LENGTH; i++){
            sum1 += GlobalData.array[i];
        }
        long t2 = System.currentTimeMillis();

        System.out.println("sum1 = " + sum1+ ", working time = " + (t2-t1));

    }
}

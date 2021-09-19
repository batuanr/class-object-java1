package stopWatch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 100000, j = 0; i > 0; i--, j++) {
            array[j] = i;
        }
       StopWatch stopWatch = new StopWatch();
       stopWatch.setStartTime(System.currentTimeMillis());
       Arrays.sort(array);
       stopWatch.setEndTime(System.currentTimeMillis());
        System.out.println(stopWatch.getElapsedTime());

    }

}

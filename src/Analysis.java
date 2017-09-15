public class Analysis {

    public static void one(int n) {
        long startTime = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum++;
        }

        long endTime = System.nanoTime();

        long elapsedTime = endTime - startTime;
        double seconds = (double)elapsedTime / 1_000_000_000.0;


        System.out.print(seconds);



    }

    public static void main(String[] args) {

        one(32767);



/*
        (2)  sum = 0;
        for( i = 0; i < n; i++ )
            for( j = 0; j < n; j++ )
                sum++;
        (3)  sum = 0;
        for( i = 0; i < n; i++ )
            for( j = 0; j < n * n; j++ )
                sum++;
        (4)  sum = 0;
        for( i = 0; i < n; i++ )
            for( j = 0; j < i; j++ )
                sum++;
        (5) sum=0;
        for( i = 0; i < n; i++ )
            for( j = 0; j < i * i; j++ )
                for( k = 0; k < j; k++ )
                    sum++;
        (6) sum=0;
        for( i = 1; i < n; i++ )
            for( j = 1; j < i * i; j++ )
                if( j % i == 0 )
                    for( k = 0; k < j; k++ )
                        sum++;
    }
*/
    }
    public static long getTimingInfo() {

        long startTime = System.currentTimeMillis();

        long totalTime = 0;

        totalTime = System.currentTimeMillis() - startTime;
        return totalTime;

    }


}

public class ShowCurrentTime {
    public static void main(String[] args) {

        // Display results
        long tider[] = tider();
        System.out.println("nuværende tid er " + tider[3] + ":"
                + tider[2] + ":" + tider[1] + " GMT+1");
    }

    public static long[] tider() {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMillisekunder = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSekunder = totalMillisekunder / 1000;

        // Compute the current second in the minute in the hour
        long nuværendeSekunder = totalSekunder % 60;

        // Obtain the total minutes
        long totalMinutter = totalSekunder / 60;

        // Compute the current minute in the hour
        long nuværendeMinutter = totalMinutter % 60;

        // Obtain the total hours
        long totalTimer = totalMinutter / 60;

        // Compute the current hour
        long nuværendeTimer = totalTimer % 24 + 2;
        // Array der sørger for at tiderne er konektet til main fra metoden.
        long[] svar = new long[4];
        svar[1] = nuværendeSekunder;
        svar[2] = nuværendeMinutter;
        svar[3] = nuværendeTimer;
        return svar;
    }
}



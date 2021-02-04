public class Altitude {

    //function to calculate the maximum altitude reached given a number of altitude changes
    public int highestAltitude(int[] gain) {
        // initializing the maximum value variable
        int peak = 0;
        // initializing the running total variable
        int runningTotal = 0;
        // loop through the array input and calculate maximum altitude
        for (int value : gain) {
            runningTotal += value;
            if (runningTotal > peak) {
                peak = runningTotal;
            }
        }
        return peak;
    }

    public static void main(String[] args) {
        //sample array
        int[] gain = {-5, 1, 5, 0, -7};
        Altitude a = new Altitude();
        int max = a.highestAltitude(gain);
        System.out.println("highest altitude: " + max);
    }
}

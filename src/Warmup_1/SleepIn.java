package Warmup_1;

public class SleepIn {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = true;

        // Call the sleep method with weekday and vacation as arguments
        boolean result = sleep(weekday, vacation);
        System.out.println("Can sleep in: " + result);
    }

    // Correctly defined sleep method outside of main
    public static boolean sleep(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}


public class ColdSnap {

    /**
     * Postcondition: Computes the longest cold snap and r
     *                returns one of the following Strings:
     *                - "Longest cold snap: X days" (where X is the longest streak)
     *                - "no cold snaps" (if no streak of 2+ exists)
     */
    public static String longestColdSnap(double[] temps) {
        // TODO: students write this
        return "";
    }

    public static void main(String[] args) {

        // Contains a cold snap of length 3 (14.2, 12.8, 10.1)
        double[] temps1 = {
                22.5, 19.3, 14.2, 12.8, 10.1, 18.6, 21.0
        };

        // Contains two cold snaps (length 2 and length 4);
        // longest = 4.
        double[] temps2 = {
                16.0, 14.9, 13.5, 20.1, 8.2, 9.0, 10.4, 14.7, 17.3
        };

        // No cold snaps — values drop below 15 but never for 2+ days.
        double[] temps3 = {
                21.0, 14.8, 20.2, 18.1, 14.9, 22.5, 19.0
        };

        // Contains three cold snaps (length 5, length 2 and length 4);
        // longest = 4.
        double[] temps4 = {
                18.2, 14.3, 13.1, 14.9, 12.0, 7.0, 15.0, 9.0, 20.5, 11.8, 10.2, 17.4, 9.5, 8.7, 7.9, 16.8, 21.0
        };

        System.out.println("Array 1: " + longestColdSnap(temps1));
        System.out.println("Array 2: " + longestColdSnap(temps2));
        System.out.println("Array 3: " + longestColdSnap(temps3));
        System.out.println("Array 4: " + longestColdSnap(temps4));
    }
}

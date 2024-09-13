package org.example;

public class Main {

    public static void main(String[] args) {
        double radius = circleArea(5);
        double radius2 = circleCircum(5);
        String totalMins = minutesToHoursMinutes(267);
        String twentyFourHour = twentyFourToTwelve("13:14");
        double distance = distanceBetweenTwoPoints(3,4,1,7);
        double fahrenheit = fahrenheitToCelsius(100);
        double celcius2 = celsiusToFahrenheit(35);
    }
        /** Method 1
         * Method name: circleArea
         * Method return type: double
         * Method parameter: the radius of a circle
         * Method signature: circleArea(int)
         * Returns the area of a circle. */
        public static double circleArea(int radius) {
            double Area = Math.round(Math.PI*radius*radius*100);
            return Area/100;
        }

    /** Method 2
     * Method name: circleCircum
     * Method return type: double
     * Method parameter: the radius of a circle
     * Method signature: circleCircum(int)
     * Returns the circumference of a circle. */
    public static double circleCircum(int radius) {
        double circumference = Math.round(Math.PI*2*radius*100);
        return circumference/100;


    }

    /** Method 3
     * Method name: circleInfo
     * Method return type: String
     * Method parameter: the radius of a circle
     * Method signature: circleInfo(int)
     * Returns a String detailing the radius, circumference, and area of a circle.
     * Format of returned String: e.g.
     * Radius: 3
     * Circumference: 18.85
     * Area: 28.27 */
    public static String circleInfo(int radius) {
        return "Radius: " + radius + "\nCircumference: " + circleCircum(radius) + "\nArea: " + circleArea(radius);
    }

    /** Method 4
     * Method name: minutesToHoursMinutes
     * Method return type: String
     * Method parameter: total minutes (e.g. 226)
     * Method signature: minutesToHoursMinutes(int)
     * Returns a String detailing the number of hours and minutes.
     * Format of returned String: e.g. 3 hours and 46 minutes */
    public static String minutesToHoursMinutes(int minutes) {

        int hours = minutes/60;
        int minutes2 = minutes %60;
        System.out.println(hours + " hours and " + minutes2 + " minutes");
        return hours + " hours and " + minutes2 + " minutes";
    }

    /** Method 5
     * Method name: twentyFourToTwelve
     * Method return type: String
     * Method parameter: time in 24-hour format (e.g. 15:56). time >= 13:00 (always pm)
     * Method signature: twentyFourToTwelve(String)
     * Returns a String detailing the time in 12-hour format (e.g. 3:56 pm).
     * Format of returned String: e.g. 3:56 pm
     * */
    public static String twentyFourToTwelve(String time) {
        int time2 = Integer.parseInt(time.substring(0,2));
        int minute3 = Integer.parseInt(time.substring(3,5));
        int twelveHour = time2%12;
        System.out.println(twelveHour + ":" + minute3 + "pm");
        return twelveHour + ":" + minute3 + " pm";

    }

    /** Method 6
     * Method name: distanceBetweenTwoPoints
     * Method return type: double
     * Method parameter: x1, y1, x2, y2 (the two coordinates on a 2D plane)
     * Method signature: distanceBetweenTwoPoints(int,int,int,int)
     * Returns the distance between two points */
    public static double distanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        int xCoordinate = (x1-x2)*(x1-x2);
        int yCoordinate = (y1-y2)*(y1-y2);
        double distance = Math.sqrt((xCoordinate+yCoordinate));
        double dRound = Math.round(distance*100);
        double dRound2 = dRound/100;
        return dRound2;

    }

    /** Method 7
     * Method name: fahrenheitToCelsius
     * Method return type: double
     * Method parameter: degrees fahrenheit
     * Method signature: fahrenheitToCelsius(int)
     * Returns the degrees celsius equivalent of the degrees in fahrenheit */
    public static double fahrenheitToCelsius(int fahrenheit) {
        double celsius = Math.round((fahrenheit-32)/1.8*100);
        double round = celsius/100;
        return round;

    }

    /** Method 8
     * Method name: celsiusToFahrenheit
     * Method return type: double
     * Method parameter: degrees celsius
     * Method signature: celsiusToFahrenheit(int)
     * Returns the degrees fahrenheit equivalent of the degrees in celsius */
    public static double celsiusToFahrenheit(int celsius) {
        double farenheit2 = (celsius*9.0/5.0)+32;
        double round = Math.round(farenheit2*100);
        return round/100;


    }


}

public class Distance {
    public static final double EARTH_RADIUS = 6372.795;
    public static void main(String[] args) {
        // Get the lat and longs from the command line
        double latitude1 = Double.parseDouble(args[0]);
        double longitude1 = Double.parseDouble(args[1]);
        double latitude2 = Double.parseDouble(args[2]);
        double longitude2 = Double.parseDouble(args[3]);

        // Calulate the distance between the two points
        System.out.println(getDistance(latitude1, longitude1, latitude2, longitude2));
    }

    public static double getDistance(double latitude1, double longitude1, double latitude2, double longitude2) {
        //Convert the angles to radians
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        // Calulate the longitudinal distance
        double longDistance = Math.abs(longitude2 - longitude1);

        //Calulate the angular difference
        double angularDifference = Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longDistance));

        //Calculate and return the distance
        return EARTH_RADIUS * angularDifference;
    }
}
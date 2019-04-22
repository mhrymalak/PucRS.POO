public class Geo
{
    private double longitude;
    private double latitude;

    public Geo (double longitude, double latitude)
    {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return String.format("Longitude: %f |  Latitude: %f");
    }
}

package samples;


/**
 * The type Singleton sensor sample.
 *
 *  store data from the sensor
 */
public class SingletonSensorSample {


    private Float proximityValue = 0.0f;
    private Float accelerationXValue = 0.0f;
    private Float accelerationYValue = 0.0f;
    private Float accelerationZValue = 0.0f;


    //_______________________________________________________________________lockation
    private double latitude = 0;
    private double longitude = 0;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
//________Set_get_______________________________________________________________________________

    /**
     * Gets acceleration x value.
     *
     * @return the value of accelerationXValue
     */

    public Float getAccelerationXValue() {
        return accelerationXValue;
    }

    /**
     * Sets acceleration x value.
     *
     * @param accelerationXValue the acceleration x value
     */
    public void setAccelerationXValue(Float accelerationXValue) {
        this.accelerationXValue = accelerationXValue;
    }

    /**
     * Gets acceleration y value.
     *
     * @return the value of accelerationYValue
     */
    public Float getAccelerationYValue() {
        return accelerationYValue;
    }

    /**
     * Sets acceleration y value.
     *
     * @param accelerationYValue the acceleration y value
     */
    public void setAccelerationYValue(Float accelerationYValue) {
        this.accelerationYValue = accelerationYValue;
    }

    /**
     * Gets acceleration z value.
     *
     * @return the value of accelerationZValue
     */
    public Float getAccelerationZValue() {
        return accelerationZValue;
    }

    /**
     * Sets acceleration z value.
     *
     * @param accelerationZValue the acceleration z value
     */
    public void setAccelerationZValue(Float accelerationZValue) {
        this.accelerationZValue = accelerationZValue;
    }

    /**
     * Gets proximity value.
     *
     * @return the value of accelerationY
     */
    public Float getProximityValue() {
        return proximityValue;
    }

    /**
     * Sets proximity value.
     *
     * @param proximityValue the proximity value
     */
    public void setProximityValue(Float proximityValue) {
        this.proximityValue = proximityValue;
    }

    // ------------- singleton design pattern

    private static SingletonSensorSample thesample = null;

    private SingletonSensorSample() {

    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized SingletonSensorSample getInstance() {
        if (thesample == null) {
            thesample = new SingletonSensorSample();
        }
        return thesample;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}

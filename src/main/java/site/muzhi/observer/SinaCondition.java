package site.muzhi.observer;

/**
 * Author: lichuang
 * Date: Create in 17:03 2019/12/4
 * Description:
 */

public class SinaCondition implements Observer {

    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    @Override
    public String toString() {
        return "SinaCondition{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }

    public void display() {
        System.out.println(toString());
    }
}

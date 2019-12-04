package site.muzhi.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lichuang
 * Date: Create in 17:08 2019/12/4
 * Description:
 */

public class WeatherData implements Subject {

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

    /**
     * 观察者集合
     */
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        // 调用所有观察者的update() 方法,将信息的更新推送给调用方(观察者)
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }

    public void dataChange() {
        // 调用接入方的update()
        notifyObservers();
    }

    /**
     * 当有数据更新时调用此方法
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新的信息推送给接入方
        dataChange();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

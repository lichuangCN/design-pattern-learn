package site.muzhi.observer;

/**
 * Author: lichuang
 * Date: Create in 17:20 2019/12/4
 * Description:
 */

public class Client {
    public static void main(String[] args) {
        Observer baidu = new BaiduCondition();
        Observer sina = new SinaCondition();

        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(sina);
        System.out.println("-------当前温度-------");
        weatherData.setData(10.9f, 200.9f, 9.0f);

        System.out.println("-------更新温度-------");
        weatherData.setData(12.1f, 210.2f, 22.0f);
    }
}

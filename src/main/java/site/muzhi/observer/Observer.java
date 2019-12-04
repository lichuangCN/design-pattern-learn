package site.muzhi.observer;

/**
 * Author: lichuang
 * Date: Create in 17:01 2019/12/4
 * Description:
 */

public interface Observer {

    /**
     * 更新当前的数值
     *
     * @param temperature
     * @param pressure
     * @param humidity
     */
    void update(float temperature, float pressure, float humidity);
}

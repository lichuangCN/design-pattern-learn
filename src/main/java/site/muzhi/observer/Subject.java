package site.muzhi.observer;

/**
 * Author: lichuang
 * Date: Create in 17:01 2019/12/4
 * Description:
 */

public interface Subject {

    /**
     * 向被观察者注册新的观察者
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者状态已更新
     */
    void notifyObservers();
}

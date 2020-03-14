package site.muzhi.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author: lichuang
 * @date: 2020/03/14
 * @description: 定义远程对象接口，实现Remote接口表示支持远程调用
 */
public interface IHelloServer extends Remote {
    /**
     * 每次远程方法调用都必须考虑是存在风险的，因此必须抛出RemoteException异常
     * 并且确保变量和返回值都是属于原语(primitive)或可序列化(Serializable)
     * 因为变量和返回值都会经过网络进行传输，必须靠序列化进行
     *
     * @param user
     * @return
     * @throws RemoteException
     */
    String say(User user) throws RemoteException;
}

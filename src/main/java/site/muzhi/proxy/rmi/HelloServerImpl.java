package site.muzhi.proxy.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author: lichuang
 * @date: 2020/03/14
 * @description: 实现远程接口，继承UnicastRemoteObject类表示成为远程服务对象
 */
public class HelloServerImpl extends UnicastRemoteObject implements IHelloServer {

    private static final long serialVersionUID = 4232467980765153128L;

    /**
     * 因为UnicastRemoteObject类中的构造器抛出RemoteException，因此子类HelloServerImpl
     * 也需要在其子类的构造器中抛出此异常
     *
     * @throws RemoteException
     */
    public HelloServerImpl() throws RemoteException {
    }

    @Override
    public String say(User user) throws RemoteException {
        return "Server says, 'Hello, " + user.getName() + "!'";
    }
}

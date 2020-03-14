package site.muzhi.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author: lichuang
 * @date: 2020/03/14
 * @description:
 */

public class Client {
    public static void main(String[] args) {
        try {
            // 查找远程对象
            // 注意：因为动态代理是基于接口的，所以需要使用接口进行转型，否则会抛出转型失败异常
            IHelloServer helloServer = (IHelloServer) Naming.lookup("rmi://127.0.0.1:8000/hello");
            // 调用远程方法
            System.out.println(helloServer.say(new User("Jim")));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}

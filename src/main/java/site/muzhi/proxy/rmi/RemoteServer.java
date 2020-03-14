package site.muzhi.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @author: lichuang
 * @date: 2020/03/14
 * @description:
 */

public class RemoteServer {

    public static void main(String[] args) {
        try {
            IHelloServer helloServer = new HelloServerImpl();
            // 本地主机上的远程对象注册表Registry的实例，并指定端口为8000(Java默认端口是1099)
            LocateRegistry.createRegistry(8000);
            // 把远程对象注册到RMI注册服务器上，并命名为hello
            // 绑定的URL标准格式为：rmi://host:port/name(其中协议名可以省略）
            Naming.bind("rmi://127.0.0.1:8000/hello", helloServer);
        } catch (RemoteException e) {
            System.err.println("创建远程服务对象失败");
        } catch (MalformedURLException e) {
            System.err.println("发生URL异常");
        } catch (AlreadyBoundException e) {
            System.err.println("服务重复绑定");
        }
    }
}

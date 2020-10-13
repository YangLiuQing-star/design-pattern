package proxy.dynamic;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author YangLiuQing
 * @date 2020/6/10 9:45
 * 动态代理
 */
public class ProxyFactory implements InvocationHandler{

    //维护一个目标对象
    private Object target;

    //初始化目标对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回目标对象的代理对象
    public Object getProxyInstance(){
        //ClassLoader loader：指定目标对象使用的类加载器，获取类加载器的方法固定
        //Class<?>[] interfaces：代理对象需要实现的接口，可以同时指定多个接口
        //InvocationHandler h： 方法调用的实际处理者，代理对象的方法调用都会转发到这里，并执行该类中重写的invoke方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy 代理对象
     * @param method 代理方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK代理开始...");
        //通过反射机制，调用目标对象的方法
        Object returnVal = method.invoke(target, args);
        System.out.println("JDK代理提交...");
        return returnVal;
    }
}

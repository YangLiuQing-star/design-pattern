package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author YangLiuQing
 * @date 2020/6/10 19:51
 */
public class ProxyFactory implements MethodInterceptor{

    //维护一个目标对象
    private Object target;

    /**
     * 构造器
     * @param target 目标对象
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个目标对象的代理对象
     * @return
     */
    public Object getProxyInstance(){
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写此方法，此方法会调用目标对象的方法
     * @param o
     * @param method
     * @param args
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始...");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理模式提交...");
        return returnVal;
    }
}

package template;

/**
 * @author YangLiuQing
 * @date 2020/6/10 20:38
 */
public abstract class SoyMilk {
    //模板方法，不让子类覆盖，做成final
    final void make(){
        select();
        add();
        soak();
        beat();
    }

    //选原材料
    private void select(){
        System.out.println("第一步选择新鲜的黄豆");
    }

    //添加不同的配料，留给子类具体实现
    public abstract void add();

    private void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡，需要3小时");
    }

    //打豆浆
    private void beat(){
        System.out.println("第四步，黄豆和配料放入豆浆机打碎");
    }
}

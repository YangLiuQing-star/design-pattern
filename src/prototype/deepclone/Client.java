package prototype.deepclone;

public class Client {

	public static void main(String[] args) throws Exception {
		DeepProtoType p = new DeepProtoType();
		p.name = "张三";
		p.deepCloneableTarget = new DeepCloneableTarget("李四", "李四类");
		
		//测试方式1完成深拷贝
		DeepProtoType p2 = (DeepProtoType) p.clone();

		//hashcode不一样，实现了深拷贝
		System.out.println("方式1："+"p.name=" + p.name + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("方式1："+"p2.name=" + p.name + ",p2.deepCloneableTarget=" + p2.deepCloneableTarget.hashCode());

        System.out.println("序列化和反序列化实现克隆");

        //测试方式2,
		DeepProtoType p3 = (DeepProtoType) p.deepClone();

		System.out.println("方式2："+"p.name=" + p.name + ",p.deepCloneableTarget=" + p.deepCloneableTarget.hashCode());
		System.out.println("方式2："+"p3.name=" + p.name + ",p3.deepCloneableTarget=" + p3.deepCloneableTarget.hashCode());
	
	}

}

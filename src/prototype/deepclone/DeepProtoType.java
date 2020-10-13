package prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author YangLiuQing
 * @version 1.0
 */
public class DeepProtoType implements Serializable, Cloneable{
	
	public String name;//基本数据类型和字符串类型（属性）

	public DeepCloneableTarget deepCloneableTarget;//引用类型

	public DeepProtoType() {
		super();
	}
	
	//深拷贝，方式1.使用clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//完成对基本数据类型（属性）和字符串的克隆
		deep = super.clone();
		//对引用类型的属性进行单独处理
		DeepProtoType deepProtoType = (DeepProtoType)deep;
		deepProtoType.deepCloneableTarget  = (DeepCloneableTarget)this.deepCloneableTarget.clone();
		
		return deepProtoType;
	}
	
    //方式2，通过对象的序列化和反序列化实现深拷贝，推荐使用
	public Object deepClone() {
		//创建流对象
		ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
		
		try {
		    //序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//以对象流的方式输出当前对象

            //反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj = (DeepProtoType)ois.readObject();
			
			return copyObj;
			
		} catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
		} finally {
			try {
			    //关闭流
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
	}
}

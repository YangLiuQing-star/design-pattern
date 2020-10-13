package interpretor;

import java.util.HashMap;

/**
 * 变量解析器
 */
public class VarExpression extends Expression {

	private String key; // key=a,key=b,key=c

	public VarExpression(String key) {
		this.key = key;
	}

    /**
     * 根据变量的名称，返回对应的值
     * @param var
     * @return
     */
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}

package interpretor;

import java.util.HashMap;

/**
 * 抽象类表达式
 * 通过HashMap键值对，获取变量的值
 */
public abstract class Expression {
	// a + b - c
	// HashMap {a=10, b=20} ，key：表达式中的变量，value：具体的值
	public abstract int interpreter(HashMap<String, Integer> var);
}

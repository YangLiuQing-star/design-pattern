package interpretor;

import java.util.HashMap;

/**
 * 符号解析器  +，-
 */
public class SymbolExpression extends Expression {

	//指向左表达式的左指针
	protected Expression left;
	//指向右表达式的右指针
	protected Expression right;

	public SymbolExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	//留给子类实现解析方法
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return 0;
	}
}

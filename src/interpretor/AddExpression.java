package interpretor;

import java.util.HashMap;

/**
 * 加法解析器
 * @author Administrator
 *
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	/**
	 * 返回left和right表达式对应的值，并进行加法运算
	 * @param var
	 * @return
	 */
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}

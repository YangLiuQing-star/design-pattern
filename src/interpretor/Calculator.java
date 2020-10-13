package interpretor;

import java.util.HashMap;
import java.util.Stack;

/**
 * 计算表达式
 */
public class Calculator {

	private Expression expression;

	public Calculator(String expStr) { // expStr = a+b
		Stack<Expression> stack = new Stack<>();
		char[] charArray = expStr.toCharArray();// [a, +, b]

		Expression left = null;
		Expression right = null;
		//遍历表达式对应的字符数组
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
			    //从栈中取出左表达式
				//取出下一个字符构建一个右表达式
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-': // 
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default: //如果是变量
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		//当遍历完成后，栈中得到了最后的Expression
		this.expression = stack.pop();
	}

	public int run(HashMap<String, Integer> var) {
	    //最后将表达式和var绑定，传递给expression的interpreter进行解释执行
		return this.expression.interpreter(var);
	}
}
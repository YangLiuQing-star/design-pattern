package mediator;

public abstract class Mediator {
	//将一个同事对象加入到集合中
	public abstract void Register(String colleagueName, Colleague colleague);

	//接收对象，具体同事发出的消息
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}

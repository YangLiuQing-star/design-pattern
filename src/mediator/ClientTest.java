package mediator;

public class ClientTest {

	public static void main(String[] args) {
		//创建中介者
		Mediator mediator = new ConcreteMediator();
		//创建闹钟
		Alarm alarm = new Alarm(mediator, "Alarm");
		//创建咖啡机，加入Map集合
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"CoffeeMachine");
		
		Curtains curtains = new Curtains(mediator, "Curtain");
		TV tv = new TV(mediator, "TV");
		
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}

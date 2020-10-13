package mediator;

import java.util.HashMap;

/**
 * @author YangLiuQing
 * 具体的中介者
 */
public class ConcreteMediator extends Mediator {
	//放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	//保存具体的同事对象
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	@Override
	public void Register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);
		if (colleague instanceof Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

    /**
     * 中介者的核心方法，根据得到的消息，完成对应的任务
     * 协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param colleagueName
     */
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((CoffeeMachine) (colleagueMap.get(interMap
						.get("CoffeeMachine")))).StartCoffee();
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}

		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			((Curtains) (colleagueMap.get(interMap.get("Curtains"))))
					.UpCurtains();

		} else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果是TV发出的信息，在这处理
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是窗帘发出的信息，在这处理
		}

	}

	@Override
	public void SendMessage() {

	}

}

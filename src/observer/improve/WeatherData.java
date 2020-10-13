package observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 1.包含最新的天气情况信息
 * 2.包含一个CurrentConditions对象
 * 3.当数据有更新时，就主动的调用List中CurrentConditions对象的update方法，这样接入方就看到最新的信息
 *
 */

public class WeatherData implements Subject{
	private float temperature;
	private float pressure;
	private float humidity;

	//聚合
	private List<Observer> observers;

	public WeatherData() {
	    observers  = new ArrayList<>();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	//更新第三方数据
	public void dataChange() {
		notifyObserver();
	}

    //数据有更新时，就调用此方法
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的信息推送给接入方，调用接入方的update
		dataChange();
	}

	//注册第三方
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    //删除第三方
    @Override
    public void removeObserver(Observer observer) {
	    if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    //通知第三方
    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size();i++){
            this.observers.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}

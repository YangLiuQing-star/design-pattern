package observer;

/**
 * 核心类
 * 1.包含最新的天气情况信息
 * 2.包含一个CurrentConditions对象
 * 3.当数据有更新时，就主动的调用CurrentConditions对象的update，这样接入方就看到最新的信息
 * 当添加第三方时，需要修改代码，违反了ocp原则
 */

public class WeatherData {
	//温度
	private float temperature;
	//气压
	private float pressure;
	//湿度
	private float humidity;

	//聚合
	private CurrentConditions currentConditions;

	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
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

	public void dataChange() {
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}

    //数据有更新时，就调用此方法
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		//将最新的信息推送给接入方，调用接入方的update
		dataChange();
	}
}

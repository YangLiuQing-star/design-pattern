package observer.improve;

/**
 * 显示当前天气情况，（理解成气象局的网站）
 * @author Administrator
 *
 */
public class CurrentConditions implements Observer{
	private float temperature;
	private float pressure;
	private float humidity;

	//更新天气情况，由WeatherData调用，使用推送模式
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	//显示天气情况
	public void display() {
		System.out.println("~~~Today mTemperature: " + temperature + "~~~");
		System.out.println("~~~Today mPressure: " + pressure + "~~~");
		System.out.println("~~~Today mHumidity: " + humidity + "~~~");
	}
}

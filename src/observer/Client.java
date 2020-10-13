package observer;

public class Client {
	public static void main(String[] args) {
		//创建一个接入方currentConditions
		CurrentConditions currentConditions = new CurrentConditions();
		//创建WeatherData 对象并将接入方 currentConditions 聚合到WeatherData中
		WeatherData weatherData = new WeatherData(currentConditions);
		
		//设置天气信息
		weatherData.setData(30, 150, 40);

		//更新天气信息
		System.out.println("============天气情况发生变化=============");
		weatherData.setData(40, 160, 20);
	}
}

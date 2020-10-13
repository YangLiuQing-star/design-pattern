package observer.improve;

public class Client {
	public static void main(String[] args) {
		//创建一个接入方currentConditions
		Observer observer = new CurrentConditions();
		//创建观察者
		WeatherData weatherData = new WeatherData();
		//注册第三方
		weatherData.registerObserver(observer);

        Observer baiduSite = new BaiduSite();
        weatherData.registerObserver(baiduSite);
		
		//设置天气信息
        System.out.println("通知各个第三方更新天气数据");
        weatherData.setData(100, 150, 30);


        //更新天气信息
		System.out.println("============天气情况发生变化=============");
        weatherData.removeObserver(observer);
        weatherData.setData(40, 160, 20);

	}
}

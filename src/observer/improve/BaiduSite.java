package observer.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/11 19:27
 */
public class BaiduSite implements Observer{
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
        System.out.println("百度网站提供的温度数据: " + temperature + "***");
        System.out.println("百度网站提供的气压数据: " + pressure + "***");
        System.out.println("百度网站提供的湿度数据: " + humidity + "***");
    }
}

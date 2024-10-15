package bad;

import bad.weather.WeatherApp;

public class Application {
    public static void main(String[] args) {
        WeatherApp weatherApp = new WeatherApp();
        weatherApp.displayWeather("Istanbul");
    }
}
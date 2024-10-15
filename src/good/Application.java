package good;

import good.weather.WeatherApp;
import good.weather.api.AccuWeatherService;
import good.weather.api.WeatherService;

public class Application {
    public static void main(String[] args) {
        // İstenilen hava durumu servisini seçiyoruz
        WeatherService weatherService = new AccuWeatherService(); // veya new OpenWeatherMapService()

        WeatherApp weatherApp = new WeatherApp(weatherService);
        weatherApp.displayWeather("Istanbul");
    }
}

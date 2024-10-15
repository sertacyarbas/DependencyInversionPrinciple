package good.weather;

import good.weather.api.WeatherService;

public class WeatherApp {
    private WeatherService weatherService;

    // Bağımlılığı dışarıdan alıyoruz (Dependency Injection)
    public WeatherApp(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void displayWeather(String location) {
        String data = weatherService.getWeatherData(location);
        System.out.println("Weather in " + location + ": " + data);
    }
}
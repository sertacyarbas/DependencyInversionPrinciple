package bad.weather;

import bad.weather.api.AccuWeatherService;

public class WeatherApp {
    // İhtiyaç değiştiği için artık OpenWeatherMapService kullanılmayacak, bu sınıf değişti
    private AccuWeatherService accuWeatherService;

    public WeatherApp() {
        accuWeatherService = new AccuWeatherService();
    }

    public void displayWeather(String location) {
        String data = accuWeatherService.getWeatherData(location);
        System.out.println("Weather in " + location + ": " + data);
    }
}
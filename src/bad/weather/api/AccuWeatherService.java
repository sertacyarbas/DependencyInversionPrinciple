package bad.weather.api;

public class AccuWeatherService {
    public String getWeatherData(String location) {
        // AccuWeather API üzerinden hava durumu verilerini alır
        return "Cloudy weather data from AccuWeather for " + location;
    }
}
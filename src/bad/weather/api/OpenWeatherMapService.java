package bad.weather.api;

public class OpenWeatherMapService {
    public String getWeatherData(String location) {
        // OpenWeatherMap API üzerinden hava durumu verilerini alır
        return "Sunny weather data from OpenWeatherMap for " + location;
    }
}
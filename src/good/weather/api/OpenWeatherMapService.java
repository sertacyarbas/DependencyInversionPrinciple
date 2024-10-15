package good.weather.api;

public class OpenWeatherMapService implements WeatherService {
    @Override
    public String getWeatherData(String location) {
        // OpenWeatherMap API üzerinden hava durumu verilerini alır
        return "Sunny weather data from OpenWeatherMap for " + location;
    }
}
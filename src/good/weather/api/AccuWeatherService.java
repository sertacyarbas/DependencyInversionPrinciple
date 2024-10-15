package good.weather.api;

public class AccuWeatherService implements WeatherService {
    @Override
    public String getWeatherData(String location) {
        // AccuWeather API üzerinden hava durumu verilerini alır
        return "Cloudy weather data from AccuWeather for " + location;
    }
}
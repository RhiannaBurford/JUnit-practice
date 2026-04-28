public class TravelAdvisor {
    private WeatherService weatherService;

    public TravelAdvisor(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getAdvice() {
        int temp = weatherService.getCurrentTemp();
        if (temp > 25) {
            return "Wear a T-shirt";
        }
        return "Wear a jacket";
    }
}
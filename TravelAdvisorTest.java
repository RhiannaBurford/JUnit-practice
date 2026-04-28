public class TravelAdvisorTest {

    @Mock
    private WeatherService mockWeatherService; 

    @InjectMocks
    private TravelAdvisor advisor; 

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAdviceForHotWeather() {
        // 1. Arrange: Make the mock return 30 degrees
        when(mockWeatherService.getCurrentTemp()).thenReturn(30);

        // 2. Act: Call the method
        String result = advisor.getAdvice();

        // 3. Assert: Check the result
        assertEquals("Wear a T-shirt", result);
    }
}
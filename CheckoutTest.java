public class CheckoutTest {

    @Mock
    private DiscountService mockDiscountService; 

    @InjectMocks
    private CheckoutSystem checkout; 

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testVipDiscount() {
        // 1. Arrange: Make the mock say the customer IS a VIP
        when(mockDiscountService.isVip(999)).thenReturn(true);

        // 2. Act
        double result = checkout.finalPrice(100.0, 999);

        // 3. Assert: 20% off 100.0 is 80.0
        assertEquals(80.0, result, 0.001);
    }
}
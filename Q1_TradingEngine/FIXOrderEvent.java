public class FIXOrderEvent extends TradeEvent {
    private String clOrdId;
    private static final double FEE_RATE = 0.0015;

    public FIXOrderEvent(String senderId, long timestamp,
                         double basePrice, String clOrdId) {
        super(senderId, timestamp, basePrice);
        this.clOrdId = (clOrdId == null) ? "" : clOrdId.trim();
    }

    private double calculateFee() {
        return basePrice * FEE_RATE;
    }

    @Override
    public void dispatch() {
        if (clOrdId.isEmpty()) {
            System.out.println("Invalid order ID!");
            return;
        }

        if (!Double.isFinite(basePrice) || basePrice <= 0) {
            System.out.println("Invalid order price!");
            return;
        }

        double fee = calculateFee();

        System.out.println("FIX Stock Order");
        System.out.println("Order ID: " + clOrdId);
        System.out.println("Price: " + basePrice);
        System.out.println("Fee: " + fee);
        System.out.println("Total: " + (basePrice + fee));
    }
}
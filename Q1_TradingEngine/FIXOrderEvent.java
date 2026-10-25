public class FIXOrderEvent extends TradeEvent {
    private String clOrdId;

    public FIXOrderEvent(String senderId, long timestamp,
                         double basePrice, String clOrdId) {
        super(senderId, timestamp, basePrice);
        this.clOrdId = (clOrdId == null) ? "" : clOrdId.trim();
    }

    @Override
    public void dispatch() {
        if (clOrdId == null || clOrdId.trim().isEmpty()) {
            System.out.println("Invalid order ID!");
            return;
        }

        if (basePrice <= 0) {
            System.out.println("Invalid order price!");
            return;
        }

        double fee = basePrice * 0.0015;

        System.out.println("FIX Stock Order");
        System.out.println("Order ID: " + clOrdId);
        System.out.println("Price: " + basePrice);
        System.out.println("Fee: " + fee);
        System.out.println("Total: " + (basePrice + fee));
    }
}
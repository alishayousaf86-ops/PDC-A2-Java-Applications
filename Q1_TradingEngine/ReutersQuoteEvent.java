public class ReutersQuoteEvent extends TradeEvent {
    private double bidPrice;
    private double askPrice;
    public ReutersQuoteEvent(String senderId, long timestamp,
                             double basePrice, double bidPrice,
                             double askPrice) {
        super(senderId, timestamp, basePrice);
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
    }
    @Override
    public void dispatch() {
        System.out.println("Reuters Market Quote");
        System.out.println("Bid: " + bidPrice);
        System.out.println("Ask: " + askPrice);
        System.out.println("Spread: " + (askPrice - bidPrice));
    }
}
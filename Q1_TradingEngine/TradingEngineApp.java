public class TradingEngineApp {
    public static void main(String[] args) {
        System.out.println("Program Started");
        TradeEvent event;
        event = new FIXOrderEvent("BANK01", 12345, 1000, "ORD01");
        event.dispatch();
        System.out.println();
        event = new ReutersQuoteEvent("MARKET01", 12346, 100, 99, 101);
        event.dispatch();
    }
}
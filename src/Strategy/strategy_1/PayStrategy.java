package Strategy.strategy_1;


/*
* Общий интерфейс стратегий оплаты
* */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}

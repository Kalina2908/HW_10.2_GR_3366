package Interfaces;

//import Classes.Actor;
/** интерфейс поведения очереди */
public interface iQueueBehavior {
    void takeInQueue(iActorBehavior actor); // прототип метода входа в очередь
    void releaseFromQueue(); // прототип метода выхода из очереди
    void takeOrder(); //  протип метода взять заказ
    void buyProduct(); // прототип метода покупки продуктов
    void giveOrder(); // прототип метода забрать заказ
}
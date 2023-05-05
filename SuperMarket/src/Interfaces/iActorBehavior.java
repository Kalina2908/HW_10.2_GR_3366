package Interfaces;

import Classes.Actor;

/** интерфейс поведения актора */
public interface iActorBehavior {
    void setMakeOrder(boolean makeOrder); // прототип метода - сделать заказ
    void setTakeOrder(boolean pickUpOrder); // прототип метода - забрать заказ
    void setBuyProduct(boolean buyProd); // прототип метода - покупка товара
    boolean isMakeOrder(); // прототип проверки - делал ли клиент заказ
    boolean isBuyProduct(); // прототип проверки - покупал ли клиент товар
    boolean isTakeOrder(); // прототип проверки - забрал ли клиент заказ
    Actor getActor(); 
}

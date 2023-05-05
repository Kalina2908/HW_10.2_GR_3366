package Interfaces;

import java.util.List;
import Classes.Actor;


/** интерфейс поведения в маркете */
public interface iMarketBehavior {
    void acceptToMarket(iActorBehavior actor); // прототип метода посещения клиентом маркета
    void releaseFromMarket(List<Actor> actors); // прототип метода ухода из маркета
    void update(); // прототип метода изменения статуса клиента в магазине   
}


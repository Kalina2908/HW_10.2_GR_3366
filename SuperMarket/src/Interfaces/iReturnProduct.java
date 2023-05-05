package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iReturnProduct {
    void ReturnToMarket(iActorBehavior actor); // прототип метода возвращения в магазин 
    void takeInQueueForReturnProd(iActorBehavior actor); // прототип метода для входа в очередь в отдел возврата
    void ReturnProduct(); // прототип метода возврата товара
    void GoFromMarketWithoutProd(List<Actor> actors); // прототип метода ухода из магазина без товара
    void updateWithoutProd(); // прототип метода изменения статуса клиента в маркете
}

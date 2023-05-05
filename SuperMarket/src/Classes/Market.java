package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehavior;
import Interfaces.iMarketBehavior;
import Interfaces.iQueueBehavior;
import Interfaces.iReturnProduct;


/** 
 * @param Market - класс, который наследует интерфейсы iMarketBehavior,iQueueBehavior
 */
public class Market implements iMarketBehavior,iQueueBehavior, iReturnProduct{
    //private List<Actor> queue;
    private List<iActorBehavior> queue;

    /** инициализация очереди */
    public Market() {
        this.queue = new ArrayList<iActorBehavior>();
    }

    /** метод прихода клиента в магазин (из интерфейса iMarketBehavior) */
    @Override
    public void acceptToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor); // клиент добавлен в очередь
    }

    /** метод ухода клиента из маркета (из интерфейса iMarketBehavior)*/
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }


     /** метод изменения статуса клиента в маркете (из интерфейса iMarketBehavior) */
     @Override
     public void update() {
        takeOrder();
        buyProduct();
        giveOrder();
        releaseFromQueue();
     }



    /** метод прихода клиента в очередь (из интерфейса iQueueBehavior) */
    @Override
    public void takeInQueue(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    
     /** метод ухода клиента из очереди (из интерфейса iQueueBehavior) */
     @Override
     public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehavior actor:queue)
        {
         if(actor.isTakeOrder())
         {
             releaseActors.add(actor.getActor());
             System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
         }
 
        }
     releaseFromMarket(releaseActors);
    }
   

    /** метод взятия заказа (из интерфейса iQueueBehavior) */
    @Override
    public void takeOrder() {
        for(iActorBehavior actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }


    /** метод получения заказа (из интерфейса iQueueBehavior) */
    @Override
    public void giveOrder() {
        for(iActorBehavior actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент оплатил свой заказ ");
            }
        }
        
    }


    @Override
    public void buyProduct() {
        for (iActorBehavior actor : queue){
            if(actor.isMakeOrder()){
                if(!actor.isBuyProduct()){
                    actor.setBuyProduct(true);
                }
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент взял продукты");
            }
        }
        
    }

    

    /** метод возвращения в магазин для возврата товара (из интерфейса iReturnProduct) */
    @Override
    public void ReturnToMarket(iActorBehavior actor) {
        System.out.println(actor.getActor().getName()+" клиент вернулся в магазин для возврата товара");
        takeInQueueForReturnProd(actor); // клиент добавлен в очередь
    }

    /** метод ухода из магазина после возвращения товара (из интерфейса iReturnProduct) */
    @Override
    public void GoFromMarketWithoutProd(List<Actor> actors) {
        for(iActorBehavior actor : actors)
        {
            System.out.println(actor.getActor().getName()+" клиент ушел из магазина, вернув товар");
            queue.remove(actor);
        }
        
    }

    /** метод возврата товара (из интерфейса iReturnProduct) */
    @Override
    public void ReturnProduct() {
        List<Actor> releaseActorsForReturnProd = new ArrayList<>();
        for(iActorBehavior actor:queue){
            System.out.println(actor.getActor().getName()+" клиент хочет вернуть товар");
            if(actor.isBuyProduct()){
                actor.setBuyProduct(true);
                System.out.println(actor.getActor().getName()+" клиент вернул продукты в магазин");
                releaseActorsForReturnProd.add(actor.getActor());
            }
        }
        
        GoFromMarketWithoutProd(releaseActorsForReturnProd);
    }

    /** метод посещения отдела возврата товара (из интерфейса iReturnProduct) */
    @Override
    public void takeInQueueForReturnProd(iActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь в отдел возврата ");
    }

        /** метод изменения статуса клиента в маркете (из интерфейса iReturnProduct) */
        @Override
     public void updateWithoutProd() {
        ReturnProduct();
     }

}

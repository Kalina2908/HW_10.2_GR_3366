import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Interfaces.iActorBehavior;


public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market(); // создаем экземпляр маркета
        

        iActorBehavior client1 = new OrdinaryClient("Борис");
        iActorBehavior client2 = new OrdinaryClient("Даша");
        iActorBehavior client3 = new SpecialClient("Илона", 111);
        iActorBehavior client4 = new PromoClient("Макс", "2 по цене 3",1);
                
        /** клиенты вошли в маркет */
        market.acceptToMarket(client1); 
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        

        market.update();

        System.out.println("===================== ВОЗВРАТ ТОВАРА ====================");

        Market ReturnMarket = new Market();
        ReturnMarket.ReturnToMarket(client1); 
        ReturnMarket.ReturnToMarket(client2);

        ReturnMarket.updateWithoutProd();

    }
}

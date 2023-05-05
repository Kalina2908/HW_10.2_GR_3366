package Classes;

/**
 * @param OrdinaryClient - класс обычных покупателей, созданный по образцу абстрактного класса Actor
 */

public class OrdinaryClient extends Actor {

    /** конструктор обычного клиента */
    public OrdinaryClient(String name)
    {
        super(name); // вызов конструктора прародителя
    }

    /** получение имени клиента */
    @Override
    public String getName() {        
        return super.name;
    }

    /** проверка - сделал ли клиент заказ*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** проверка - брал ли клиент заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** проверка - покупал ли клиент товар */
    @Override
    public boolean isBuyProduct() {
        return super.isBuyProduct;
    }

    /** метод - возвращение статуса - делал ли клиент заказ */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /** метод - возвращение статуса - забрал ли клиент заказ */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /** метод - возвращение статуса - покупал ли клиент товар */
    @Override
    public void setBuyProduct(boolean buyProd) {
       super.isBuyProduct = buyProd;   
    }

    @Override
    public Actor getActor() {
        return this;
    }

    
}

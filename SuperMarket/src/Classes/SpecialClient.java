package Classes;

/** 
 * @param SpecialClient - Вип-клиент, созданный на основе абстрактного класса Actor
 */
public class SpecialClient extends Actor{
    private int idVIP;

    /** конструктор для Вип-клиента */
    public SpecialClient(String name, int idVIP){
        super(name);
        this.idVIP = idVIP;
    }

    /** получение имени Вип-клиента */
    @Override
    public String getName() {
        return super.name;
    }

    /** получение номера карточки Вип-клиента */
    public int getIdVIP() {
        return idVIP;
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

    /** проверка - покупал ли клиент товар */
    @Override
    public boolean isBuyProduct() {
        return super.isBuyProduct;
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
package Classes;



public class PromoClient extends Actor{

    private static int numberPromo;
    private String namePromo;
    

    /** конструктор акционного клиента */
    public PromoClient(String name, String namePromo, int numberPromo){
        super(name);
        PromoClient.numberPromo = numberPromo;
        this.namePromo = namePromo;
    }

    /** получение имени акционного клиента */
    @Override
    public String getName() {
        return super.name;
    }

    /** получение порядкового номера участия в акционном товаре */
    public int getNumberPromo() {
        return numberPromo+1;
    }

    /** получение названия акции */
    public String getNamePromo() {
        return namePromo;
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

    /** проверка - покупал ли клиент товар*/
    @Override
    public boolean isBuyProduct() {
        return super.isBuyProduct;
    }

    /**  метод - возвращение статуса - купил ли клиент товар*/
    @Override
    public void setBuyProduct(boolean buyProd) {
       super.isBuyProduct = buyProd;   
    }

    @Override
    public Actor getActor() {
        return this;
    }


   
    
}

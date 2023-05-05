package Classes;

import Interfaces.iActorBehavior;

/**
 * @param Actor - абстрактный класс с интерфейсом iActorBehavior (методы из интерфейса можно не добавлять в абстрактный класс)
 */
public abstract class Actor implements iActorBehavior {
    /** имя клиента */
    protected String name;
    /** получить заказ */
    protected boolean isTakeOrder;
    /** сделать заказ */
    protected boolean isMakeOrder;

    protected boolean isBuyProduct;
    
    /** конструктор клиента */
    public Actor(String name) {
        this.name = name;
    }

    /** конструктор имени клиента */
    public abstract String getName(); // просто объявляется, реализация уже в другом классе

}


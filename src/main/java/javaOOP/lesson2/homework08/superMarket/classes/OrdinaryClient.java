package javaOOP.lesson2.homework08.superMarket.classes;


/**
 * Класс описывающий обычного клиента
 */
public class OrdinaryClient extends Actor {

    /**
     * Конструктор класса
     * @param name Имя киента
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * Проверка получения заказа
     * @return да/нет
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Сеттер для isTakeOrder
     * @param isTakeOrder Флаг получения заказа
     */
    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    /**
     * Проверка создания заказа
     * @return да/нет
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Сеттер для isMakeOrder
     * @param isMakeOrder Флаг создания заказа
     */
    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    /**
     *
     * @return
     */
    public Actor getActor()
    {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void returnOrder() {

    }
}

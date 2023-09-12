package javaOOP.lesson2.homework08.superMarket.classes;

/**
 * Класс специального клиента
 */
public class SpecialClient extends Actor {

    private int idVip;
    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

        public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

        public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

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

    public int getIdVip() {
        return idVip;
    }

    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }

    @Override
    public void returnOrder() {

    }
}

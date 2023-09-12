package javaOOP.lesson2.homework08.superMarket.classes;

/**
 * Класс Промо клиента
 */
public class PromoClient extends Actor {
    /**
     * Наименование акции
     */
    private String promotionName;
    /**
     * ID промо клиента
     */
    private int idPromoClient;
    /**
     * Количество участников в акциии
     */
    static int amountParticipant = 1;
    /**
     * Максимальное кол-во аукционных участников
     */
    static int maxAmountParticipant = 3;

    /**
     * Конструктор промо клиента
     * @param name имя
     * @param promotionName имя акции
     * @throws PromoException Исключение на перелимит участников акции
     */
    public PromoClient(String name, String promotionName) throws PromoException {
        super(name);
        this.idPromoClient = amountParticipant;
        this.promotionName = promotionName;
        if (amountParticipant <= maxAmountParticipant)
            amountParticipant++;
        else
            throw new PromoException("Amount of participants can't be more than 3");
    }


    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    @Override
    public Actor getActor() {
        return null;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    @Override
    public String toString() {
        return "PromoClient: " + super.toString() + " NameOfPromo='" + promotionName + '\'' +
                ", idPromoClient=" + idPromoClient;
    }

    /**
     * При возврате товара аукционным участником их кол-во уменьшается
     */
    @Override
    public void returnOrder() {
        amountParticipant--;
    }
}

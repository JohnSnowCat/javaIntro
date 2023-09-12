package javaOOP.lesson2.homework08.superMarket.classes;

import javaOOP.lesson2.homework08.superMarket.interfaces.iActorBehaviour;
import javaOOP.lesson2.homework08.superMarket.interfaces.iReturnOrder;

/**
 * Класс клиента реализующий интерфейс "Поведение клиента"
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /**
     * Имя клиента
     */
    protected String name;
    /**
     * Флаг состояния забран ли заказ
     */
    protected boolean isTakeOrder;
    /**
     * Флаг состояния сделан ли заказ
     */
    protected boolean isMakeOrder;

    /**
     * Конструктор абстрактного класса Actor
     * @param name Имя клиента
     */
    public Actor(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    @Override
    public String toString() {
        return "Имя: '" + name + "'";
    }
}

package javaOOP.lesson2.homework08.superMarket.classes;

import javaOOP.lesson2.homework08.superMarket.interfaces.iMarketBehaviour;
import javaOOP.lesson2.homework08.superMarket.interfaces.iQueueBehaviour;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс описывает взаимоействие клиентов (наследников класса Actor) с магазином
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
    /**
     * Очередь
     */
    private List<Actor> queue;

    /**
     * Конструктор класса Market в котором полю queue присваиваем сылку на список клиентов
     */
    public Market() {
        this.queue = new ArrayList<Actor>();
    }

    /**
     * Метод сигнализирующий о том, что клиент пришел в магазин и добавляющий его в очередь
     * @param actor наш клиент
     */
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Добавление клиента в очередь
     * @param actor наш клиент
     */
    @Override
    public void takeInQueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " клиент добавлен в очередь ");
    }

    /**
     * Метод сигнализирующий о том, что клиент покинул очередь.
     * В список releaseActors добавляем тех клиентов, которые сделали заказ(takeOrder()) и удаляем их из очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**
     * Метод сигнализирующий о том, что клиент покинул магазин путем удаления клиента из очереди (queue)
     * @param actors клиент
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод пропускающий клиентов по этапам (сделал заказ, получил заказ, вышел из очереди)
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод сигнализирующий о том, что клиент получил заказ
     */
    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " клиент получил свой заказ ");
            }
        }
    }
    /**
     * Метод сигнализирующий о том, что клиент сделал заказ
     */
    @Override
    public void takeOrder() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " клиент сделал заказ ");
            }
        }
    }
}
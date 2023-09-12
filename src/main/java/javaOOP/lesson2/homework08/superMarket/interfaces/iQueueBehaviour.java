package javaOOP.lesson2.homework08.superMarket.interfaces;

import javaOOP.lesson2.homework08.superMarket.classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(Actor actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}

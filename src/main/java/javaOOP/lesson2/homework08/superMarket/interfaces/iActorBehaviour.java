package javaOOP.lesson2.homework08.superMarket.interfaces;

import javaOOP.lesson2.homework08.superMarket.classes.Actor;

public interface iActorBehaviour {
    public boolean isTakeOrder();
    public boolean isMakeOrder();
    public void setTakeOrder(boolean isTakeOrder);
    public void setMakeOrder(boolean isMakeOrder);
    Actor getActor();

}

package javaOOP.lesson2.homework08.superMarket.interfaces;

import javaOOP.lesson2.homework08.superMarket.classes.Actor;

import java.util.List;

public interface iMarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}

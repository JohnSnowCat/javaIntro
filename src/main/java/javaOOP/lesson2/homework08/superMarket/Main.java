package javaOOP.lesson2.homework08.superMarket;


import javaOOP.lesson2.homework08.superMarket.classes.*;

public class Main {
    public static void main(String[] args) {
        Market magnit = new Market();


        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new SpecialClient("prezident", 1);
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);

        try {
            Actor client3 = new PromoClient("Lerik", "meets");
            magnit.acceptToMarket(client3);
            Actor client4 = new PromoClient("Lelik", "meets");
            magnit.acceptToMarket(client4);
            Actor client5 = new PromoClient("Bolik", "meets");
            magnit.acceptToMarket(client5);
            Actor client6 = new PromoClient("Lorem", "meets");
            magnit.acceptToMarket(client6);
        } catch (PromoException e) {
            e.printStackTrace();
            Actor client6 = new OrdinaryClient("Lorem");
            magnit.acceptToMarket(client6);
        }
        magnit.update();
    }
}
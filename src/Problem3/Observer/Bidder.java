package Problem3.Observer;

import Problem3.Subject.Auctioneer;

/**
 * Abstract class that gives any bidder subclasses shared information
 *
 * NOTE: We know that all Bidders have name and then we know that they're all going to have
 * an auctioneer that they're listening to.
 */
public abstract class Bidder implements Observer {
    protected String name;
    protected Auctioneer auctioneer;
    public Bidder(String name, Auctioneer auctioneer) {
        this.name = name;
        this.auctioneer = auctioneer;

        /*
         * Core of the Observer Design Pattern. As a result you can create
         * a Observer, a bidder, and have them listen in no the auction, without having to interact with the
         * code of the Auctioneer itself.
         */
        this.auctioneer.registerObserver(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

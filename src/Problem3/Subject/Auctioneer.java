package Problem3.Subject;

import Problem3.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements Subject {
    private float currentBid;
    private List<Observer> bidders;

    public Auctioneer() {
        this.bidders = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.bidders.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.bidders.remove(o);
    }

    /**
     * Updates all bidders.
     *
     * @param message The message you're sending to all bidders
     */
    @Override
    public void notifyObservers(String message) {
        // Sends message to all bidders
        for (Observer observer: this.bidders) {
            observer.update(message);
        }
    }

    public void setMinimumBid(float minBid) {
        this.currentBid = minBid;
        this.notifyObservers("Minimum bid set to $" + minBid);
    }

    /**
     * Submits a bid and bidder to the auctioneer.
     *
     * @param bidder Person who submitted the bid.
     * @param bidAmount The amount they submitted.
     */
    public void acceptBid(Observer bidder, float bidAmount) {
        if (bidAmount > this.currentBid) {
            // Record who made the bid and what amount they set it to
            this.currentBid = bidAmount;
            // Broadcast new high bid to all bidders
            this.notifyObservers("New bid accepted: $" + bidAmount);
        } else {
            // Notify the bidder that their bid wasn't accepted
            bidder.update("Your bid of $" + bidAmount + " was not accepted. Current bid is $" + currentBid);
        }
    }

    /**
     * Finalize the bid to indicate that bidding is over.
     */
    public void finalizeBid() {
        this.notifyObservers("Item sold for $" + this.currentBid + "! ");
        this.currentBid = 0;
    }
}

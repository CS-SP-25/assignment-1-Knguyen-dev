package Problem3.Observer;

import Problem3.Subject.Auctioneer;

public class InPersonBidder extends Bidder {
    public InPersonBidder(String name, Auctioneer auctioneer) {
        super(name, auctioneer);
    }

    public void update(String message) {
        System.out.println(this.name + " (In-Person) received update: " + message);
    }

    /**
     * Method implementing how an in person bidder submits a paid. They would probably raise
     * the little sign and yell out a number
     * @param bidAmount Amount they're bidding
     */

    public void submitBid(float bidAmount) {
        System.out.println(this.name + " (In-Person) submitted a bid of $" + bidAmount + "!");
        auctioneer.acceptBid(this, bidAmount);
    }

    /**
     * A function where an observer pays the amount they owe. This happens when the bidding is over and the item has been sold.
     * @param bidAmount
     */
    public void payBid(float bidAmount) {
        System.out.println(this.name + " (In-Person) paid $" + bidAmount);
    }
}

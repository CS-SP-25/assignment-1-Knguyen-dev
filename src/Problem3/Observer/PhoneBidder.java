package Problem3.Observer;

import Problem3.Subject.Auctioneer;

public class PhoneBidder extends Bidder {
    public PhoneBidder(String name, Auctioneer auctioneer) {
        super(name, auctioneer);
    }

    @Override
    public void submitBid(float bidAmount) {
        System.out.println(this.name + " (Phone) submitted a bid of $" + bidAmount + "!");
        auctioneer.acceptBid(this, bidAmount);
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " (Phone) received update: " + message);
    }

    @Override
    public void payBid(float bidAmount) {
        System.out.println(this.name + " (In-Person) paid $" + bidAmount);
    }
}

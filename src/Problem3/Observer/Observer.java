package Problem3.Observer;

/**
 * For updating, in this context, we expect
 * the auctioneer to just tell all bidders the new bidding amount through
 * a message.
 *
 * NOTE: This is a Observer for our Auction Application, and having the methods to submit and pay the bid in the observer
 * is going to be helpful as the Auctioneer class is going to make the observer pay for its bid.
 */
public interface Observer {
    public void update(String message);
    public void submitBid(float bidAmount);
    public void payBid(float bidAmount);
}

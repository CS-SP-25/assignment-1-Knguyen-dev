package Problem3.Observer;

/**
 * Interface that all bidders implement. They need to be able to submit a bid and also pay for said bid.
 * As per instructions, they all submit their bids through different channels, but they all share the common
 * feature of being able to pay for bids.
 *
 *
 */
public interface BidChannel {
    public void submitBid(float bidAmount);
    public void payBid(float bidAmount);
}

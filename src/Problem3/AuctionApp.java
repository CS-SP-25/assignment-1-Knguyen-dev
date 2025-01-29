package Problem3;

import Problem3.Observer.InPersonBidder;
import Problem3.Observer.Observer;
import Problem3.Observer.OnlineBidder;
import Problem3.Observer.PhoneBidder;
import Problem3.Subject.Auctioneer;

public class AuctionApp {

    public static void main(String[] args) {

        // Create bidders and make them listen to the existing auctioneer
        Auctioneer auctioneer = new Auctioneer();
        InPersonBidder inPersonBidder = new InPersonBidder("James", auctioneer);
        OnlineBidder onlineBidder = new OnlineBidder("Ryan", auctioneer);
        PhoneBidder phoneBidder = new PhoneBidder("Kevin", auctioneer);

        auctioneer.setMinimumBid(10);
        inPersonBidder.submitBid(9);
        onlineBidder.submitBid(20);
        phoneBidder.submitBid(24);

        // Finalize the bid
        auctioneer.finalizeBid();

        // You can then have the phoneBidder pay
        // NOTE: In the future, you should probably put the 2 methods in the observer
        phoneBidder.payBid(24);


        // Demonstrate how the program would work
    }
}

package company;

import java.io.FileNotFoundException;

public class TravelMain {
    public static void main(String[] args) throws FileNotFoundException {

        TicketClass ticket1 = new TicketClass();
        TravelByBusClass passengers = new TravelByBusClass();
        ticket1.lastPassenger();
        passengers.wholeTrip(ticket1);
        ticket1.sumOfSoldTickets();
        System.out.println(ticket1.getEveryStop());
        passengers.getOnGetOffInTheLastStop();
    }
}

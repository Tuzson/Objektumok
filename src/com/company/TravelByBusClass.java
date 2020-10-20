package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TravelByBusClass {
    private int nrOfSoldTicket;
    private int lineLength;
    private int ticketCostInEvery10Km;


    private void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Txt files/eladott.txt"));
        int[][] lineInfo = new int[1][3];
        nrOfSoldTicket = lineInfo[0][0] = sc.nextInt();
        lineLength = lineInfo[0][1] = sc.nextInt();
        ticketCostInEvery10Km = lineInfo[0][2] = sc.nextInt();

    }

    public void wholeTrip(TicketClass nrOfPassenger) throws FileNotFoundException {
        readFromFile();
        TicketClass test = new TicketClass();
        test.getNrOfSeat();
        for (int i = 1; i < test.getNrOfSeat().length; i++) {
            if (nrOfPassenger.travelDistanceByPassenger(i) == lineLength) {
                System.out.print(" Utasszám: " + (i + 1));
                System.out.println();
            }

        }

    }

    public int getTicketCostInEvery10Km() {
        return ticketCostInEvery10Km;
    }

    public int lastStop() throws FileNotFoundException {
        readFromFile();
        int result = 0;
        TicketClass ticket1 = new TicketClass();
        ticket1.readFromFileTicket();
        for (int i = 1; i < ticket1.getGetOn().length - 1; i++) {
            if (ticket1.getGetOn()[i][1] < lineLength && ticket1.getGetOn()[i][1] > result) {
                result = ticket1.getGetOn()[i][1];
            }
        }
        return result;
    }

    public void getOnGetOffInTheLastStop() throws FileNotFoundException {
        TicketClass ticket1 = new TicketClass();
        readFromFile();
        int counterGetOn = 0;
        int counterGetOff = 0;
        ticket1.readFromFileTicket();
        int lastStop = lastStop();
        for (int i = 1; i < ticket1.getGetOn().length - 1; i++) {
            if (ticket1.getGetOn()[i][1] == lastStop()) {
                counterGetOn++;
            }
            if (ticket1.getGetOff()[i][2] == lastStop()) {
                counterGetOff++;

            }
        }
        System.out.println("Az utolsó megállón : " + counterGetOn + " db utas szállt fel.");
        System.out.println("Az utolsó megállón : " + counterGetOff + " db utas szállt le.");
    }
}
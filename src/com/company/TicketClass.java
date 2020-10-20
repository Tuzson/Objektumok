package company;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class TicketClass {

    private int[][] nrOfSeat = new int[114][3];
    private int[][] getOn = new int[114][3];
    private int[][] getOff = new int[114][3];


    public void readFromFileTicket() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Txt files/eladott.txt"));
        int[][] ticketInfo = new int[114][3];
        for (int i = 0; sc.hasNext(); i++) {
            ticketInfo[i][0] = sc.nextInt();
            ticketInfo[i][1] = sc.nextInt();
            ticketInfo[i][2] = sc.nextInt();
            nrOfSeat[i][0] = ticketInfo[i][0];
            getOn[i][1] = ticketInfo[i][1];
            getOff[i][2] = ticketInfo[i][2];
//            System.out.println(Arrays.deepToString(ticketInfo));

        }
    }

    public int sumTravelDistance(int nr) throws FileNotFoundException {
        readFromFileTicket();
        int sum = 0;
        for (int i = nr; i <= getOn.length - 1; i++) {
            sum = getOff[i][2] - getOn[i][1];
        }
        return sum;
    }

    public int travelDistanceByPassenger(int nr) throws FileNotFoundException {
        readFromFileTicket();
        int sum = 0;
        sum = getOff[nr][2] - getOn[nr][1];
        return sum;

    }

    public void lastPassenger() throws FileNotFoundException {
        readFromFileTicket();
        int result;
        int seat = 0;
        result = sumTravelDistance(getOn.length - 1);
        seat = nrOfSeat[nrOfSeat.length - 1][0];
        System.out.println("A legutolsó jegyvásárló ülésének sorszáma: " + seat);
        System.out.println("Az általa beutazott távolság: " + result);
    }

    public int[][] getNrOfSeat() {
        return nrOfSeat;
    }

    public void sumOfSoldTickets() throws FileNotFoundException {
        readFromFileTicket();
        int sum = 0;
        int sumRounding = 0;
        for (int i = 1; i < nrOfSeat.length; i++) {
            sumRounding = (int) (((Math.ceil(travelDistanceByPassenger(i))) / 10) * 71);

            sum += ((Math.ceil(travelDistanceByPassenger(i))) / 10) * 71;
        }
        System.out.println("A jegyekből összesen : " + sum + "  Ft bevétele származott a társaságnak");

    }

    public int[][] getGetOn() {
        return getOn;
    }

    public int[][] getGetOff() {
        return getOff;
    }

    private int minIndexOfArrayFrom(int[] array, int from) throws FileNotFoundException {
        readFromFileTicket();
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = from; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public int[] matirxConverter (int[][] matrix,int index2) throws FileNotFoundException {
        readFromFileTicket();

        int [] array = new int[matrix.length-1];
        for (int i = 1; i < matrix.length; i++) {
            array[i-1] = matrix[i][index2];
        }
        return array;
    }

    public int getEveryStop() throws FileNotFoundException {
        readFromFileTicket();
        int counterGetOn = 0;
        int counterGetOff = 0;
        int minIndex = 0;
        int remember = 0;
        int [] getOnConvertedArray;
        int [] getOffConvertedArray;
        getOnConvertedArray = matirxConverter(getOn,1);
        getOffConvertedArray = matirxConverter(getOff,2);
        for (int i = 0; i < getOnConvertedArray.length; i++) {
            minIndex = minIndexOfArrayFrom(getOnConvertedArray,i);
            remember = getOnConvertedArray[i];
            getOnConvertedArray[i] = getOnConvertedArray[minIndex];
            getOnConvertedArray[minIndex] = remember;
            minIndex = minIndexOfArrayFrom(getOffConvertedArray,i);
            remember = getOffConvertedArray[i];
            getOffConvertedArray[i] = getOffConvertedArray[minIndex];
            getOffConvertedArray[minIndex] = remember;
        }
        for (int i = 0; i <getOnConvertedArray.length-1 ; i++) {
            if (getOnConvertedArray[i] != getOnConvertedArray[i+1] && getOnConvertedArray[i] > 0){
                counterGetOn++;
            }
        }
        for (int i = 0; i < getOffConvertedArray.length-1; i++) {
            for (int j = 0; j < getOnConvertedArray.length-1; j++) {
                if (getOffConvertedArray[i] != getOffConvertedArray[i+1]){
                    counterGetOff++;
                    if (getOnConvertedArray[i+1] != getOnConvertedArray[i] && getOnConvertedArray [i] == getOffConvertedArray[j] && getOffConvertedArray[j+1] != getOffConvertedArray[j]);
                    counterGetOff--;
                    }
                }
            }remember = counterGetOn+counterGetOff;
        return remember;
        }
    }
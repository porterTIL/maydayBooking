public class Passenger {
    int age;
    String passengerName;
    boolean tsaPreCheck;
    String[] tickets;

    public Passenger(int age, String passengerName, boolean tsaPreCheck) {
        setAge(age);
        setPassengerName(passengerName);
        setTsaPreCheck(tsaPreCheck);
    }

    public void buyTicket() {
        System.out.println("Thank you for buying from " + Flight.Airline);
        System.out.println("Your gate is " + Flight.gateNumber + " and departs at " + Flight.dateTimeDeparture);
        System.out.println("Your seat number is " + Flight.seatNumber);
        System.out.println("");

    }

    private void cancelReservation(int ticketNum) {
        ticketNum = null;

    }

    //Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public boolean isTsaPreCheck() {
        return tsaPreCheck;
    }

    public void setTsaPreCheck(boolean tsaPreCheck) {
        this.tsaPreCheck = tsaPreCheck;
    }

    //ToString
    public String toString() {
        return "Passenger{" +
                "age=" + age +
                ", passengerName='" + passengerName + '\'' +
                ", tsaPreCheck=" + tsaPreCheck +
                '}';
    }

}

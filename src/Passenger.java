public class Passenger {
    int age;
    String passengerName;
    boolean tsaPreCheck;

    public Passenger() {}

    public Passenger(int age, String passengerName, boolean tsaPreCheck) {
        setAge(age);
        setPassengerName(passengerName);
        setTsaPreCheck(tsaPreCheck);
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

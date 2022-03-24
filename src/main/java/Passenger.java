public class Passenger {

    private String name;
    private int numOfBags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public void setNumOfBags(int numOfBags) {
        this.numOfBags = numOfBags;
    }

    public Passenger(String name, int numOfBags){
        this.name = name;
        this.numOfBags = numOfBags;
    }

}

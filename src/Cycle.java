
public class Cycle {
    private byte numberOfWheels;
    private float weight;

public Cycle(byte numberOfWheels, float weight) {
        
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }
public Cycle(){
    this((byte)100,1000f);
}   
   @Override
    public String toString() {
        return "The Number Of Wheels = " + numberOfWheels + ", and the Weight = " + weight;
    }

}













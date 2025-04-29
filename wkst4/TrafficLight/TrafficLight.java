package TrafficLight;

public class TrafficLight {
    private String name;
    private int rSeconds;
    private int gSeconds;
    private int ySeconds;

    
    private static int defaultNum = 0;
    private enum Color {
        RED, GREEN, YELLOW;
    }
    
    private Color currColor;
    
    public TrafficLight (int rSeconds, int gSeconds, int ySeconds, String name) {
        this.rSeconds = rSeconds;
        this.gSeconds = gSeconds;
        this.ySeconds = ySeconds;
        this.name = name;
        currColor = Color.RED;
    }
    public TrafficLight (int rSeconds, int gSeconds, int ySeconds) {
        this.rSeconds = rSeconds;
        this.gSeconds = gSeconds;
        this.ySeconds = ySeconds;
        name = "Traffic light #" + ++defaultNum;
        
    }
    public TrafficLight cycle() {
        Color.RED.toString();
        if (currColor.equals(Color.RED)) {
            currColor = Color.GREEN;
        } if (currColor.equals(Color.GREEN)) {
            currColor = Color.YELLOW;
        } if (currColor.equals(Color.YELLOW)) {
            currColor = Color.RED;
        }
        return this;
    }
    public String currentColor() {
        return currColor.toString();
    }
    
    
    //compare based on the 3 cycle times (we're finally using the cycle times...)
    public int compareTo(TrafficLight other) {
        int otherTimes = other.rSeconds + other.gSeconds + other.ySeconds;
        int currTimes = this.rSeconds + gSeconds + ySeconds;
        return currTimes - otherTimes;
        
    }

    
}


public class Statistics {
    private int count;
    private int i;
    
    public Statistics () {
        this.count = 0;
        this.i = 0;
        
    }
    
    public void addNumber(int number) {
        count = count + number;
        i++;
    }
    
    public int getCount() {
        return i;
        
    }
    
    public int sum() {
        return count;
    }
    
    public double average() {
        if (count == 0) {
            return 0.0;
        } else return (double)this.count/i;
    }
        
    
}

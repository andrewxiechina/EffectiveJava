class myNumber implements Comparable<myNumber>, Cloneable{
    int value;

    public myNumber(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(myNumber o) {
        return o.value - this.value;
    }

    @Override
    protected myNumber clone(){
        try{
            return (myNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Cannot happen
        }
    }

    @Override
    public String toString() {
        return "myNumber{" +
                "value=" + value +
                '}';
    }
}

public class ComparableAndClone {
    public static void main(String[] agrs) {
        myNumber n = new myNumber(1);
        myNumber m = n.clone();
        System.out.println(m);
    }
}

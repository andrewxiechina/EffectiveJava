// When you write equal, override hashcode too
import java.util.Map;
import java.util.HashMap;

class PhoneNumber {
    private final short lineNumber;

    public PhoneNumber(short lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof PhoneNumber)) return false;
        return this.lineNumber == ((PhoneNumber)obj).lineNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + lineNumber;
        return result;
    }

    // Lazily initialized, cached hashCode - Page 49
    // private volatile int hashCode; // (See Item 71)
    //
    // @Override public int hashCode() {
    // int result = hashCode;
    // if (result == 0) {
    // result = 17;
    // result = 31 * result + areaCode;
    // result = 31 * result + prefix;
    // result = 31 * result + lineNumber;
    // hashCode = result;
    // }
    // return result;
    // }
}

public class EqualAndHashCode {
}

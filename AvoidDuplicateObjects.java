import java.util.Calendar;
import java.util.Date;

class Person {
    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    private static final Date BOOM_START;

    // Objects here are same for every instance, so make it static.
    static {
        Calendar c = Calendar.getInstance();
        c.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = c.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0;
    }
}

public class AvoidDuplicateObjects {
    static void main(String[] args) {

    }
}

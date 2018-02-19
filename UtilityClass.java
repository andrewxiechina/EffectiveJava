// Utility classes are made with static methods only.
// Prevent it from doing so.

public class UtilityClass {
    private UtilityClass() {
        throw new AssertionError("Utility class cannot be initialized");
    }
}

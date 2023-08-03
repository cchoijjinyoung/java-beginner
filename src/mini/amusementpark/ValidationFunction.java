package mini.amusementpark;

@FunctionalInterface
public interface ValidationFunction<T, E extends Exception> {
    boolean validate(T t) throws E;
}

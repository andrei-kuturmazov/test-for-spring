package andrei.spring.app;

public class ClassicalMusic implements Music {
    public void doInit() {
        System.out.println("Doing initialization");
    }
    public void doDestroy() {
        System.out.println("Doing destroy");
    }

    @Override
    public String getSong() {
        return "Fourth sonata";
    }
}

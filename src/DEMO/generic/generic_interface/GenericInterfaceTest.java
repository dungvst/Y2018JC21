package DEMO.generic.generic_interface;


interface GenericInterface<G> {
    public G doSomething();
}

public class GenericInterfaceTest<G> implements GenericInterface<G> {
    private G something;
    @Override
    public G doSomething() {
        return something;
    }
}

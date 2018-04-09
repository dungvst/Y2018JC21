package DEMO.generic.generic_interface;

public class GenericInterfaceTest<G> implements GenericInterface<G> {
    private G something;
    @Override
    public G doSomething() {
        return something;
    }
}
interface GenericInterface<G> {


    public G doSomething();

}
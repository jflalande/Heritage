public class TestJ8 implements Contrat1J8, Contrat2J8 {
    @Override
    public void g(double i) { // ...
    }
    @Override
    public void f(int i) {
        Contrat1J8.super.f(6);
    }
}

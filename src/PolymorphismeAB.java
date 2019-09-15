public class PolymorphismeAB {
    public static void main(String[] args) {
        HeritageB b = new HeritageB();
        System.out.println("b.i: " + b.i);
        System.out.println("b.f(): " + b.f());
        System.out.println("b.g(): " + b.g());
        System.out.println("HB.g(): " + HeritageB.g());
        HeritageA a = (HeritageA)b;
        System.out.println("a.i: " + a.i);
        System.out.println("a.f(): " + a.f());
        System.out.println("a.g(): " + a.g());
        // System.out.println("(super)b.f(): " + b.super.f()); // impossible
        // https://stackoverflow.com/questions/6386343
    }
}

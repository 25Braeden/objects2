package problem2;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A b = new A(2);
        A c = b;
        A d = new A(3);
        a.f();
        b.g();
        c.f();
        d.g();
        d.k();
        A e = new A(a.h() + b.h() + c.h() );
        e.k();
    }
}

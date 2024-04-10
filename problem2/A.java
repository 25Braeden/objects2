package problem2;

class A
{ public A() { n = 0; }
    public A(int a) { n = a; }
    public void f() { n++; }
    public void g() { n = 2 * n; }
    public int h() { return n; }
    public void k() { System.out.println(n); }
    private int n;
}

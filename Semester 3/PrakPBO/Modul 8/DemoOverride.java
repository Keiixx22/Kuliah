public class DemoOverride {
    void main() {
        ParentClaz parent = new ParentClaz();
        parent.info();

        ChildClaz sub = new ChildClaz();
        sub.info();
        sub.hello();
    }
}

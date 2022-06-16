package reactiveAgent.src;

public class A {
    boolean dirty;
    public A(boolean dirty){
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}

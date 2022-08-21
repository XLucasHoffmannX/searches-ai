package reactiveAgent.src;

public class B {
    boolean dirty;
    public B(boolean dirty){
        this.dirty = dirty;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }
}

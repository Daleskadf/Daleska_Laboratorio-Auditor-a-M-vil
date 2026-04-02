package v4;
/* loaded from: classes.dex */
public enum f {
    NONE(0),
    SDK(1),
    GLOBAL(2),
    COMBINED(3);
    
    private final int code;

    f(int i7) {
        this.code = i7;
    }

    public final int a() {
        return this.code;
    }
}

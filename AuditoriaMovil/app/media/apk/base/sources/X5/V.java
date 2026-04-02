package X5;
/* loaded from: classes.dex */
public enum V {
    DATE_INVALID(0),
    EXPIRED(1),
    ID_MISMATCH(2),
    INVALID(3),
    NOT_YET_VALID(4),
    UNTRUSTED(5),
    UNKNOWN(6);
    
    public static final U Companion = new Object();
    private final int raw;

    V(int i7) {
        this.raw = i7;
    }

    public final int a() {
        return this.raw;
    }
}

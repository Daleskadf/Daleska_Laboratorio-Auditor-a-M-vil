package T5;
/* loaded from: classes.dex */
public enum N {
    PLATFORM_ENCODED(0),
    JSON_ENCODED(1),
    UNEXPECTED_STRING(2);
    
    public static final M Companion = new Object();
    private final int raw;

    N(int i7) {
        this.raw = i7;
    }

    public final int a() {
        return this.raw;
    }
}

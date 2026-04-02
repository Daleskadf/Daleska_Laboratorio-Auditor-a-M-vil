package X5;
/* renamed from: X5.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0399z {
    ALWAYS(0),
    IF_CONTENT_SCROLLS(1),
    NEVER(2),
    UNKNOWN(3);
    
    public static final C0398y Companion = new Object();
    private final int raw;

    EnumC0399z(int i7) {
        this.raw = i7;
    }

    public final int a() {
        return this.raw;
    }
}

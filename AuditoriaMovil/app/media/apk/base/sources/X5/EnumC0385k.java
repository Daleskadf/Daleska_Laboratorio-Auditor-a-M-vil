package X5;
/* renamed from: X5.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0385k {
    DEBUG(0),
    ERROR(1),
    LOG(2),
    TIP(3),
    WARNING(4),
    UNKNOWN(5);
    
    public static final C0384j Companion = new Object();
    private final int raw;

    EnumC0385k(int i7) {
        this.raw = i7;
    }

    public final int a() {
        return this.raw;
    }
}

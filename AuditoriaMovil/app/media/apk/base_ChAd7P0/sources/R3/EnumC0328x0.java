package R3;
/* renamed from: R3.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0328x0 implements com.google.crypto.tink.shaded.protobuf.A {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.B internalValueMap = new t2.i(8);
    private final int value;

    EnumC0328x0(int i7) {
        this.value = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

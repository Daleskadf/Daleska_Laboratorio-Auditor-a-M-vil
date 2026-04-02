package R3;

import j6.C1372c;
/* renamed from: R3.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0324v0 implements com.google.crypto.tink.shaded.protobuf.A {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.B internalValueMap = new C1372c(8);
    private final int value;

    EnumC0324v0(int i7) {
        this.value = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

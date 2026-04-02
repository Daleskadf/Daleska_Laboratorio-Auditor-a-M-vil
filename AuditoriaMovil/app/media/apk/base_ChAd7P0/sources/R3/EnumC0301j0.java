package R3;

import f5.C0993a;
/* renamed from: R3.j0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0301j0 implements com.google.crypto.tink.shaded.protobuf.A {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    
    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final com.google.crypto.tink.shaded.protobuf.B internalValueMap = new C0993a(8);
    private final int value;

    EnumC0301j0(int i7) {
        this.value = i7;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

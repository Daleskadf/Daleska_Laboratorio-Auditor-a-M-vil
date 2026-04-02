package H4;

import j6.C1372c;
/* loaded from: classes.dex */
public enum I0 implements com.google.protobuf.Q {
    DIRECTION_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);
    
    public static final int ASCENDING_VALUE = 1;
    public static final int DESCENDING_VALUE = 2;
    public static final int DIRECTION_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.S internalValueMap = new C1372c(5);
    private final int value;

    I0(int i7) {
        this.value = i7;
    }

    @Override // com.google.protobuf.Q
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

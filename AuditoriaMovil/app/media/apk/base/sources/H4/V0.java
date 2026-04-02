package H4;
/* loaded from: classes.dex */
public enum V0 implements com.google.protobuf.Q {
    OPERATOR_UNSPECIFIED(0),
    IS_NAN(2),
    IS_NULL(3),
    IS_NOT_NAN(4),
    IS_NOT_NULL(5),
    UNRECOGNIZED(-1);
    
    public static final int IS_NAN_VALUE = 2;
    public static final int IS_NOT_NAN_VALUE = 4;
    public static final int IS_NOT_NULL_VALUE = 5;
    public static final int IS_NULL_VALUE = 3;
    public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.S internalValueMap = new Object();
    private final int value;

    V0(int i7) {
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

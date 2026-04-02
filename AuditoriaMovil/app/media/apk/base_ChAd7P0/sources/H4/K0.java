package H4;
/* loaded from: classes.dex */
public enum K0 implements com.google.protobuf.Q {
    OPERATOR_UNSPECIFIED(0),
    LESS_THAN(1),
    LESS_THAN_OR_EQUAL(2),
    GREATER_THAN(3),
    GREATER_THAN_OR_EQUAL(4),
    EQUAL(5),
    NOT_EQUAL(6),
    ARRAY_CONTAINS(7),
    IN(8),
    ARRAY_CONTAINS_ANY(9),
    NOT_IN(10),
    UNRECOGNIZED(-1);
    
    public static final int ARRAY_CONTAINS_ANY_VALUE = 9;
    public static final int ARRAY_CONTAINS_VALUE = 7;
    public static final int EQUAL_VALUE = 5;
    public static final int GREATER_THAN_OR_EQUAL_VALUE = 4;
    public static final int GREATER_THAN_VALUE = 3;
    public static final int IN_VALUE = 8;
    public static final int LESS_THAN_OR_EQUAL_VALUE = 2;
    public static final int LESS_THAN_VALUE = 1;
    public static final int NOT_EQUAL_VALUE = 6;
    public static final int NOT_IN_VALUE = 10;
    public static final int OPERATOR_UNSPECIFIED_VALUE = 0;
    private static final com.google.protobuf.S internalValueMap = new t2.i(5);
    private final int value;

    K0(int i7) {
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

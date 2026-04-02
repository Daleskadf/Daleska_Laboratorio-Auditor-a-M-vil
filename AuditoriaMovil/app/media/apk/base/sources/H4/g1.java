package H4;
/* loaded from: classes.dex */
public enum g1 implements com.google.protobuf.Q {
    NO_CHANGE(0),
    ADD(1),
    REMOVE(2),
    CURRENT(3),
    RESET(4),
    UNRECOGNIZED(-1);
    
    public static final int ADD_VALUE = 1;
    public static final int CURRENT_VALUE = 3;
    public static final int NO_CHANGE_VALUE = 0;
    public static final int REMOVE_VALUE = 2;
    public static final int RESET_VALUE = 4;
    private static final com.google.protobuf.S internalValueMap = new Object();
    private final int value;

    g1(int i7) {
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

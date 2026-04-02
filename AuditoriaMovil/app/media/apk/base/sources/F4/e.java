package F4;

import com.google.protobuf.Q;
import com.google.protobuf.S;
/* loaded from: classes.dex */
public enum e implements Q {
    ORDER_UNSPECIFIED(0),
    ASCENDING(1),
    DESCENDING(2),
    UNRECOGNIZED(-1);
    
    public static final int ASCENDING_VALUE = 1;
    public static final int DESCENDING_VALUE = 2;
    public static final int ORDER_UNSPECIFIED_VALUE = 0;
    private static final S internalValueMap = new Object();
    private final int value;

    e(int i7) {
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

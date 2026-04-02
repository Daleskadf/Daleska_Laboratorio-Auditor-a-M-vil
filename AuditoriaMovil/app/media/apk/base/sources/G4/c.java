package G4;

import com.google.protobuf.Q;
import com.google.protobuf.S;
/* loaded from: classes.dex */
public enum c implements Q {
    FIRST(0),
    LAST(1),
    UNRECOGNIZED(-1);
    
    public static final int FIRST_VALUE = 0;
    public static final int LAST_VALUE = 1;
    private static final S internalValueMap = new e5.b(4);
    private final int value;

    c(int i7) {
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

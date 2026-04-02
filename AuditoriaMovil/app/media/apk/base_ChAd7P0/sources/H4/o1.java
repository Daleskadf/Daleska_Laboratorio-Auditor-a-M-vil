package H4;
/* loaded from: classes.dex */
public enum o1 {
    NULL_VALUE(11),
    BOOLEAN_VALUE(1),
    INTEGER_VALUE(2),
    DOUBLE_VALUE(3),
    TIMESTAMP_VALUE(10),
    STRING_VALUE(17),
    BYTES_VALUE(18),
    REFERENCE_VALUE(5),
    GEO_POINT_VALUE(8),
    ARRAY_VALUE(9),
    MAP_VALUE(6),
    VALUETYPE_NOT_SET(0);
    
    private final int value;

    o1(int i7) {
        this.value = i7;
    }
}

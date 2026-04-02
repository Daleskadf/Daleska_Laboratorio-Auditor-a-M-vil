package d6;
/* loaded from: classes.dex */
public enum r {
    HEADER_TABLE_SIZE(1),
    ENABLE_PUSH(2),
    MAX_CONCURRENT_STREAMS(4),
    MAX_FRAME_SIZE(5),
    MAX_HEADER_LIST_SIZE(6),
    INITIAL_WINDOW_SIZE(7);
    
    private final int bit;

    r(int i7) {
        this.bit = i7;
    }

    public final int a() {
        return this.bit;
    }
}

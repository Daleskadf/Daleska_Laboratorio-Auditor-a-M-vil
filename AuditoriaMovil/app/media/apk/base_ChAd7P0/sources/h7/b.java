package h7;
/* loaded from: classes.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    
    private final int levelInt;
    private final String levelStr;

    b(int i7, String str) {
        this.levelInt = i7;
        this.levelStr = str;
    }

    public final int a() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.levelStr;
    }
}

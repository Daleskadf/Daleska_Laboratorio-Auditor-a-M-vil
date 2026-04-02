package D;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0074y {
    private static final /* synthetic */ EnumC0074y[] $VALUES;
    public static final EnumC0074y INITIALIZED;
    public static final EnumC0074y INITIALIZING;
    public static final EnumC0074y INITIALIZING_ERROR;
    public static final EnumC0074y SHUTDOWN;
    public static final EnumC0074y UNINITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, D.y] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, D.y] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, D.y] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, D.y] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, D.y] */
    static {
        ?? r52 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r52;
        ?? r62 = new Enum("INITIALIZING", 1);
        INITIALIZING = r62;
        ?? r7 = new Enum("INITIALIZING_ERROR", 2);
        INITIALIZING_ERROR = r7;
        ?? r8 = new Enum("INITIALIZED", 3);
        INITIALIZED = r8;
        ?? r9 = new Enum("SHUTDOWN", 4);
        SHUTDOWN = r9;
        $VALUES = new EnumC0074y[]{r52, r62, r7, r8, r9};
    }

    public static EnumC0074y valueOf(String str) {
        return (EnumC0074y) Enum.valueOf(EnumC0074y.class, str);
    }

    public static EnumC0074y[] values() {
        return (EnumC0074y[]) $VALUES.clone();
    }
}

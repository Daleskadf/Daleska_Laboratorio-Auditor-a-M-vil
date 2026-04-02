package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1525k {
    private static final /* synthetic */ EnumC1525k[] $VALUES;
    public static final EnumC1525k INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION;
    public static final EnumC1525k INITIALIZE_LOCAL_LISTEN_ONLY;
    public static final EnumC1525k NO_ACTION_REQUIRED;
    public static final EnumC1525k REQUIRE_WATCH_CONNECTION_ONLY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [n4.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [n4.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [n4.k, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [n4.k, java.lang.Enum] */
    static {
        ?? r42 = new Enum("INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION", 0);
        INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION = r42;
        ?? r52 = new Enum("INITIALIZE_LOCAL_LISTEN_ONLY", 1);
        INITIALIZE_LOCAL_LISTEN_ONLY = r52;
        ?? r62 = new Enum("REQUIRE_WATCH_CONNECTION_ONLY", 2);
        REQUIRE_WATCH_CONNECTION_ONLY = r62;
        ?? r7 = new Enum("NO_ACTION_REQUIRED", 3);
        NO_ACTION_REQUIRED = r7;
        $VALUES = new EnumC1525k[]{r42, r52, r62, r7};
    }

    public static EnumC1525k valueOf(String str) {
        return (EnumC1525k) Enum.valueOf(EnumC1525k.class, str);
    }

    public static EnumC1525k[] values() {
        return (EnumC1525k[]) $VALUES.clone();
    }
}

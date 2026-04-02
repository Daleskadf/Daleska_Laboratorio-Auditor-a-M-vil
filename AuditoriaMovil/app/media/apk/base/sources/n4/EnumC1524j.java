package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n4.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1524j {
    private static final /* synthetic */ EnumC1524j[] $VALUES;
    public static final EnumC1524j NO_ACTION_REQUIRED;
    public static final EnumC1524j REQUIRE_WATCH_DISCONNECTION_ONLY;
    public static final EnumC1524j TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION;
    public static final EnumC1524j TERMINATE_LOCAL_LISTEN_ONLY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [n4.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [n4.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [n4.j, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [n4.j, java.lang.Enum] */
    static {
        ?? r42 = new Enum("TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION", 0);
        TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION = r42;
        ?? r52 = new Enum("TERMINATE_LOCAL_LISTEN_ONLY", 1);
        TERMINATE_LOCAL_LISTEN_ONLY = r52;
        ?? r62 = new Enum("REQUIRE_WATCH_DISCONNECTION_ONLY", 2);
        REQUIRE_WATCH_DISCONNECTION_ONLY = r62;
        ?? r7 = new Enum("NO_ACTION_REQUIRED", 3);
        NO_ACTION_REQUIRED = r7;
        $VALUES = new EnumC1524j[]{r42, r52, r62, r7};
    }

    public static EnumC1524j valueOf(String str) {
        return (EnumC1524j) Enum.valueOf(EnumC1524j.class, str);
    }

    public static EnumC1524j[] values() {
        return (EnumC1524j[]) $VALUES.clone();
    }
}

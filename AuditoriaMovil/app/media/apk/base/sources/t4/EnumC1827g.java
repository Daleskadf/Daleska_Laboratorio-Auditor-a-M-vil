package t4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t4.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1827g {
    private static final /* synthetic */ EnumC1827g[] $VALUES;
    public static final EnumC1827g REACHABLE;
    public static final EnumC1827g UNREACHABLE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, t4.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, t4.g] */
    static {
        ?? r22 = new Enum("UNREACHABLE", 0);
        UNREACHABLE = r22;
        ?? r32 = new Enum("REACHABLE", 1);
        REACHABLE = r32;
        $VALUES = new EnumC1827g[]{r22, r32};
    }

    public static EnumC1827g valueOf(String str) {
        return (EnumC1827g) Enum.valueOf(EnumC1827g.class, str);
    }

    public static EnumC1827g[] values() {
        return (EnumC1827g[]) $VALUES.clone();
    }
}

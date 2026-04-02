package n4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n4.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1514C {
    private static final /* synthetic */ EnumC1514C[] $VALUES;
    public static final EnumC1514C LIMIT_TO_FIRST;
    public static final EnumC1514C LIMIT_TO_LAST;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, n4.C] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, n4.C] */
    static {
        ?? r22 = new Enum("LIMIT_TO_FIRST", 0);
        LIMIT_TO_FIRST = r22;
        ?? r32 = new Enum("LIMIT_TO_LAST", 1);
        LIMIT_TO_LAST = r32;
        $VALUES = new EnumC1514C[]{r22, r32};
    }

    public static EnumC1514C valueOf(String str) {
        return (EnumC1514C) Enum.valueOf(EnumC1514C.class, str);
    }

    public static EnumC1514C[] values() {
        return (EnumC1514C[]) $VALUES.clone();
    }
}

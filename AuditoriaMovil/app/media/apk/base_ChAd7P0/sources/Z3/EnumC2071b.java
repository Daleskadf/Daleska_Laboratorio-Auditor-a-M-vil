package z3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: z3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2071b {
    private static final /* synthetic */ EnumC2071b[] $VALUES;
    public static final EnumC2071b DONE;
    public static final EnumC2071b FAILED;
    public static final EnumC2071b NOT_READY;
    public static final EnumC2071b READY;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, z3.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, z3.b] */
    static {
        ?? r42 = new Enum("READY", 0);
        READY = r42;
        ?? r52 = new Enum("NOT_READY", 1);
        NOT_READY = r52;
        ?? r62 = new Enum("DONE", 2);
        DONE = r62;
        ?? r7 = new Enum("FAILED", 3);
        FAILED = r7;
        $VALUES = new EnumC2071b[]{r42, r52, r62, r7};
    }

    public static EnumC2071b valueOf(String str) {
        return (EnumC2071b) Enum.valueOf(EnumC2071b.class, str);
    }

    public static EnumC2071b[] values() {
        return (EnumC2071b[]) $VALUES.clone();
    }
}

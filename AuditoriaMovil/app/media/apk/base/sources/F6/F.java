package F6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class F {
    private static final /* synthetic */ F[] $VALUES;
    public static final F ATOMIC;
    public static final F DEFAULT;
    public static final F LAZY;
    public static final F UNDISPATCHED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, F6.F] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, F6.F] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, F6.F] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, F6.F] */
    static {
        ?? r42 = new Enum("DEFAULT", 0);
        DEFAULT = r42;
        ?? r52 = new Enum("LAZY", 1);
        LAZY = r52;
        ?? r62 = new Enum("ATOMIC", 2);
        ATOMIC = r62;
        ?? r7 = new Enum("UNDISPATCHED", 3);
        UNDISPATCHED = r7;
        $VALUES = new F[]{r42, r52, r62, r7};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) $VALUES.clone();
    }
}

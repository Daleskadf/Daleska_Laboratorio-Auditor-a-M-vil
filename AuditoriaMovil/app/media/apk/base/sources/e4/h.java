package e4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h BLACK;
    public static final h RED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, e4.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, e4.h] */
    static {
        ?? r22 = new Enum("RED", 0);
        RED = r22;
        ?? r32 = new Enum("BLACK", 1);
        BLACK = r32;
        $VALUES = new h[]{r22, r32};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}

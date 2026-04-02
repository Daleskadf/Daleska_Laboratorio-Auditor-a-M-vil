package t2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h best;
    public static final h bestForNavigation;
    public static final h high;
    public static final h low;
    public static final h lowest;
    public static final h medium;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, t2.h] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, t2.h] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, t2.h] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, t2.h] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, t2.h] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, t2.h] */
    static {
        ?? r62 = new Enum("lowest", 0);
        lowest = r62;
        ?? r7 = new Enum("low", 1);
        low = r7;
        ?? r8 = new Enum("medium", 2);
        medium = r8;
        ?? r9 = new Enum("high", 3);
        high = r9;
        ?? r10 = new Enum("best", 4);
        best = r10;
        ?? r11 = new Enum("bestForNavigation", 5);
        bestForNavigation = r11;
        $VALUES = new h[]{r62, r7, r8, r9, r10, r11};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}

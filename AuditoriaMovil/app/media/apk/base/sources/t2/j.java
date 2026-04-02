package t2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ j[] $VALUES;
    public static final j precise;
    public static final j reduced;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, t2.j] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, t2.j] */
    static {
        ?? r22 = new Enum("reduced", 0);
        reduced = r22;
        ?? r32 = new Enum("precise", 1);
        precise = r32;
        $VALUES = new j[]{r22, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}

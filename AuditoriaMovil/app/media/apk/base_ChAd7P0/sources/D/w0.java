package D;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w0 {
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 ACTIVE;
    public static final w0 INACTIVE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, D.w0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, D.w0] */
    static {
        ?? r22 = new Enum("ACTIVE", 0);
        ACTIVE = r22;
        ?? r32 = new Enum("INACTIVE", 1);
        INACTIVE = r32;
        $VALUES = new w0[]{r22, r32};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}

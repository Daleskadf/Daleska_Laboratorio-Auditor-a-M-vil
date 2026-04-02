package t2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t disabled;
    public static final t enabled;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [t2.t, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [t2.t, java.lang.Enum] */
    static {
        ?? r22 = new Enum("disabled", 0);
        disabled = r22;
        ?? r32 = new Enum("enabled", 1);
        enabled = r32;
        $VALUES = new t[]{r22, r32};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}

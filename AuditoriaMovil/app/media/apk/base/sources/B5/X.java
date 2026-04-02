package B5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class X {
    private static final /* synthetic */ X[] $VALUES;
    public static final X opaque;
    public static final X transparent;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [B5.X, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [B5.X, java.lang.Enum] */
    static {
        ?? r22 = new Enum("opaque", 0);
        opaque = r22;
        ?? r32 = new Enum("transparent", 1);
        transparent = r32;
        $VALUES = new X[]{r22, r32};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) $VALUES.clone();
    }
}

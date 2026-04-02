package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a6.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0477f {
    private static final /* synthetic */ EnumC0477f[] $VALUES;
    public static final EnumC0477f DEBUG;
    public static final EnumC0477f ERROR;
    public static final EnumC0477f INFO;
    public static final EnumC0477f WARNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a6.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a6.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a6.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [a6.f, java.lang.Enum] */
    static {
        ?? r42 = new Enum("DEBUG", 0);
        DEBUG = r42;
        ?? r52 = new Enum("INFO", 1);
        INFO = r52;
        ?? r62 = new Enum("WARNING", 2);
        WARNING = r62;
        ?? r7 = new Enum("ERROR", 3);
        ERROR = r7;
        $VALUES = new EnumC0477f[]{r42, r52, r62, r7};
    }

    public static EnumC0477f valueOf(String str) {
        return (EnumC0477f) Enum.valueOf(EnumC0477f.class, str);
    }

    public static EnumC0477f[] values() {
        return (EnumC0477f[]) $VALUES.clone();
    }
}

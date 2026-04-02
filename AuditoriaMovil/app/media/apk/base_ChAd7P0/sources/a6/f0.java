package a6;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 BIDI_STREAMING;
    public static final f0 CLIENT_STREAMING;
    public static final f0 SERVER_STREAMING;
    public static final f0 UNARY;
    public static final f0 UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [a6.f0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a6.f0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [a6.f0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a6.f0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a6.f0, java.lang.Enum] */
    static {
        ?? r52 = new Enum("UNARY", 0);
        UNARY = r52;
        ?? r62 = new Enum("CLIENT_STREAMING", 1);
        CLIENT_STREAMING = r62;
        ?? r7 = new Enum("SERVER_STREAMING", 2);
        SERVER_STREAMING = r7;
        ?? r8 = new Enum("BIDI_STREAMING", 3);
        BIDI_STREAMING = r8;
        ?? r9 = new Enum("UNKNOWN", 4);
        UNKNOWN = r9;
        $VALUES = new f0[]{r52, r62, r7, r8, r9};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}

package G5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c CLIP_PATH;
    public static final c CLIP_RECT;
    public static final c CLIP_RRECT;
    public static final c OPACITY;
    public static final c TRANSFORM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [G5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [G5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [G5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [G5.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [G5.c, java.lang.Enum] */
    static {
        ?? r52 = new Enum("CLIP_RECT", 0);
        CLIP_RECT = r52;
        ?? r62 = new Enum("CLIP_RRECT", 1);
        CLIP_RRECT = r62;
        ?? r7 = new Enum("CLIP_PATH", 2);
        CLIP_PATH = r7;
        ?? r8 = new Enum("TRANSFORM", 3);
        TRANSFORM = r8;
        ?? r9 = new Enum("OPACITY", 4);
        OPACITY = r9;
        $VALUES = new c[]{r52, r62, r7, r8, r9};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}

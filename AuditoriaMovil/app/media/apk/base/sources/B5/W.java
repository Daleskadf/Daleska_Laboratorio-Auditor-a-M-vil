package B5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W {
    private static final /* synthetic */ W[] $VALUES;
    public static final W image;
    public static final W surface;
    public static final W texture;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [B5.W, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [B5.W, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [B5.W, java.lang.Enum] */
    static {
        ?? r32 = new Enum("surface", 0);
        surface = r32;
        ?? r42 = new Enum("texture", 1);
        texture = r42;
        ?? r52 = new Enum("image", 2);
        image = r52;
        $VALUES = new W[]{r32, r42, r52};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) $VALUES.clone();
    }
}

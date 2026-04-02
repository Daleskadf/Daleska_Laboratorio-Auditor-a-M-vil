package j7;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f LOW_LATENCY;
    public static final f MEDIA_PLAYER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j7.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j7.f] */
    static {
        ?? r22 = new Enum("MEDIA_PLAYER", 0);
        MEDIA_PLAYER = r22;
        ?? r32 = new Enum("LOW_LATENCY", 1);
        LOW_LATENCY = r32;
        $VALUES = new f[]{r22, r32};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}

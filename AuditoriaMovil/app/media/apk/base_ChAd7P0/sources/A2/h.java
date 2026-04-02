package a2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h AES256_GCM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, a2.h] */
    static {
        ?? r12 = new Enum("AES256_GCM", 0);
        AES256_GCM = r12;
        $VALUES = new h[]{r12};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}

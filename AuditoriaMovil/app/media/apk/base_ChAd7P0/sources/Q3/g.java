package q3;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {
    public static final g LATEST;
    public static final g LEGACY;
    private static final /* synthetic */ g[] zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, q3.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q3.g] */
    static {
        ?? r22 = new Enum("LEGACY", 0);
        LEGACY = r22;
        ?? r32 = new Enum("LATEST", 1);
        LATEST = r32;
        zza = new g[]{r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) zza.clone();
    }
}

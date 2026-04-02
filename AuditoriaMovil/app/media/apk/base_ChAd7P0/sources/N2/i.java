package N2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    public static final i zza;
    public static final i zzb;
    public static final i zzc;
    private static final /* synthetic */ i[] zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, N2.i] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, N2.i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, N2.i] */
    static {
        ?? r32 = new Enum("LEGACY", 0);
        zza = r32;
        ?? r42 = new Enum("AUTH_INSTANTIATION", 1);
        zzb = r42;
        ?? r52 = new Enum("CALLER_INSTANTIATION", 2);
        zzc = r52;
        zzd = new i[]{r32, r42, r52};
    }

    public static i[] values() {
        return (i[]) zzd.clone();
    }
}

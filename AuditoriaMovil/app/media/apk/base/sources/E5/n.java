package e5;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n implements Executor {
    public static final n zza;
    private static final /* synthetic */ n[] zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, e5.n] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        zza = r12;
        zzb = new n[]{r12};
    }

    public static n[] values() {
        return (n[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f.a().f10894a.post(runnable);
    }
}

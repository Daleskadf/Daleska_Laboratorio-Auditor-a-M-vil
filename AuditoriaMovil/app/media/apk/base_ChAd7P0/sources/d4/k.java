package d4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k implements Executor {
    private static final /* synthetic */ k[] $VALUES;
    private static final Handler HANDLER;
    public static final k INSTANCE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [d4.k, java.lang.Enum] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        INSTANCE = r12;
        $VALUES = new k[]{r12};
        HANDLER = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}

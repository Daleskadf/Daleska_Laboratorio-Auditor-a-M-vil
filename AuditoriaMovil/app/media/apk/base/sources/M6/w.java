package m6;

import q6.InterfaceC1714a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ InterfaceC1714a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w Done;
    public static final w Failed;
    public static final w NotReady;
    public static final w Ready;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [m6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [m6.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [m6.w, java.lang.Enum] */
    static {
        ?? r42 = new Enum("Ready", 0);
        Ready = r42;
        ?? r52 = new Enum("NotReady", 1);
        NotReady = r52;
        ?? r62 = new Enum("Done", 2);
        Done = r62;
        ?? r7 = new Enum("Failed", 3);
        Failed = r7;
        w[] wVarArr = {r42, r52, r62, r7};
        $VALUES = wVarArr;
        $ENTRIES = m5.d.f(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}

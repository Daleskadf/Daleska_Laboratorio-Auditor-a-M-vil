package C6;

import q6.InterfaceC1714a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ InterfaceC1714a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i INTERNAL;
    public static final i PRIVATE;
    public static final i PROTECTED;
    public static final i PUBLIC;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [C6.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [C6.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [C6.i, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [C6.i, java.lang.Enum] */
    static {
        ?? r42 = new Enum("PUBLIC", 0);
        PUBLIC = r42;
        ?? r52 = new Enum("PROTECTED", 1);
        PROTECTED = r52;
        ?? r62 = new Enum("INTERNAL", 2);
        INTERNAL = r62;
        ?? r7 = new Enum("PRIVATE", 3);
        PRIVATE = r7;
        i[] iVarArr = {r42, r52, r62, r7};
        $VALUES = iVarArr;
        $ENTRIES = m5.d.f(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}

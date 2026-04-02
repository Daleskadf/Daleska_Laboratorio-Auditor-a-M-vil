package io.flutter.view;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ n[] $VALUES;
    public static final n LOCALE;
    public static final n SPELLOUT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.view.n, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.view.n, java.lang.Enum] */
    static {
        ?? r22 = new Enum("SPELLOUT", 0);
        SPELLOUT = r22;
        ?? r32 = new Enum("LOCALE", 1);
        LOCALE = r32;
        $VALUES = new n[]{r22, r32};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}

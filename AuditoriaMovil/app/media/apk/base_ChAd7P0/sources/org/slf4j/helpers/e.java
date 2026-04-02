package org.slf4j.helpers;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e Stderr;
    public static final e Stdout;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, org.slf4j.helpers.e] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, org.slf4j.helpers.e] */
    static {
        ?? r22 = new Enum("Stderr", 0);
        Stderr = r22;
        ?? r32 = new Enum("Stdout", 1);
        Stdout = r32;
        $VALUES = new e[]{r22, r32};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}

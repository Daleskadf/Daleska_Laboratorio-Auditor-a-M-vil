package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 EXCLUDE;
    public static final a0 INCLUDE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, com.google.firebase.firestore.a0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.google.firebase.firestore.a0] */
    static {
        ?? r22 = new Enum("EXCLUDE", 0);
        EXCLUDE = r22;
        ?? r32 = new Enum("INCLUDE", 1);
        INCLUDE = r32;
        $VALUES = new a0[]{r22, r32};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}

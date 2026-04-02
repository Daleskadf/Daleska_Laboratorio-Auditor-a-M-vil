package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n0 {
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 CACHE;
    public static final n0 DEFAULT;
    public static final n0 SERVER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, com.google.firebase.firestore.n0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, com.google.firebase.firestore.n0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.google.firebase.firestore.n0] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        DEFAULT = r32;
        ?? r42 = new Enum("SERVER", 1);
        SERVER = r42;
        ?? r52 = new Enum("CACHE", 2);
        CACHE = r52;
        $VALUES = new n0[]{r32, r42, r52};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}

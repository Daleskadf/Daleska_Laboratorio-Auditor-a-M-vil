package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    public static final P CACHE;
    public static final P DEFAULT;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.firestore.P, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.firestore.P, java.lang.Enum] */
    static {
        ?? r22 = new Enum("DEFAULT", 0);
        DEFAULT = r22;
        ?? r32 = new Enum("CACHE", 1);
        CACHE = r32;
        $VALUES = new P[]{r22, r32};
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }
}

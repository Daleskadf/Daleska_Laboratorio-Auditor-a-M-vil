package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f0 {
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 ASCENDING;
    public static final f0 DESCENDING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.firestore.f0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.firestore.f0, java.lang.Enum] */
    static {
        ?? r22 = new Enum("ASCENDING", 0);
        ASCENDING = r22;
        ?? r32 = new Enum("DESCENDING", 1);
        DESCENDING = r32;
        $VALUES = new f0[]{r22, r32};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}

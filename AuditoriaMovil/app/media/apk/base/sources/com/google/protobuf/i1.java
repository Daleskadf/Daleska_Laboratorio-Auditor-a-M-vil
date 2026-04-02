package com.google.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i1 {
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 ASCENDING;
    public static final i1 DESCENDING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.protobuf.i1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.protobuf.i1, java.lang.Enum] */
    static {
        ?? r22 = new Enum("ASCENDING", 0);
        ASCENDING = r22;
        ?? r32 = new Enum("DESCENDING", 1);
        DESCENDING = r32;
        $VALUES = new i1[]{r22, r32};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}

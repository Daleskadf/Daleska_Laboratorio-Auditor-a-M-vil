package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.firebase.firestore.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0815q {
    private static final /* synthetic */ EnumC0815q[] $VALUES;
    static final EnumC0815q DEFAULT;
    public static final EnumC0815q ESTIMATE;
    public static final EnumC0815q NONE;
    public static final EnumC0815q PREVIOUS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.firebase.firestore.q, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.firebase.firestore.q, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.firestore.q, java.lang.Enum] */
    static {
        ?? r32 = new Enum("NONE", 0);
        NONE = r32;
        ?? r42 = new Enum("ESTIMATE", 1);
        ESTIMATE = r42;
        ?? r52 = new Enum("PREVIOUS", 2);
        PREVIOUS = r52;
        $VALUES = new EnumC0815q[]{r32, r42, r52};
        DEFAULT = r32;
    }

    public static EnumC0815q valueOf(String str) {
        return (EnumC0815q) Enum.valueOf(EnumC0815q.class, str);
    }

    public static EnumC0815q[] values() {
        return (EnumC0815q[]) $VALUES.clone();
    }
}

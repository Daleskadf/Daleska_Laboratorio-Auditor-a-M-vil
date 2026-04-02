package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.firebase.firestore.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0809k {
    private static final /* synthetic */ EnumC0809k[] $VALUES;
    public static final EnumC0809k ADDED;
    public static final EnumC0809k MODIFIED;
    public static final EnumC0809k REMOVED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, com.google.firebase.firestore.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, com.google.firebase.firestore.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.google.firebase.firestore.k] */
    static {
        ?? r32 = new Enum("ADDED", 0);
        ADDED = r32;
        ?? r42 = new Enum("MODIFIED", 1);
        MODIFIED = r42;
        ?? r52 = new Enum("REMOVED", 2);
        REMOVED = r52;
        $VALUES = new EnumC0809k[]{r32, r42, r52};
    }

    public static EnumC0809k valueOf(String str) {
        return (EnumC0809k) Enum.valueOf(EnumC0809k.class, str);
    }

    public static EnumC0809k[] values() {
        return (EnumC0809k[]) $VALUES.clone();
    }
}

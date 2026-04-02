package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.firebase.firestore.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0805g {
    private static final /* synthetic */ EnumC0805g[] $VALUES;
    public static final EnumC0805g SERVER;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, com.google.firebase.firestore.g] */
    static {
        ?? r12 = new Enum("SERVER", 0);
        SERVER = r12;
        $VALUES = new EnumC0805g[]{r12};
    }

    public static EnumC0805g valueOf(String str) {
        return (EnumC0805g) Enum.valueOf(EnumC0805g.class, str);
    }

    public static EnumC0805g[] values() {
        return (EnumC0805g[]) $VALUES.clone();
    }
}

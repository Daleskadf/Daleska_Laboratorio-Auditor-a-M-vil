package com.google.firebase.firestore;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class V {
    private static final /* synthetic */ V[] $VALUES;
    public static final V ERROR;
    public static final V RUNNING;
    public static final V SUCCESS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, com.google.firebase.firestore.V] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, com.google.firebase.firestore.V] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, com.google.firebase.firestore.V] */
    static {
        ?? r32 = new Enum("ERROR", 0);
        ERROR = r32;
        ?? r42 = new Enum("RUNNING", 1);
        RUNNING = r42;
        ?? r52 = new Enum("SUCCESS", 2);
        SUCCESS = r52;
        $VALUES = new V[]{r32, r42, r52};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) $VALUES.clone();
    }
}

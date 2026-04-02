package com.google.crypto.tink.shaded.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 PROTO2;
    public static final c0 PROTO3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.c0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.c0] */
    static {
        ?? r22 = new Enum("PROTO2", 0);
        PROTO2 = r22;
        ?? r32 = new Enum("PROTO3", 1);
        PROTO3 = r32;
        $VALUES = new c0[]{r22, r32};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}

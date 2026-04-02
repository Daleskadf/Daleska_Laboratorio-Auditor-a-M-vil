package com.google.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.protobuf.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0876y0 {
    private static final /* synthetic */ EnumC0876y0[] $VALUES;
    public static final EnumC0876y0 EDITIONS;
    public static final EnumC0876y0 PROTO2;
    public static final EnumC0876y0 PROTO3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.protobuf.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.protobuf.y0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.protobuf.y0, java.lang.Enum] */
    static {
        ?? r32 = new Enum("PROTO2", 0);
        PROTO2 = r32;
        ?? r42 = new Enum("PROTO3", 1);
        PROTO3 = r42;
        ?? r52 = new Enum("EDITIONS", 2);
        EDITIONS = r52;
        $VALUES = new EnumC0876y0[]{r32, r42, r52};
    }

    public static EnumC0876y0 valueOf(String str) {
        return (EnumC0876y0) Enum.valueOf(EnumC0876y0.class, str);
    }

    public static EnumC0876y0[] values() {
        return (EnumC0876y0[]) $VALUES.clone();
    }
}

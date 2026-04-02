package com.google.crypto.tink.shaded.protobuf;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.crypto.tink.shaded.protobuf.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0796x {
    private static final /* synthetic */ EnumC0796x[] $VALUES;
    public static final EnumC0796x BUILD_MESSAGE_INFO;
    public static final EnumC0796x GET_DEFAULT_INSTANCE;
    public static final EnumC0796x GET_MEMOIZED_IS_INITIALIZED;
    public static final EnumC0796x GET_PARSER;
    public static final EnumC0796x NEW_BUILDER;
    public static final EnumC0796x NEW_MUTABLE_INSTANCE;
    public static final EnumC0796x SET_MEMOIZED_IS_INITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ?? r7 = new Enum("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = r7;
        ?? r8 = new Enum("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = r8;
        ?? r9 = new Enum("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = r9;
        ?? r10 = new Enum("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = r10;
        ?? r11 = new Enum("NEW_BUILDER", 4);
        NEW_BUILDER = r11;
        ?? r12 = new Enum("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = r12;
        ?? r13 = new Enum("GET_PARSER", 6);
        GET_PARSER = r13;
        $VALUES = new EnumC0796x[]{r7, r8, r9, r10, r11, r12, r13};
    }

    public static EnumC0796x valueOf(String str) {
        return (EnumC0796x) Enum.valueOf(EnumC0796x.class, str);
    }

    public static EnumC0796x[] values() {
        return (EnumC0796x[]) $VALUES.clone();
    }
}

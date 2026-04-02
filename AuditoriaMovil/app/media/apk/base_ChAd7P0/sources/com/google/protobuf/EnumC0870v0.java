package com.google.protobuf;
/* renamed from: com.google.protobuf.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0870v0 implements Q {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int NULL_VALUE_VALUE = 0;
    private static final S internalValueMap = new C0846j(2);
    private final int value;

    EnumC0870v0(int i7) {
        this.value = i7;
    }

    @Override // com.google.protobuf.Q
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

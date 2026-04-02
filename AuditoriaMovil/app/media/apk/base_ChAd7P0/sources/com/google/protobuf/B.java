package com.google.protobuf;
/* loaded from: classes.dex */
public abstract /* synthetic */ class B {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9987a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f9988b;

    static {
        int[] iArr = new int[Z.values().length];
        f9988b = iArr;
        try {
            iArr[Z.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9988b[Z.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9988b[Z.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[C.values().length];
        f9987a = iArr2;
        try {
            iArr2[C.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9987a[C.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9987a[C.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

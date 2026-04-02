package com.google.crypto.tink.shaded.protobuf;
/* renamed from: com.google.crypto.tink.shaded.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0790q {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9686a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f9687b;

    static {
        int[] iArr = new int[G.values().length];
        f9687b = iArr;
        try {
            iArr[G.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9687b[G.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9687b[G.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[r.values().length];
        f9686a = iArr2;
        try {
            iArr2[r.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9686a[r.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9686a[r.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

package com.google.firebase.firestore;

import n4.EnumC1528n;
/* loaded from: classes.dex */
public abstract /* synthetic */ class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9805a;

    static {
        int[] iArr = new int[EnumC1528n.values().length];
        f9805a = iArr;
        try {
            iArr[EnumC1528n.NOT_EQUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9805a[EnumC1528n.ARRAY_CONTAINS_ANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9805a[EnumC1528n.IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9805a[EnumC1528n.NOT_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

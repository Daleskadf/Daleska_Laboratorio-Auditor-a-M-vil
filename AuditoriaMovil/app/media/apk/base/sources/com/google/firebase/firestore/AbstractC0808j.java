package com.google.firebase.firestore;

import n4.EnumC1520f;
/* renamed from: com.google.firebase.firestore.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0808j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f9814a;

    static {
        int[] iArr = new int[EnumC1520f.values().length];
        f9814a = iArr;
        try {
            iArr[EnumC1520f.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9814a[EnumC1520f.METADATA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9814a[EnumC1520f.MODIFIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9814a[EnumC1520f.REMOVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}

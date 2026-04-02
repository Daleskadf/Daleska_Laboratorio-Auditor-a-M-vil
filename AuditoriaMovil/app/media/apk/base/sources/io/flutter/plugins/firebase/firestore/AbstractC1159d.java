package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.EnumC0809k;
import com.google.firebase.firestore.V;
/* renamed from: io.flutter.plugins.firebase.firestore.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1159d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f11916a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f11917b;

    static {
        int[] iArr = new int[V.values().length];
        f11917b = iArr;
        try {
            iArr[V.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11917b[V.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11917b[V.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC0809k.values().length];
        f11916a = iArr2;
        try {
            iArr2[EnumC0809k.ADDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11916a[EnumC0809k.MODIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11916a[EnumC0809k.REMOVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

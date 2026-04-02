package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.I;
/* renamed from: io.flutter.plugins.firebase.firestore.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1156a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f11911a;

    static {
        int[] iArr = new int[I.values().length];
        f11911a = iArr;
        try {
            iArr[I.ABORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f11911a[I.ALREADY_EXISTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f11911a[I.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f11911a[I.DATA_LOSS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f11911a[I.DEADLINE_EXCEEDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f11911a[I.FAILED_PRECONDITION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f11911a[I.INTERNAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f11911a[I.INVALID_ARGUMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f11911a[I.NOT_FOUND.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f11911a[I.OUT_OF_RANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f11911a[I.PERMISSION_DENIED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f11911a[I.RESOURCE_EXHAUSTED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f11911a[I.UNAUTHENTICATED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f11911a[I.UNAVAILABLE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f11911a[I.UNIMPLEMENTED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f11911a[I.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
    }
}

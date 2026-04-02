package t4;

import com.google.firebase.firestore.I;
/* renamed from: t4.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1828h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15802a;

    static {
        int[] iArr = new int[I.values().length];
        f15802a = iArr;
        try {
            iArr[I.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15802a[I.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15802a[I.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15802a[I.DEADLINE_EXCEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15802a[I.RESOURCE_EXHAUSTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f15802a[I.INTERNAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f15802a[I.UNAVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f15802a[I.UNAUTHENTICATED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f15802a[I.INVALID_ARGUMENT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f15802a[I.NOT_FOUND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f15802a[I.ALREADY_EXISTS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f15802a[I.PERMISSION_DENIED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f15802a[I.FAILED_PRECONDITION.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f15802a[I.ABORTED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f15802a[I.OUT_OF_RANGE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f15802a[I.UNIMPLEMENTED.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f15802a[I.DATA_LOSS.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
    }
}

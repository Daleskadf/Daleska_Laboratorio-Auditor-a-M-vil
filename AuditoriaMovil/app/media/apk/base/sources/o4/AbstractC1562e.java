package o4;

import java.math.RoundingMode;
/* renamed from: o4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1562e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f14597a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f14597a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f14597a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f14597a[RoundingMode.UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f14597a[RoundingMode.CEILING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f14597a[RoundingMode.FLOOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f14597a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f14597a[RoundingMode.HALF_DOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f14597a[RoundingMode.HALF_UP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}

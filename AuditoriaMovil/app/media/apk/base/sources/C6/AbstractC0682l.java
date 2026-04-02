package c6;

import a6.EnumC0477f;
/* renamed from: c6.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0682l {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f8881a;

    static {
        int[] iArr = new int[EnumC0477f.values().length];
        f8881a = iArr;
        try {
            iArr[EnumC0477f.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8881a[EnumC0477f.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8881a[EnumC0477f.INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}

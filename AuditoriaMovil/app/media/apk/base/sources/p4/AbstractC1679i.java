package p4;

import s4.EnumC1793c;
/* renamed from: p4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1679i {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15256a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int[] f15257b;

    static {
        int[] iArr = new int[s4.j.values().length];
        f15257b = iArr;
        try {
            iArr[s4.j.DOCUMENTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15257b[s4.j.QUERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[EnumC1793c.values().length];
        f15256a = iArr2;
        try {
            iArr2[EnumC1793c.DOCUMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15256a[EnumC1793c.NO_DOCUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f15256a[EnumC1793c.UNKNOWN_DOCUMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}

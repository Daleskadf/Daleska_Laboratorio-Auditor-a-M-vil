package d1;

import H0.r;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f10174a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10175b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10176c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10177d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10178e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10179g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10180h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10181i;
    public final r[] j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10182k;

    /* renamed from: l  reason: collision with root package name */
    public final String f10183l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10184m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f10185n;

    /* renamed from: o  reason: collision with root package name */
    public final long[] f10186o;

    /* renamed from: p  reason: collision with root package name */
    public final long f10187p;

    public b(String str, String str2, int i7, String str3, long j, String str4, int i8, int i9, int i10, int i11, String str5, r[] rVarArr, ArrayList arrayList, long[] jArr, long j8) {
        this.f10183l = str;
        this.f10184m = str2;
        this.f10174a = i7;
        this.f10175b = str3;
        this.f10176c = j;
        this.f10177d = str4;
        this.f10178e = i8;
        this.f = i9;
        this.f10179g = i10;
        this.f10180h = i11;
        this.f10181i = str5;
        this.j = rVarArr;
        this.f10185n = arrayList;
        this.f10186o = jArr;
        this.f10187p = j8;
        this.f10182k = arrayList.size();
    }

    public final b a(r[] rVarArr) {
        long[] jArr = this.f10186o;
        return new b(this.f10183l, this.f10184m, this.f10174a, this.f10175b, this.f10176c, this.f10177d, this.f10178e, this.f, this.f10179g, this.f10180h, this.f10181i, rVarArr, this.f10185n, jArr, this.f10187p);
    }

    public final long b(int i7) {
        if (i7 == this.f10182k - 1) {
            return this.f10187p;
        }
        long[] jArr = this.f10186o;
        return jArr[i7 + 1] - jArr[i7];
    }
}

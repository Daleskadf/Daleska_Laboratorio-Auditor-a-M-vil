package H0;

import D.AbstractC0059i;
import android.net.Uri;
import java.util.Arrays;
/* renamed from: H0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121a {

    /* renamed from: a  reason: collision with root package name */
    public final int f1775a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1776b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri[] f1777c;

    /* renamed from: d  reason: collision with root package name */
    public final C[] f1778d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1779e;
    public final long[] f;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
        K0.x.H(5);
        K0.x.H(6);
        K0.x.H(7);
        K0.x.H(8);
    }

    public C0121a(int i7, int i8, int[] iArr, C[] cArr, long[] jArr) {
        boolean z7;
        Uri uri;
        int i9 = 0;
        if (iArr.length == cArr.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        this.f1775a = i7;
        this.f1776b = i8;
        this.f1779e = iArr;
        this.f1778d = cArr;
        this.f = jArr;
        this.f1777c = new Uri[cArr.length];
        while (true) {
            Uri[] uriArr = this.f1777c;
            if (i9 < uriArr.length) {
                C c8 = cArr[i9];
                if (c8 == null) {
                    uri = null;
                } else {
                    C0145z c0145z = c8.f1642b;
                    c0145z.getClass();
                    uri = c0145z.f1914a;
                }
                uriArr[i9] = uri;
                i9++;
            } else {
                return;
            }
        }
    }

    public final int a(int i7) {
        int i8;
        int i9 = i7 + 1;
        while (true) {
            int[] iArr = this.f1779e;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0121a.class != obj.getClass()) {
            return false;
        }
        C0121a c0121a = (C0121a) obj;
        if (this.f1775a == c0121a.f1775a && this.f1776b == c0121a.f1776b && Arrays.equals(this.f1778d, c0121a.f1778d) && Arrays.equals(this.f1779e, c0121a.f1779e) && Arrays.equals(this.f, c0121a.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (int) 0;
        int hashCode = Arrays.hashCode(this.f1778d);
        int hashCode2 = Arrays.hashCode(this.f1779e);
        return (((Arrays.hashCode(this.f) + ((hashCode2 + ((hashCode + (((((this.f1775a * 31) + this.f1776b) * 31) + i7) * 31)) * 31)) * 31)) * 31) + i7) * 31;
    }
}

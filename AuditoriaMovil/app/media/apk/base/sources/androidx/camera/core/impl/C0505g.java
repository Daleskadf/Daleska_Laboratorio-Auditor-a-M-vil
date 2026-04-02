package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import v.C1878a;
/* renamed from: androidx.camera.core.impl.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505g {
    public static final Range f = new Range(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Size f7621a;

    /* renamed from: b  reason: collision with root package name */
    public final D.D f7622b;

    /* renamed from: c  reason: collision with root package name */
    public final Range f7623c;

    /* renamed from: d  reason: collision with root package name */
    public final C1878a f7624d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7625e;

    public C0505g(Size size, D.D d7, Range range, C1878a c1878a, boolean z7) {
        this.f7621a = size;
        this.f7622b = d7;
        this.f7623c = range;
        this.f7624d = c1878a;
        this.f7625e = z7;
    }

    public final F3.o a() {
        F3.o oVar = new F3.o(9);
        oVar.f1178b = this.f7621a;
        oVar.f1179c = this.f7622b;
        oVar.f1180d = this.f7623c;
        oVar.f1181e = this.f7624d;
        oVar.f = Boolean.valueOf(this.f7625e);
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0505g)) {
            return false;
        }
        C0505g c0505g = (C0505g) obj;
        if (this.f7621a.equals(c0505g.f7621a) && this.f7622b.equals(c0505g.f7622b) && this.f7623c.equals(c0505g.f7623c)) {
            C1878a c1878a = c0505g.f7624d;
            C1878a c1878a2 = this.f7624d;
            if (c1878a2 != null ? c1878a2.equals(c1878a) : c1878a == null) {
                if (this.f7625e == c0505g.f7625e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        int hashCode2 = (((((this.f7621a.hashCode() ^ 1000003) * 1000003) ^ this.f7622b.hashCode()) * 1000003) ^ this.f7623c.hashCode()) * 1000003;
        C1878a c1878a = this.f7624d;
        if (c1878a == null) {
            hashCode = 0;
        } else {
            hashCode = c1878a.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        if (this.f7625e) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f7621a + ", dynamicRange=" + this.f7622b + ", expectedFrameRateRange=" + this.f7623c + ", implementationOptions=" + this.f7624d + ", zslDisabled=" + this.f7625e + "}";
    }
}

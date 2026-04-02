package m1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f13892a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13893b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13894c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13895d;

    public F(int i7, byte[] bArr, int i8, int i9) {
        this.f13892a = i7;
        this.f13893b = bArr;
        this.f13894c = i8;
        this.f13895d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        if (this.f13892a == f.f13892a && this.f13894c == f.f13894c && this.f13895d == f.f13895d && Arrays.equals(this.f13893b, f.f13893b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f13893b) + (this.f13892a * 31)) * 31) + this.f13894c) * 31) + this.f13895d;
    }
}

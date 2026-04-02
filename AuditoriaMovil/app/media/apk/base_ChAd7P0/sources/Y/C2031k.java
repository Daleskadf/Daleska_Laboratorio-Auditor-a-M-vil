package y;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;
/* renamed from: y.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031k {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16583a;

    /* renamed from: b  reason: collision with root package name */
    public String f16584b;

    /* renamed from: c  reason: collision with root package name */
    public long f16585c = 1;

    public C2031k(OutputConfiguration outputConfiguration) {
        this.f16583a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2031k)) {
            return false;
        }
        C2031k c2031k = (C2031k) obj;
        if (!Objects.equals(this.f16583a, c2031k.f16583a) || this.f16585c != c2031k.f16585c || !Objects.equals(this.f16584b, c2031k.f16584b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16583a.hashCode() ^ 31;
        int i7 = (hashCode2 << 5) - hashCode2;
        String str = this.f16584b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = hashCode ^ i7;
        int i9 = (i8 << 5) - i8;
        long j = this.f16585c;
        return ((int) (j ^ (j >>> 32))) ^ i9;
    }
}

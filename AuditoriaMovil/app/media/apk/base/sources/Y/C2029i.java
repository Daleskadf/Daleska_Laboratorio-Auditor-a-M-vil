package y;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;
/* renamed from: y.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2029i {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16579a;

    /* renamed from: b  reason: collision with root package name */
    public String f16580b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16581c;

    /* renamed from: d  reason: collision with root package name */
    public long f16582d = 1;

    public C2029i(OutputConfiguration outputConfiguration) {
        this.f16579a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2029i)) {
            return false;
        }
        C2029i c2029i = (C2029i) obj;
        if (!Objects.equals(this.f16579a, c2029i.f16579a) || this.f16581c != c2029i.f16581c || this.f16582d != c2029i.f16582d || !Objects.equals(this.f16580b, c2029i.f16580b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16579a.hashCode() ^ 31;
        int i7 = (this.f16581c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
        int i8 = (i7 << 5) - i7;
        String str = this.f16580b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode ^ i8;
        int i10 = (i9 << 5) - i9;
        long j = this.f16582d;
        return ((int) (j ^ (j >>> 32))) ^ i10;
    }
}

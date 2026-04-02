package y;

import android.hardware.camera2.params.OutputConfiguration;
import j$.util.Objects;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f16586a;

    /* renamed from: b  reason: collision with root package name */
    public long f16587b = 1;

    public m(OutputConfiguration outputConfiguration) {
        this.f16586a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!Objects.equals(this.f16586a, mVar.f16586a) || this.f16587b != mVar.f16587b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f16586a.hashCode() ^ 31;
        int i7 = (hashCode << 5) - hashCode;
        long j = this.f16587b;
        return ((int) (j ^ (j >>> 32))) ^ i7;
    }
}

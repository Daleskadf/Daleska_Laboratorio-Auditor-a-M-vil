package D2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final A2.b f843a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f844b;

    public e(A2.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f843a = bVar;
                this.f844b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f843a.equals(eVar.f843a)) {
            return false;
        }
        return Arrays.equals(this.f844b, eVar.f844b);
    }

    public final int hashCode() {
        return ((this.f843a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f844b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f843a + ", bytes=[...]}";
    }
}

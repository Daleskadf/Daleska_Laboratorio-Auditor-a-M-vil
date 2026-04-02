package I;

import androidx.camera.core.impl.C0502d;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2077a;

    /* renamed from: b  reason: collision with root package name */
    public final C0502d f2078b;

    public a(String str, C0502d c0502d) {
        if (str != null) {
            this.f2077a = str;
            if (c0502d != null) {
                this.f2078b = c0502d;
                return;
            }
            throw new NullPointerException("Null cameraConfigId");
        }
        throw new NullPointerException("Null cameraIdString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2077a.equals(aVar.f2077a) && this.f2078b.equals(aVar.f2078b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2077a.hashCode() ^ 1000003) * 1000003) ^ this.f2078b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f2077a + ", cameraConfigId=" + this.f2078b + "}";
    }
}

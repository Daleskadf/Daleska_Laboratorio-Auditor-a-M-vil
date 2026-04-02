package R;

import androidx.lifecycle.InterfaceC0568u;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0568u f4504a;

    /* renamed from: b  reason: collision with root package name */
    public final I.a f4505b;

    public a(InterfaceC0568u interfaceC0568u, I.a aVar) {
        if (interfaceC0568u != null) {
            this.f4504a = interfaceC0568u;
            if (aVar != null) {
                this.f4505b = aVar;
                return;
            }
            throw new NullPointerException("Null cameraId");
        }
        throw new NullPointerException("Null lifecycleOwner");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f4504a.equals(aVar.f4504a) && this.f4505b.equals(aVar.f4505b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4504a.hashCode() ^ 1000003) * 1000003) ^ this.f4505b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f4504a + ", cameraId=" + this.f4505b + "}";
    }
}

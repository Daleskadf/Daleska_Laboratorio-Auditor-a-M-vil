package D;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0521x;
/* renamed from: D.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061k {

    /* renamed from: a  reason: collision with root package name */
    public final Size f731a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f732b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0521x f733c;

    /* renamed from: d  reason: collision with root package name */
    public final int f734d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f735e;

    public C0061k(Size size, Rect rect, InterfaceC0521x interfaceC0521x, int i7, boolean z7) {
        if (size != null) {
            this.f731a = size;
            if (rect != null) {
                this.f732b = rect;
                this.f733c = interfaceC0521x;
                this.f734d = i7;
                this.f735e = z7;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0061k)) {
            return false;
        }
        C0061k c0061k = (C0061k) obj;
        if (this.f731a.equals(c0061k.f731a) && this.f732b.equals(c0061k.f732b)) {
            InterfaceC0521x interfaceC0521x = c0061k.f733c;
            InterfaceC0521x interfaceC0521x2 = this.f733c;
            if (interfaceC0521x2 != null ? interfaceC0521x2.equals(interfaceC0521x) : interfaceC0521x == null) {
                if (this.f734d == c0061k.f734d && this.f735e == c0061k.f735e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7;
        int hashCode2 = (((this.f731a.hashCode() ^ 1000003) * 1000003) ^ this.f732b.hashCode()) * 1000003;
        InterfaceC0521x interfaceC0521x = this.f733c;
        if (interfaceC0521x == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC0521x.hashCode();
        }
        int i8 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f734d) * 1000003;
        if (this.f735e) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "CameraInputInfo{inputSize=" + this.f731a + ", inputCropRect=" + this.f732b + ", cameraInternal=" + this.f733c + ", rotationDegrees=" + this.f734d + ", mirroring=" + this.f735e + "}";
    }
}

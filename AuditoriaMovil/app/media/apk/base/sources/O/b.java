package O;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final UUID f3453a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3454b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3455c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3456d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f3457e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3458g;

    public b(UUID uuid, int i7, int i8, Rect rect, Size size, int i9, boolean z7) {
        if (uuid != null) {
            this.f3453a = uuid;
            this.f3454b = i7;
            this.f3455c = i8;
            if (rect != null) {
                this.f3456d = rect;
                if (size != null) {
                    this.f3457e = size;
                    this.f = i9;
                    this.f3458g = z7;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3453a.equals(bVar.f3453a) && this.f3454b == bVar.f3454b && this.f3455c == bVar.f3455c && this.f3456d.equals(bVar.f3456d) && this.f3457e.equals(bVar.f3457e) && this.f == bVar.f && this.f3458g == bVar.f3458g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((((((((this.f3453a.hashCode() ^ 1000003) * 1000003) ^ this.f3454b) * 1000003) ^ this.f3455c) * 1000003) ^ this.f3456d.hashCode()) * 1000003) ^ this.f3457e.hashCode()) * 1000003) ^ this.f) * 1000003;
        if (this.f3458g) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return ((hashCode ^ i7) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.f3453a + ", getTargets=" + this.f3454b + ", getFormat=" + this.f3455c + ", getCropRect=" + this.f3456d + ", getSize=" + this.f3457e + ", getRotationDegrees=" + this.f + ", isMirroring=" + this.f3458g + ", shouldRespectInputCropRect=false}";
    }
}

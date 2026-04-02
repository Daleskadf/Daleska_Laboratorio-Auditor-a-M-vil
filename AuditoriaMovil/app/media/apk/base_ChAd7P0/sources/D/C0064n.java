package D;

import android.graphics.Matrix;
import android.graphics.Rect;
/* renamed from: D.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064n {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f746a;

    /* renamed from: b  reason: collision with root package name */
    public final int f747b;

    /* renamed from: c  reason: collision with root package name */
    public final int f748c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f749d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f750e;
    public final boolean f;

    public C0064n(Rect rect, int i7, int i8, boolean z7, Matrix matrix, boolean z8) {
        if (rect != null) {
            this.f746a = rect;
            this.f747b = i7;
            this.f748c = i8;
            this.f749d = z7;
            if (matrix != null) {
                this.f750e = matrix;
                this.f = z8;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0064n)) {
            return false;
        }
        C0064n c0064n = (C0064n) obj;
        if (this.f746a.equals(c0064n.f746a) && this.f747b == c0064n.f747b && this.f748c == c0064n.f748c && this.f749d == c0064n.f749d && this.f750e.equals(c0064n.f750e) && this.f == c0064n.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (((((this.f746a.hashCode() ^ 1000003) * 1000003) ^ this.f747b) * 1000003) ^ this.f748c) * 1000003;
        int i8 = 1237;
        if (this.f749d) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int hashCode2 = (((hashCode ^ i7) * 1000003) ^ this.f750e.hashCode()) * 1000003;
        if (this.f) {
            i8 = 1231;
        }
        return hashCode2 ^ i8;
    }

    public final String toString() {
        return "TransformationInfo{getCropRect=" + this.f746a + ", getRotationDegrees=" + this.f747b + ", getTargetRotation=" + this.f748c + ", hasCameraTransform=" + this.f749d + ", getSensorToBufferTransform=" + this.f750e + ", isMirroring=" + this.f + "}";
    }
}

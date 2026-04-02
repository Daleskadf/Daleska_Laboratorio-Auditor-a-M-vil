package s3;

import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.internal.I;
/* renamed from: s3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779g extends C1776d {

    /* renamed from: d  reason: collision with root package name */
    public final C1774b f15604d;

    /* renamed from: e  reason: collision with root package name */
    public final float f15605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1779g(C1774b c1774b, float f) {
        super(3, c1774b, Float.valueOf(f));
        I.j(c1774b, "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            this.f15604d = c1774b;
            this.f15605e = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    @Override // s3.C1776d
    public final String toString() {
        StringBuilder m7 = Y.m("[CustomCap: bitmapDescriptor=", String.valueOf(this.f15604d), " refWidth=");
        m7.append(this.f15605e);
        m7.append("]");
        return m7.toString();
    }
}

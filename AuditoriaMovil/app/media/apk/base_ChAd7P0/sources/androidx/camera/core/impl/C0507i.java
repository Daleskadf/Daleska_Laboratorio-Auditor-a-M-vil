package androidx.camera.core.impl;

import android.util.Size;
import java.util.HashMap;
/* renamed from: androidx.camera.core.impl.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507i {

    /* renamed from: a  reason: collision with root package name */
    public final Size f7632a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7633b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f7634c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f7635d;

    /* renamed from: e  reason: collision with root package name */
    public final Size f7636e;
    public final HashMap f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f7637g;

    public C0507i(Size size, HashMap hashMap, Size size2, HashMap hashMap2, Size size3, HashMap hashMap3, HashMap hashMap4) {
        if (size != null) {
            this.f7632a = size;
            this.f7633b = hashMap;
            if (size2 != null) {
                this.f7634c = size2;
                this.f7635d = hashMap2;
                if (size3 != null) {
                    this.f7636e = size3;
                    this.f = hashMap3;
                    this.f7637g = hashMap4;
                    return;
                }
                throw new NullPointerException("Null recordSize");
            }
            throw new NullPointerException("Null previewSize");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0507i)) {
            return false;
        }
        C0507i c0507i = (C0507i) obj;
        if (this.f7632a.equals(c0507i.f7632a) && this.f7633b.equals(c0507i.f7633b) && this.f7634c.equals(c0507i.f7634c) && this.f7635d.equals(c0507i.f7635d) && this.f7636e.equals(c0507i.f7636e) && this.f.equals(c0507i.f) && this.f7637g.equals(c0507i.f7637g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f7632a.hashCode() ^ 1000003) * 1000003) ^ this.f7633b.hashCode()) * 1000003) ^ this.f7634c.hashCode()) * 1000003) ^ this.f7635d.hashCode()) * 1000003) ^ this.f7636e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.f7637g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f7632a + ", s720pSizeMap=" + this.f7633b + ", previewSize=" + this.f7634c + ", s1440pSizeMap=" + this.f7635d + ", recordSize=" + this.f7636e + ", maximumSizeMap=" + this.f + ", ultraMaximumSizeMap=" + this.f7637g + "}";
    }
}

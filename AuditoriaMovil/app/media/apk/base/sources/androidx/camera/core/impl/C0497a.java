package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import java.util.List;
import v.C1878a;
/* renamed from: androidx.camera.core.impl.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497a {

    /* renamed from: a  reason: collision with root package name */
    public final C0506h f7597a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7598b;

    /* renamed from: c  reason: collision with root package name */
    public final Size f7599c;

    /* renamed from: d  reason: collision with root package name */
    public final D.D f7600d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7601e;
    public final C1878a f;

    /* renamed from: g  reason: collision with root package name */
    public final Range f7602g;

    public C0497a(C0506h c0506h, int i7, Size size, D.D d7, List list, C1878a c1878a, Range range) {
        if (c0506h != null) {
            this.f7597a = c0506h;
            this.f7598b = i7;
            if (size != null) {
                this.f7599c = size;
                if (d7 != null) {
                    this.f7600d = d7;
                    if (list != null) {
                        this.f7601e = list;
                        this.f = c1878a;
                        this.f7602g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0497a)) {
            return false;
        }
        C0497a c0497a = (C0497a) obj;
        if (this.f7597a.equals(c0497a.f7597a) && this.f7598b == c0497a.f7598b && this.f7599c.equals(c0497a.f7599c) && this.f7600d.equals(c0497a.f7600d) && this.f7601e.equals(c0497a.f7601e)) {
            C1878a c1878a = c0497a.f;
            C1878a c1878a2 = this.f;
            if (c1878a2 != null ? c1878a2.equals(c1878a) : c1878a == null) {
                Range range = c0497a.f7602g;
                Range range2 = this.f7602g;
                if (range2 == null) {
                    if (range == null) {
                        return true;
                    }
                } else if (range2.equals(range)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.f7597a.hashCode() ^ 1000003) * 1000003) ^ this.f7598b) * 1000003) ^ this.f7599c.hashCode()) * 1000003) ^ this.f7600d.hashCode()) * 1000003) ^ this.f7601e.hashCode()) * 1000003;
        int i7 = 0;
        C1878a c1878a = this.f;
        if (c1878a == null) {
            hashCode = 0;
        } else {
            hashCode = c1878a.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        Range range = this.f7602g;
        if (range != null) {
            i7 = range.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f7597a + ", imageFormat=" + this.f7598b + ", size=" + this.f7599c + ", dynamicRange=" + this.f7600d + ", captureTypes=" + this.f7601e + ", implementationOptions=" + this.f + ", targetFrameRate=" + this.f7602g + "}";
    }
}

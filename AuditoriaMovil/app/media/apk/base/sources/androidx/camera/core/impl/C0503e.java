package androidx.camera.core.impl;

import java.util.Collections;
import java.util.List;
/* renamed from: androidx.camera.core.impl.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503e {

    /* renamed from: a  reason: collision with root package name */
    public final J f7616a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7617b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7618c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7619d;

    /* renamed from: e  reason: collision with root package name */
    public final D.D f7620e;

    public C0503e(J j, List list, int i7, int i8, D.D d7) {
        this.f7616a = j;
        this.f7617b = list;
        this.f7618c = i7;
        this.f7619d = i8;
        this.f7620e = d7;
    }

    public static F3.o a(J j) {
        F3.o oVar = new F3.o(8);
        if (j != null) {
            oVar.f1178b = j;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                oVar.f1179c = emptyList;
                oVar.f1180d = -1;
                oVar.f1181e = -1;
                oVar.f = D.D.f607d;
                return oVar;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0503e)) {
            return false;
        }
        C0503e c0503e = (C0503e) obj;
        if (this.f7616a.equals(c0503e.f7616a) && this.f7617b.equals(c0503e.f7617b) && this.f7618c == c0503e.f7618c && this.f7619d == c0503e.f7619d && this.f7620e.equals(c0503e.f7620e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f7616a.hashCode() ^ 1000003) * 1000003) ^ this.f7617b.hashCode()) * (-721379959)) ^ this.f7618c) * 1000003) ^ this.f7619d) * 1000003) ^ this.f7620e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f7616a + ", sharedSurfaces=" + this.f7617b + ", physicalCameraId=null, mirrorMode=" + this.f7618c + ", surfaceGroupId=" + this.f7619d + ", dynamicRange=" + this.f7620e + "}";
    }
}

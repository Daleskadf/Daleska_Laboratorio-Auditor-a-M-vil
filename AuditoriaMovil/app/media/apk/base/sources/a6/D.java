package a6;

import D.AbstractC0055e;
import c6.C0721y0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final String f7069a;

    /* renamed from: b  reason: collision with root package name */
    public final C f7070b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7071c;

    /* renamed from: d  reason: collision with root package name */
    public final C0721y0 f7072d;

    public D(String str, C c8, long j, C0721y0 c0721y0) {
        this.f7069a = str;
        G.i.j(c8, "severity");
        this.f7070b = c8;
        this.f7071c = j;
        this.f7072d = c0721y0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d7 = (D) obj;
        if (!F.f.l(this.f7069a, d7.f7069a) || !F.f.l(this.f7070b, d7.f7070b) || this.f7071c != d7.f7071c || !F.f.l(null, null) || !F.f.l(this.f7072d, d7.f7072d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7069a, this.f7070b, Long.valueOf(this.f7071c), null, this.f7072d});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7069a, "description");
        C7.a(this.f7070b, "severity");
        C7.b("timestampNanos", this.f7071c);
        C7.a(null, "channelRef");
        C7.a(this.f7072d, "subchannelRef");
        return C7.toString();
    }
}

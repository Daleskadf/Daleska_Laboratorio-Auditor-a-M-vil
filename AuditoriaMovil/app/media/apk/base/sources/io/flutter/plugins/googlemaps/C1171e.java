package io.flutter.plugins.googlemaps;

import android.content.Context;
import p.C1608t;
import s3.C1786n;
import s3.C1787o;
/* renamed from: io.flutter.plugins.googlemaps.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171e extends T4.h {

    /* renamed from: t  reason: collision with root package name */
    public final C1173f f12127t;

    public C1171e(Context context, C1608t c1608t, R4.c cVar, C1173f c1173f) {
        super(context, c1608t, cVar);
        this.f12127t = c1173f;
    }

    @Override // T4.h
    public final void d(C1186t c1186t, C1787o c1787o) {
        C1787o c1787o2 = c1186t.f12275a;
        c1787o.f15637h0 = c1787o2.f15637h0;
        float f = c1787o2.f15633e;
        float f4 = c1787o2.f;
        c1787o.f15633e = f;
        c1787o.f = f4;
        c1787o.f15626X = c1787o2.f15626X;
        c1787o.f15628Z = c1787o2.f15628Z;
        c1787o.f15632d = c1787o2.f15632d;
        float f8 = c1787o2.f15635f0;
        float f9 = c1787o2.f15636g0;
        c1787o.f15635f0 = f8;
        c1787o.f15636g0 = f9;
        c1787o.f15630b = c1787o2.f15630b;
        c1787o.f15631c = c1787o2.f15631c;
        c1787o.k(c1787o2.f15629a);
        c1787o.f15634e0 = c1787o2.f15634e0;
        c1787o.f15627Y = c1787o2.f15627Y;
        c1787o.f15638i0 = c1787o2.f15638i0;
    }

    @Override // T4.h
    public final void e(C1186t c1186t, C1786n c1786n) {
        C1177j c1177j = this.f12127t.f12128X;
        if (c1177j != null) {
            C1189w c1189w = c1177j.f12204n0;
            c1189w.getClass();
            if (c1189w.f12293a.get(c1186t.f12277c) == c1186t) {
                boolean z7 = c1186t.f12278d;
                String str = c1186t.f12277c;
                c1189w.f12294b.put(str, new C1187u(c1786n, z7));
                c1189w.f12295c.put(c1786n.a(), str);
            }
        }
    }
}

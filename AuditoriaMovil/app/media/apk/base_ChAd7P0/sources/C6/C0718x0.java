package c6;

import a6.AbstractC0478g;
import a6.EnumC0477f;
import java.text.MessageFormat;
import java.util.logging.Level;
/* renamed from: c6.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718x0 extends AbstractC0478g {

    /* renamed from: d  reason: collision with root package name */
    public a6.H f9032d;

    @Override // a6.AbstractC0478g
    public final void l(EnumC0477f enumC0477f, String str) {
        a6.H h8 = this.f9032d;
        Level t7 = C0685m.t(enumC0477f);
        if (C0694p.f8949c.isLoggable(t7)) {
            C0694p.a(h8, t7, str);
        }
    }

    @Override // a6.AbstractC0478g
    public final void m(EnumC0477f enumC0477f, String str, Object... objArr) {
        a6.H h8 = this.f9032d;
        Level t7 = C0685m.t(enumC0477f);
        if (C0694p.f8949c.isLoggable(t7)) {
            C0694p.a(h8, t7, MessageFormat.format(str, objArr));
        }
    }
}

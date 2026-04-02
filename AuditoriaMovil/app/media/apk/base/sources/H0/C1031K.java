package h0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;
/* renamed from: h0.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1031K extends C1030J {
    public C1031K(C1036P c1036p, WindowInsets windowInsets) {
        super(c1036p, windowInsets);
    }

    @Override // h0.C1035O
    public C1036P a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f11163c.consumeDisplayCutout();
        return C1036P.c(null, consumeDisplayCutout);
    }

    @Override // h0.C1035O
    public C1044d e() {
        DisplayCutout displayCutout;
        displayCutout = this.f11163c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1044d(displayCutout);
    }

    @Override // h0.AbstractC1029I, h0.C1035O
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1031K)) {
            return false;
        }
        C1031K c1031k = (C1031K) obj;
        if (Objects.equals(this.f11163c, c1031k.f11163c) && Objects.equals(this.f11165e, c1031k.f11165e) && AbstractC1029I.r(this.f, c1031k.f)) {
            return true;
        }
        return false;
    }

    @Override // h0.C1035O
    public int hashCode() {
        return this.f11163c.hashCode();
    }
}

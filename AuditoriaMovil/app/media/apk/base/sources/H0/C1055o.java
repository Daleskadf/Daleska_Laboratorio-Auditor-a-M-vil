package h0;

import android.text.TextUtils;
import android.view.View;
/* renamed from: h0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055o extends AbstractC1057q {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f11204e;

    public C1055o(int i7, Class cls, int i8, int i9, int i10) {
        this.f11204e = i10;
        this.f11206a = i7;
        this.f11209d = cls;
        this.f11208c = i8;
        this.f11207b = i9;
    }

    @Override // h0.AbstractC1057q
    public final Object b(View view) {
        switch (this.f11204e) {
            case 0:
                return AbstractC1062v.a(view);
            default:
                return AbstractC1064x.b(view);
        }
    }

    @Override // h0.AbstractC1057q
    public final void c(View view, CharSequence charSequence) {
        switch (this.f11204e) {
            case 0:
                AbstractC1062v.d(view, charSequence);
                return;
            default:
                AbstractC1064x.c(view, charSequence);
                return;
        }
    }

    @Override // h0.AbstractC1057q
    public final boolean e(Object obj, CharSequence charSequence) {
        switch (this.f11204e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, charSequence);
            default:
                return !TextUtils.equals((CharSequence) obj, charSequence);
        }
    }
}

package W;

import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public C0372o f5991a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f5992b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f5993c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5994d = false;

    public void a(Bundle bundle) {
        if (this.f5994d) {
            bundle.putCharSequence("android.summaryText", this.f5993c);
        }
        CharSequence charSequence = this.f5992b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String c8 = c();
        if (c8 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c8);
        }
    }

    public abstract void b(B.a aVar);

    public String c() {
        return null;
    }

    public void g(Bundle bundle) {
        if (bundle.containsKey("android.summaryText")) {
            this.f5993c = bundle.getCharSequence("android.summaryText");
            this.f5994d = true;
        }
        this.f5992b = bundle.getCharSequence("android.title.big");
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }
}

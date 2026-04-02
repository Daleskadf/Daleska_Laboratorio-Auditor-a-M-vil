package X5;

import D.AbstractC0055e;
import android.webkit.ValueCallback;
/* renamed from: X5.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0387m implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k f6514b;

    public /* synthetic */ C0387m(kotlin.jvm.internal.k kVar, int i7) {
        this.f6513a = i7;
        this.f6514b = kVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f6513a) {
            case 0:
                Boolean bool = (Boolean) obj;
                D d7 = (D) this.f6514b;
                kotlin.jvm.internal.u.b(1, d7);
                Throwable a7 = l6.f.a(bool);
                A.f fVar = d7.f6407b;
                if (a7 != null) {
                    fVar.h(AbstractC0055e.E(a7));
                    return;
                } else {
                    fVar.h(G.i.A(bool));
                    return;
                }
            default:
                String str = (String) obj;
                D d8 = (D) this.f6514b;
                kotlin.jvm.internal.u.b(1, d8);
                Throwable a8 = l6.f.a(str);
                A.f fVar2 = d8.f6407b;
                if (a8 != null) {
                    fVar2.h(AbstractC0055e.E(a8));
                    return;
                } else {
                    fVar2.h(G.i.A(str));
                    return;
                }
        }
    }
}

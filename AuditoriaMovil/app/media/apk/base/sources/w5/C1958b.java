package w5;

import C5.d;
import F3.o;
import L5.r;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import p.C1608t;
/* renamed from: w5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1958b implements H5.b, I5.a {

    /* renamed from: a  reason: collision with root package name */
    public o f16369a;

    /* renamed from: b  reason: collision with root package name */
    public c f16370b;

    /* renamed from: c  reason: collision with root package name */
    public r f16371c;

    @Override // I5.a
    public final void onAttachedToActivity(I5.b binding) {
        j.e(binding, "binding");
        c cVar = this.f16370b;
        if (cVar != null) {
            d dVar = (d) binding;
            dVar.a(cVar);
            o oVar = this.f16369a;
            if (oVar != null) {
                oVar.f1179c = dVar.f571a;
                return;
            } else {
                j.g("share");
                throw null;
            }
        }
        j.g("manager");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w5.c, java.lang.Object] */
    @Override // H5.b
    public final void onAttachedToEngine(H5.a binding) {
        j.e(binding, "binding");
        this.f16371c = new r(binding.f2030b, "dev.fluttercommunity.plus/share");
        Context context = binding.f2029a;
        j.d(context, "binding.applicationContext");
        ?? obj = new Object();
        obj.f16373b = new AtomicBoolean(true);
        this.f16370b = obj;
        o oVar = new o(context, obj);
        this.f16369a = oVar;
        c cVar = this.f16370b;
        if (cVar != null) {
            C1608t c1608t = new C1608t(oVar, cVar);
            r rVar = this.f16371c;
            if (rVar != null) {
                rVar.b(c1608t);
                return;
            } else {
                j.g("methodChannel");
                throw null;
            }
        }
        j.g("manager");
        throw null;
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        o oVar = this.f16369a;
        if (oVar != null) {
            oVar.f1179c = null;
        } else {
            j.g("share");
            throw null;
        }
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a binding) {
        j.e(binding, "binding");
        r rVar = this.f16371c;
        if (rVar != null) {
            rVar.b(null);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b binding) {
        j.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}

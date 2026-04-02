package w;

import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.w0;
import androidx.camera.core.impl.y0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* renamed from: w.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1929n implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ ArrayList f16245X;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1936u f16247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16248c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o0 f16249d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y0 f16250e;
    public final /* synthetic */ C0505g f;

    public /* synthetic */ RunnableC1929n(C1936u c1936u, String str, o0 o0Var, y0 y0Var, C0505g c0505g, ArrayList arrayList, int i7) {
        this.f16246a = i7;
        this.f16247b = c1936u;
        this.f16248c = str;
        this.f16249d = o0Var;
        this.f16250e = y0Var;
        this.f = c0505g;
        this.f16245X = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16246a) {
            case 0:
                C1936u c1936u = this.f16247b;
                c1936u.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = this.f16248c;
                sb.append(str);
                sb.append(" UPDATED");
                c1936u.t(sb.toString(), null);
                c1936u.f16273a.Y(str, this.f16249d, this.f16250e, this.f, this.f16245X);
                c1936u.K();
                return;
            default:
                C1936u c1936u2 = this.f16247b;
                c1936u2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str2 = this.f16248c;
                sb2.append(str2);
                sb2.append(" ACTIVE");
                c1936u2.t(sb2.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c1936u2.f16273a.f7210c;
                w0 w0Var = (w0) linkedHashMap.get(str2);
                o0 o0Var = this.f16249d;
                y0 y0Var = this.f16250e;
                C0505g c0505g = this.f;
                ArrayList arrayList = this.f16245X;
                if (w0Var == null) {
                    w0Var = new w0(o0Var, y0Var, c0505g, arrayList);
                    linkedHashMap.put(str2, w0Var);
                }
                w0Var.f = true;
                c1936u2.f16273a.Y(str2, o0Var, y0Var, c0505g, arrayList);
                c1936u2.K();
                return;
        }
    }
}

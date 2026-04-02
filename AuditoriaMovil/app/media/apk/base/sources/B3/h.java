package b3;

import B5.M;
import a3.C0445a;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zav;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a  reason: collision with root package name */
    public static final com.google.android.gms.common.api.i f8174a = new com.google.android.gms.common.api.i("ModuleInstall.API", new O2.g(6), new Object());

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, a1.A] */
    public final Task c(p... pVarArr) {
        boolean z7;
        if (pVarArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("Please provide at least one OptionalModuleApi.", z7);
        for (p pVar : pVarArr) {
            I.j(pVar, "Requested API must not be null.");
        }
        C0580a k2 = C0580a.k(Arrays.asList(pVarArr), false);
        if (k2.f8165a.isEmpty()) {
            return Tasks.forResult(new C0445a(0, true));
        }
        M a7 = AbstractC0751z.a();
        a7.f331d = new W2.d[]{zav.zaa};
        a7.f329b = 27301;
        a7.f328a = false;
        ?? obj = new Object();
        obj.f6744a = k2;
        a7.f330c = obj;
        return doRead(a7.a());
    }
}

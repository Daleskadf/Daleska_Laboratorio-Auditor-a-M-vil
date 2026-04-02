package t2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e0.C0927b;
import k5.C1401d;
/* renamed from: t2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1810a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15715b;

    public /* synthetic */ C1810a(Object obj, int i7) {
        this.f15714a = i7;
        this.f15715b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task it) {
        boolean z7;
        boolean z8;
        switch (this.f15714a) {
            case 0:
                boolean isSuccessful = it.isSuccessful();
                C0927b c0927b = (C0927b) this.f15715b;
                if (!isSuccessful) {
                    s2.b bVar = s2.b.locationServicesDisabled;
                    ((K5.r) c0927b.f10587a).b(null, bVar.toString(), bVar.a());
                }
                p3.q qVar = (p3.q) it.getResult();
                if (qVar != null) {
                    p3.s sVar = qVar.f15127a.f15129b;
                    boolean z9 = false;
                    if (sVar != null && sVar.f15130a) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (sVar != null && sVar.f15131b) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z7 || z8) {
                        z9 = true;
                    }
                    ((K5.r) c0927b.f10587a).a(Boolean.valueOf(z9));
                    return;
                }
                s2.b bVar2 = s2.b.locationServicesDisabled;
                ((K5.r) c0927b.f10587a).b(null, bVar2.toString(), bVar2.a());
                return;
            default:
                kotlin.jvm.internal.j.e(it, "it");
                ((C1401d) this.f15715b).close();
                return;
        }
    }
}

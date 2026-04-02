package O6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import w6.l;
/* loaded from: classes.dex */
public final class b extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3868b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i7) {
        super(1);
        this.f3867a = i7;
        this.f3868b = dVar;
        this.f3869c = cVar;
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        switch (this.f3867a) {
            case 0:
                Throwable th = (Throwable) obj;
                this.f3869c.getClass();
                this.f3868b.e(null);
                return l6.j.f13876a;
            default:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f3872g;
                this.f3869c.getClass();
                d dVar = this.f3868b;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return l6.j.f13876a;
        }
    }
}

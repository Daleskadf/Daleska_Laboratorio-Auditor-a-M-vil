package L4;

import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
/* loaded from: classes.dex */
public final class G implements I4.H {

    /* renamed from: a  reason: collision with root package name */
    public final P4.a f2926a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2927b;

    /* renamed from: c  reason: collision with root package name */
    public final I4.p f2928c;

    public G(ScheduleMode.a aVar, P4.a aVar2, boolean z7) {
        this.f2928c = aVar;
        this.f2926a = aVar2;
        this.f2927b = z7;
    }

    @Override // I4.H
    public final I4.G create(I4.n nVar, P4.a aVar) {
        P4.a aVar2 = this.f2926a;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar)) {
                if (!this.f2927b) {
                    return null;
                }
                if (aVar2.f4023b != aVar.f4022a) {
                    return null;
                }
            }
            return new H(this.f2928c, nVar, aVar, this, true);
        }
        Class cls = aVar.f4022a;
        throw null;
    }
}

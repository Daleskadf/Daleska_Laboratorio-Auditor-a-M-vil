package V2;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.p001authapi.zbc;
/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, int i7) {
        super(oVar);
        this.f5961a = i7;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        int i7 = this.f5961a;
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f5961a) {
            case 0:
                e eVar = (e) bVar;
                m mVar = (m) eVar.getService();
                f fVar = new f(this, 1);
                Parcel zba = mVar.zba();
                zbc.zbd(zba, fVar);
                zbc.zbc(zba, eVar.f5956a);
                mVar.zbb(102, zba);
                return;
            default:
                e eVar2 = (e) bVar;
                m mVar2 = (m) eVar2.getService();
                f fVar2 = new f(this, 2);
                Parcel zba2 = mVar2.zba();
                zbc.zbd(zba2, fVar2);
                zbc.zbc(zba2, eVar2.f5956a);
                mVar2.zbb(103, zba2);
                return;
        }
    }
}

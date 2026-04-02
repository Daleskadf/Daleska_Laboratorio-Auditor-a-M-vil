package V2;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import com.google.android.gms.internal.p001authapi.zbc;
/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f5959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GoogleSignInOptions f5960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(oVar);
        this.f5959a = context;
        this.f5960b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new U2.c(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0731e
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        m mVar = (m) ((e) bVar).getService();
        f fVar = new f(this, 0);
        Parcel zba = mVar.zba();
        zbc.zbd(zba, fVar);
        zbc.zbc(zba, this.f5960b);
        mVar.zbb(101, zba);
    }
}

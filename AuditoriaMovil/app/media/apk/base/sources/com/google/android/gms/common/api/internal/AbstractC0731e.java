package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.common.api.internal.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0731e extends BasePendingResult implements InterfaceC0732f {
    private final com.google.android.gms.common.api.i api;
    private final com.google.android.gms.common.api.c clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0731e(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        com.google.android.gms.common.internal.I.j(oVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.I.j(iVar, "Api must not be null");
        this.clientKey = iVar.f9159b;
        this.api = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.api;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.t tVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e7) {
            setFailedResult(new Status(8, e7.getLocalizedMessage(), null, null));
            throw e7;
        } catch (RemoteException e8) {
            setFailedResult(new Status(8, e8.getLocalizedMessage(), null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0732f
    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.I.a("Failed result must not be success", !status.k());
        com.google.android.gms.common.api.t createFailedResult = createFailedResult(status);
        setResult((AbstractC0731e) createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}

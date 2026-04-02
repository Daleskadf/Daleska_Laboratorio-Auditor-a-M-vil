package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bf extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f9530a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f9532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f9532c = bnVar;
        this.f9530a = j;
        this.f9531b = taskCompletionSource2;
    }

    @Override // w3.z
    public final void b() {
        w3.y yVar;
        if (!bn.k(this.f9532c)) {
            try {
                bn bnVar = this.f9532c;
                Bundle b5 = bn.b(bnVar, this.f9530a, 0);
                bl blVar = new bl(this.f9532c, this.f9531b);
                w3.m mVar = (w3.m) ((w3.o) bnVar.f9551a.f16356n);
                mVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(mVar.f16339b);
                int i7 = w3.k.f16361a;
                obtain.writeInt(1);
                b5.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(blVar);
                mVar.b(2, obtain);
                return;
            } catch (RemoteException e7) {
                bn bnVar2 = this.f9532c;
                long j = this.f9530a;
                yVar = bnVar2.f9552b;
                yVar.a(e7, "warmUpIntegrityToken(%s)", Long.valueOf(j));
                this.f9531b.trySetException(new StandardIntegrityException(-100, e7));
                return;
            }
        }
        a(new StandardIntegrityException(-2, null));
    }
}

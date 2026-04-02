package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bg extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f9533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f9534b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f9535c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9536d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ bn f9537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i7, String str, long j, long j8, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f9537e = bnVar;
        this.f9533a = str;
        this.f9534b = j;
        this.f9535c = j8;
        this.f9536d = taskCompletionSource2;
    }

    @Override // w3.z
    public final void b() {
        w3.y yVar;
        if (!bn.k(this.f9537e)) {
            try {
                bn bnVar = this.f9537e;
                Bundle a7 = bn.a(bnVar, this.f9533a, this.f9534b, this.f9535c, 0);
                bk bkVar = new bk(this.f9537e, this.f9536d, this.f9534b);
                w3.m mVar = (w3.m) ((w3.o) bnVar.f9551a.f16356n);
                mVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(mVar.f16339b);
                int i7 = w3.k.f16361a;
                obtain.writeInt(1);
                a7.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(bkVar);
                mVar.b(3, obtain);
                return;
            } catch (RemoteException e7) {
                bn bnVar2 = this.f9537e;
                String str = this.f9533a;
                yVar = bnVar2.f9552b;
                yVar.a(e7, "requestExpressIntegrityToken(%s, %s)", str, Long.valueOf(this.f9534b));
                this.f9536d.trySetException(new StandardIntegrityException(-100, e7));
                return;
            }
        }
        a(new StandardIntegrityException(-2, null));
    }
}

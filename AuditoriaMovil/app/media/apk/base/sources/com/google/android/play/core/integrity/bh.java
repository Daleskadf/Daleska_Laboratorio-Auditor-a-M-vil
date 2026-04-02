package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bh extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f9538a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f9539b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9540c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f9541d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ bn f9542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(bnVar, taskCompletionSource);
        this.f9542e = bnVar;
        this.f9538a = bundle;
        this.f9539b = activity;
        this.f9540c = taskCompletionSource2;
        this.f9541d = i7;
    }

    @Override // w3.z
    public final void b() {
        w3.y yVar;
        at atVar;
        if (bn.k(this.f9542e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f9542e;
            w3.d dVar = bnVar.f9551a;
            Bundle bundle = this.f9538a;
            atVar = bnVar.f9555e;
            as a7 = atVar.a(this.f9539b, this.f9540c, dVar);
            w3.m mVar = (w3.m) ((w3.o) dVar.f16356n);
            mVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(mVar.f16339b);
            int i7 = w3.k.f16361a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a7);
            mVar.b(6, obtain);
        } catch (RemoteException e7) {
            bn bnVar2 = this.f9542e;
            int i8 = this.f9541d;
            yVar = bnVar2.f9552b;
            yVar.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(i8));
            this.f9540c.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}

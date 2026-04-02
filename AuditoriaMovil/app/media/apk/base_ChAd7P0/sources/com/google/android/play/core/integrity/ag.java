package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ag extends w3.z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f9481a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f9482b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9483c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f9484d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ aj f9485e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f9485e = ajVar;
        this.f9481a = bundle;
        this.f9482b = activity;
        this.f9483c = taskCompletionSource2;
        this.f9484d = i7;
    }

    @Override // w3.z
    public final void b() {
        w3.y yVar;
        at atVar;
        try {
            aj ajVar = this.f9485e;
            Bundle bundle = this.f9481a;
            atVar = ajVar.f9493d;
            as a7 = atVar.a(this.f9482b, this.f9483c, ajVar.f9490a);
            w3.r rVar = (w3.r) ((w3.t) ajVar.f9490a.f16356n);
            rVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(rVar.f16339b);
            int i7 = w3.k.f16361a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a7);
            rVar.b(3, obtain);
        } catch (RemoteException e7) {
            aj ajVar2 = this.f9485e;
            int i8 = this.f9484d;
            yVar = ajVar2.f9491b;
            yVar.a(e7, "requestAndShowDialog(%s)", Integer.valueOf(i8));
            this.f9483c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}

package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class af extends w3.z {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f9476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f9477b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f9478c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f9479d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ aj f9480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l8, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f9480e = ajVar;
        this.f9476a = bArr;
        this.f9477b = l8;
        this.f9478c = taskCompletionSource2;
        this.f9479d = integrityTokenRequest;
    }

    @Override // w3.z
    public final void a(Exception exc) {
        if (exc instanceof w3.e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // w3.z
    public final void b() {
        w3.y yVar;
        try {
            aj ajVar = this.f9480e;
            Bundle a7 = aj.a(ajVar, this.f9476a, this.f9477b, null);
            ai aiVar = new ai(this.f9480e, this.f9478c);
            w3.r rVar = (w3.r) ((w3.t) ajVar.f9490a.f16356n);
            rVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(rVar.f16339b);
            int i7 = w3.k.f16361a;
            obtain.writeInt(1);
            a7.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            rVar.b(2, obtain);
        } catch (RemoteException e7) {
            aj ajVar2 = this.f9480e;
            IntegrityTokenRequest integrityTokenRequest = this.f9479d;
            yVar = ajVar2.f9491b;
            yVar.a(e7, "requestIntegrityToken(%s)", integrityTokenRequest);
            this.f9478c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}

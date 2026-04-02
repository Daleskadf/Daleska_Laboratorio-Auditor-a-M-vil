package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
/* loaded from: classes.dex */
public final class M extends F {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f9321g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ AbstractC0757f f9322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC0757f abstractC0757f, int i7, IBinder iBinder, Bundle bundle) {
        super(abstractC0757f, i7, bundle);
        this.f9322h = abstractC0757f;
        this.f9321g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.F
    public final void a(W2.b bVar) {
        InterfaceC0754c interfaceC0754c;
        InterfaceC0754c interfaceC0754c2;
        AbstractC0757f abstractC0757f = this.f9322h;
        interfaceC0754c = abstractC0757f.zzx;
        if (interfaceC0754c != null) {
            interfaceC0754c2 = abstractC0757f.zzx;
            ((com.google.android.gms.common.api.internal.r) ((C0772v) interfaceC0754c2).f9399a).b(bVar);
        }
        abstractC0757f.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.F
    public final boolean b() {
        InterfaceC0753b interfaceC0753b;
        InterfaceC0753b interfaceC0753b2;
        IBinder iBinder = this.f9321g;
        try {
            I.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC0757f abstractC0757f = this.f9322h;
            if (!abstractC0757f.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC0757f.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = abstractC0757f.createServiceInterface(iBinder);
            if (createServiceInterface != null && (AbstractC0757f.zzn(abstractC0757f, 2, 4, createServiceInterface) || AbstractC0757f.zzn(abstractC0757f, 3, 4, createServiceInterface))) {
                abstractC0757f.zzB = null;
                abstractC0757f.getConnectionHint();
                interfaceC0753b = abstractC0757f.zzw;
                if (interfaceC0753b != null) {
                    interfaceC0753b2 = abstractC0757f.zzw;
                    ((InterfaceC0734h) ((C0772v) interfaceC0753b2).f9399a).e();
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}

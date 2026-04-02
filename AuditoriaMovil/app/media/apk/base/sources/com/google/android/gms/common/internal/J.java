package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.internal.common.zzi;
/* loaded from: classes.dex */
public final class J extends zzi {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0757f f9316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(AbstractC0757f abstractC0757f, Looper looper) {
        super(looper);
        this.f9316a = abstractC0757f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        InterfaceC0753b interfaceC0753b;
        InterfaceC0753b interfaceC0753b2;
        W2.b bVar;
        W2.b bVar2;
        W2.b bVar3;
        W2.b bVar4;
        boolean z7;
        if (this.f9316a.zzd.get() != message.arg1) {
            int i7 = message.what;
            if (i7 != 2 && i7 != 1 && i7 != 7) {
                return;
            }
            F f = (F) message.obj;
            f.getClass();
            f.d();
            return;
        }
        int i8 = message.what;
        if ((i8 != 1 && i8 != 7 && ((i8 != 4 || this.f9316a.enableLocalFallback()) && message.what != 5)) || this.f9316a.isConnecting()) {
            int i9 = message.what;
            PendingIntent pendingIntent = null;
            if (i9 == 4) {
                this.f9316a.zzB = new W2.b(message.arg2);
                if (AbstractC0757f.zzo(this.f9316a)) {
                    AbstractC0757f abstractC0757f = this.f9316a;
                    z7 = abstractC0757f.zzC;
                    if (!z7) {
                        abstractC0757f.a(3, null);
                        return;
                    }
                }
                AbstractC0757f abstractC0757f2 = this.f9316a;
                bVar3 = abstractC0757f2.zzB;
                if (bVar3 != null) {
                    bVar4 = abstractC0757f2.zzB;
                } else {
                    bVar4 = new W2.b(8);
                }
                this.f9316a.zzc.a(bVar4);
                this.f9316a.onConnectionFailed(bVar4);
                return;
            } else if (i9 == 5) {
                AbstractC0757f abstractC0757f3 = this.f9316a;
                bVar = abstractC0757f3.zzB;
                if (bVar != null) {
                    bVar2 = abstractC0757f3.zzB;
                } else {
                    bVar2 = new W2.b(8);
                }
                this.f9316a.zzc.a(bVar2);
                this.f9316a.onConnectionFailed(bVar2);
                return;
            } else if (i9 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                W2.b bVar5 = new W2.b(message.arg2, pendingIntent);
                this.f9316a.zzc.a(bVar5);
                this.f9316a.onConnectionFailed(bVar5);
                return;
            } else if (i9 == 6) {
                this.f9316a.a(5, null);
                AbstractC0757f abstractC0757f4 = this.f9316a;
                interfaceC0753b = abstractC0757f4.zzw;
                if (interfaceC0753b != null) {
                    interfaceC0753b2 = abstractC0757f4.zzw;
                    ((InterfaceC0734h) ((C0772v) interfaceC0753b2).f9399a).c(message.arg2);
                }
                this.f9316a.onConnectionSuspended(message.arg2);
                AbstractC0757f.zzn(this.f9316a, 5, 1, null);
                return;
            } else if (i9 == 2 && !this.f9316a.isConnected()) {
                F f4 = (F) message.obj;
                f4.getClass();
                f4.d();
                return;
            } else {
                int i10 = message.what;
                if (i10 != 2 && i10 != 1 && i10 != 7) {
                    Log.wtf("GmsClient", io.flutter.plugins.pathprovider.b.e(i10, "Don't know how to handle message: "), new Exception());
                    return;
                }
                F f8 = (F) message.obj;
                synchronized (f8) {
                    try {
                        bool = f8.f9307a;
                        if (f8.f9308b) {
                            String obj2 = f8.toString();
                            Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bool != null) {
                    AbstractC0757f abstractC0757f5 = f8.f;
                    int i11 = f8.f9310d;
                    if (i11 == 0) {
                        if (!f8.b()) {
                            abstractC0757f5.a(1, null);
                            f8.a(new W2.b(8, null));
                        }
                    } else {
                        abstractC0757f5.a(1, null);
                        Bundle bundle = f8.f9311e;
                        if (bundle != null) {
                            pendingIntent = (PendingIntent) bundle.getParcelable(AbstractC0757f.KEY_PENDING_INTENT);
                        }
                        f8.a(new W2.b(i11, pendingIntent));
                    }
                }
                synchronized (f8) {
                    f8.f9308b = true;
                }
                f8.d();
                return;
            }
        }
        F f9 = (F) message.obj;
        f9.getClass();
        f9.d();
    }
}

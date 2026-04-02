package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import b4.C0612u;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractBinderC0752a;
import com.google.android.gms.common.internal.InterfaceC0766o;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zza;
import java.util.Set;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9237a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f9238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9239c;

    public /* synthetic */ d0(int i7, Object obj, Object obj2) {
        this.f9237a = i7;
        this.f9239c = obj;
        this.f9238b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29, types: [com.google.android.gms.internal.common.zza] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        InterfaceC0766o interfaceC0766o;
        Set set;
        InterfaceC0766o interfaceC0766o2;
        InterfaceC0766o interfaceC0766o3 = null;
        boolean z8 = false;
        switch (this.f9237a) {
            case 0:
                if (((E) this.f9239c).f9168a) {
                    W2.b bVar = ((c0) this.f9238b).f9231b;
                    if (bVar.f6160b != 0 && bVar.f6161c != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        E e7 = (E) this.f9239c;
                        InterfaceC0739m interfaceC0739m = e7.mLifecycleFragment;
                        Activity activity = e7.getActivity();
                        PendingIntent pendingIntent = bVar.f6161c;
                        com.google.android.gms.common.internal.I.i(pendingIntent);
                        int i7 = ((c0) this.f9238b).f9230a;
                        int i8 = GoogleApiActivity.f9145b;
                        Intent intent = new Intent(activity, GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i7);
                        intent.putExtra("notify_manager", false);
                        interfaceC0739m.startActivityForResult(intent, 1);
                        return;
                    }
                    E e8 = (E) this.f9239c;
                    if (e8.f9171d.b(bVar.f6160b, e8.getActivity(), null) != null) {
                        E e9 = (E) this.f9239c;
                        e9.f9171d.i(e9.getActivity(), e9.mLifecycleFragment, bVar.f6160b, (E) this.f9239c);
                        return;
                    } else if (bVar.f6160b == 18) {
                        E e10 = (E) this.f9239c;
                        W2.e eVar = e10.f9171d;
                        Activity activity2 = e10.getActivity();
                        eVar.getClass();
                        ProgressBar progressBar = new ProgressBar(activity2, null, 16842874);
                        progressBar.setIndeterminate(true);
                        progressBar.setVisibility(0);
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                        builder.setView(progressBar);
                        builder.setMessage(com.google.android.gms.common.internal.A.c(activity2, 18));
                        builder.setPositiveButton(StringUtils.EMPTY, (DialogInterface.OnClickListener) null);
                        AlertDialog create = builder.create();
                        W2.e.g(activity2, create, "GooglePlayServicesUpdatingDialog", e10);
                        E e11 = (E) this.f9239c;
                        Context applicationContext = e11.getActivity().getApplicationContext();
                        D d7 = new D(this, create);
                        e11.f9171d.getClass();
                        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addDataScheme("package");
                        C0612u c0612u = new C0612u(d7);
                        zao.zaa(applicationContext, c0612u, intentFilter);
                        c0612u.f8297b = applicationContext;
                        if (!W2.i.c(applicationContext)) {
                            E e12 = (E) this.f9239c;
                            e12.f9169b.set(null);
                            zau zauVar = e12.f.f9264i0;
                            zauVar.sendMessage(zauVar.obtainMessage(3));
                            if (create.isShowing()) {
                                create.dismiss();
                            }
                            synchronized (c0612u) {
                                try {
                                    Context context = (Context) c0612u.f8297b;
                                    if (context != null) {
                                        context.unregisterReceiver(c0612u);
                                    }
                                    c0612u.f8297b = null;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        E e13 = (E) this.f9239c;
                        int i9 = ((c0) this.f9238b).f9230a;
                        e13.f9169b.set(null);
                        e13.f.j(bVar, i9);
                        return;
                    }
                }
                return;
            case 1:
                Q0.A a7 = (Q0.A) this.f9239c;
                G g3 = (G) ((C0735i) a7.f4140g).f9260e0.get((C0728b) a7.f4138d);
                if (g3 != null) {
                    W2.b bVar2 = (W2.b) this.f9238b;
                    if (bVar2.f6160b == 0) {
                        z8 = true;
                    }
                    if (z8) {
                        a7.f4136b = true;
                        com.google.android.gms.common.api.g gVar = (com.google.android.gms.common.api.g) a7.f4137c;
                        if (gVar.requiresSignIn()) {
                            if (a7.f4136b && (interfaceC0766o = (InterfaceC0766o) a7.f4139e) != null) {
                                gVar.getRemoteService(interfaceC0766o, (Set) a7.f);
                                return;
                            }
                            return;
                        }
                        try {
                            gVar.getRemoteService(null, gVar.getScopesForConnectionlessNonSignIn());
                            return;
                        } catch (SecurityException e14) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e14);
                            gVar.disconnect("Failed to get service from broker.");
                            g3.p(new W2.b(10), null);
                            return;
                        }
                    }
                    g3.p(bVar2, null);
                    return;
                }
                return;
            case 2:
                InterfaceC0741o interfaceC0741o = (InterfaceC0741o) this.f9239c;
                Object obj = ((C0742p) this.f9238b).f9270b;
                if (obj == null) {
                    interfaceC0741o.onNotifyListenerFailed();
                    return;
                }
                try {
                    interfaceC0741o.notifyListener(obj);
                    return;
                } catch (RuntimeException e15) {
                    interfaceC0741o.onNotifyListenerFailed();
                    throw e15;
                }
            default:
                v3.g gVar2 = (v3.g) this.f9238b;
                W2.b bVar3 = gVar2.f16052b;
                if (bVar3.f6160b == 0) {
                    z8 = true;
                }
                T t7 = (T) this.f9239c;
                if (z8) {
                    com.google.android.gms.common.internal.E e16 = gVar2.f16053c;
                    com.google.android.gms.common.internal.I.i(e16);
                    W2.b bVar4 = e16.f9304c;
                    if (bVar4.f6160b == 0) {
                        Q0.A a8 = t7.f9212i;
                        IBinder iBinder = e16.f9303b;
                        if (iBinder != null) {
                            int i10 = AbstractBinderC0752a.f9348a;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof InterfaceC0766o) {
                                interfaceC0766o2 = (InterfaceC0766o) queryLocalInterface;
                            } else {
                                interfaceC0766o2 = new zza(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                            }
                            interfaceC0766o3 = interfaceC0766o2;
                        }
                        a8.getClass();
                        if (interfaceC0766o3 != null && (set = t7.f9210d) != null) {
                            a8.f4139e = interfaceC0766o3;
                            a8.f = set;
                            if (a8.f4136b) {
                                ((com.google.android.gms.common.api.g) a8.f4137c).getRemoteService(interfaceC0766o3, set);
                            }
                        } else {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            a8.j(new W2.b(4));
                        }
                    } else {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar4)), new Exception());
                        t7.f9212i.j(bVar4);
                        t7.f.disconnect();
                        return;
                    }
                } else {
                    t7.f9212i.j(bVar3);
                }
                t7.f.disconnect();
                return;
        }
    }

    public /* synthetic */ d0(C0742p c0742p, InterfaceC0741o interfaceC0741o) {
        this.f9237a = 2;
        this.f9238b = c0742p;
        this.f9239c = interfaceC0741o;
    }
}

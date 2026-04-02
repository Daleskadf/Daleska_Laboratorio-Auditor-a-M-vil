package b4;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import h3.AbstractC1079a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* renamed from: b4.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612u extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8296a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f8297b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8298c;

    public C0612u(A.l lVar, Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f8297b = new WeakReference(activity);
        this.f8298c = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        X2.b bVar = null;
        switch (this.f8296a) {
            case 0:
                Activity activity = (Activity) ((WeakReference) this.f8297b).get();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8298c;
                if (activity == null) {
                    Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
                    taskCompletionSource.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
                    A.l.r(context);
                    return;
                } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
                    String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
                    if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                        taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                        A.l.r(context);
                        return;
                    }
                    taskCompletionSource.setException(zzadr.zza(AbstractC1079a.y("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                    return;
                } else {
                    HashMap hashMap = I.f8198a;
                    if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
                        com.google.android.gms.common.internal.I.c(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
                        Parcelable.Creator<Status> creator = Status.CREATOR;
                        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.auth.internal.STATUS");
                        if (byteArrayExtra != null) {
                            bVar = org.slf4j.helpers.i.r(byteArrayExtra, creator);
                        }
                        taskCompletionSource.setException(zzadr.zza((Status) bVar));
                        A.l.r(context);
                        return;
                    } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                        taskCompletionSource.setException(zzadr.zza(AbstractC1079a.y("WEB_CONTEXT_CANCELED")));
                        A.l.r(context);
                        return;
                    } else {
                        return;
                    }
                }
            case 1:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if ("com.google.android.gms".equals(str)) {
                    com.google.android.gms.common.api.internal.D d7 = (com.google.android.gms.common.api.internal.D) this.f8298c;
                    com.google.android.gms.common.api.internal.E e7 = (com.google.android.gms.common.api.internal.E) ((d0) d7.f9167b).f9239c;
                    e7.f9169b.set(null);
                    zau zauVar = e7.f.f9264i0;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) d7.f9166a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = (Context) this.f8297b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f8297b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            default:
                if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
                    LocationManager locationManager = (LocationManager) context.getSystemService("location");
                    boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
                    boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
                    L5.h hVar = (L5.h) this.f8297b;
                    if (!isProviderEnabled && !isProviderEnabled2) {
                        t2.t tVar = (t2.t) this.f8298c;
                        if (tVar == null || tVar == t2.t.enabled) {
                            t2.t tVar2 = t2.t.disabled;
                            this.f8298c = tVar2;
                            hVar.c(Integer.valueOf(tVar2.ordinal()));
                            return;
                        }
                        return;
                    }
                    t2.t tVar3 = (t2.t) this.f8298c;
                    if (tVar3 == null || tVar3 == t2.t.disabled) {
                        t2.t tVar4 = t2.t.enabled;
                        this.f8298c = tVar4;
                        hVar.c(Integer.valueOf(tVar4.ordinal()));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public C0612u(com.google.android.gms.common.api.internal.D d7) {
        this.f8298c = d7;
    }

    public C0612u(L5.h hVar) {
        this.f8297b = hVar;
    }
}

package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import w3.AbstractC1952a;
import w3.C;
/* loaded from: classes.dex */
final class aj {

    /* renamed from: a  reason: collision with root package name */
    final w3.d f9490a;

    /* renamed from: b  reason: collision with root package name */
    private final w3.y f9491b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9492c;

    /* renamed from: d  reason: collision with root package name */
    private final at f9493d;

    /* renamed from: e  reason: collision with root package name */
    private final k f9494e;

    public aj(Context context, w3.y yVar, at atVar, k kVar) {
        this.f9492c = context.getPackageName();
        this.f9491b = yVar;
        this.f9493d = atVar;
        this.f9494e = kVar;
        w3.y yVar2 = w3.f.f16357a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (w3.f.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f9490a = new w3.d(context, yVar, "IntegrityService", ak.f9495a, new C() { // from class: com.google.android.play.core.integrity.ae
                        @Override // w3.C
                        public final Object a(IBinder iBinder) {
                            int i7 = w3.s.f16365i;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            if (queryLocalInterface instanceof w3.t) {
                                return (w3.t) queryLocalInterface;
                            }
                            return new AbstractC1952a(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        yVar.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", w3.y.c(yVar.f16366a, "Phonesky is not installed.", objArr));
        }
        this.f9490a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l8, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f9492c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l8 != null) {
            bundle.putLong("cloud.prj", l8.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w3.l(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(F.f.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f9490a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f9491b.b("requestAndShowDialog(%s, %s)", this.f9492c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9490a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f9490a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
                ao aoVar = (ao) integrityTokenRequest;
            }
            this.f9491b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f9490a.c(new af(this, taskCompletionSource, decode, cloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e7) {
            return Tasks.forException(new IntegrityServiceException(-13, e7));
        }
    }
}

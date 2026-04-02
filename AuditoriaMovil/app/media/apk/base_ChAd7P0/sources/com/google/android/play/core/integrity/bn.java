package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import w3.AbstractC1952a;
import w3.C;
/* loaded from: classes.dex */
final class bn {

    /* renamed from: a  reason: collision with root package name */
    final w3.d f9551a;

    /* renamed from: b  reason: collision with root package name */
    private final w3.y f9552b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9553c;

    /* renamed from: d  reason: collision with root package name */
    private final TaskCompletionSource f9554d;

    /* renamed from: e  reason: collision with root package name */
    private final at f9555e;
    private final k f;

    public bn(Context context, w3.y yVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9554d = taskCompletionSource;
        this.f9553c = context.getPackageName();
        this.f9552b = yVar;
        this.f9555e = atVar;
        this.f = kVar;
        w3.d dVar = new w3.d(context, yVar, "ExpressIntegrityService", bo.f9556a, new C() { // from class: com.google.android.play.core.integrity.bd
            @Override // w3.C
            public final Object a(IBinder iBinder) {
                int i7 = w3.n.f16364i;
                if (iBinder == null) {
                    return null;
                }
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
                if (queryLocalInterface instanceof w3.o) {
                    return (w3.o) queryLocalInterface;
                }
                return new AbstractC1952a(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            }
        });
        this.f9551a = dVar;
        dVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j, long j8, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f9553c);
        bundle.putLong("cloud.prj", j);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j8);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w3.l(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(F.f.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f9553c);
        bundle.putLong("cloud.prj", j);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w3.l(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(F.f.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        if (bnVar.f9554d.getTask().isSuccessful() && ((Integer) bnVar.f9554d.getTask().getResult()).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f9552b.b("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9551a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j, long j8, int i7) {
        this.f9552b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j8));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9551a.c(new bg(this, taskCompletionSource, 0, str, j, j8, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j, int i7) {
        this.f9552b.b("warmUpIntegrityToken(%s)", Long.valueOf(j));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f9551a.c(new bf(this, taskCompletionSource, 0, j, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}

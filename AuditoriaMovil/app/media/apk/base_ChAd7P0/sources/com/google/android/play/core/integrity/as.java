package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
/* loaded from: classes.dex */
final class as extends w3.w {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource f9508a;

    /* renamed from: b  reason: collision with root package name */
    final w3.d f9509b;

    /* renamed from: c  reason: collision with root package name */
    private final w3.y f9510c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9511d;

    /* renamed from: e  reason: collision with root package name */
    private final k f9512e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, w3.d dVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.f9510c = new w3.y("RequestDialogCallbackImpl");
        this.f9511d = context.getPackageName();
        this.f9512e = kVar;
        this.f9508a = taskCompletionSource;
        this.f = activity;
        this.f9509b = dVar;
    }

    @Override // w3.x
    public final void b(Bundle bundle) {
        this.f9509b.d(this.f9508a);
        this.f9510c.b("onRequestDialog(%s)", this.f9511d);
        com.google.android.gms.common.api.j a7 = this.f9512e.a(bundle);
        if (a7 != null) {
            this.f9508a.trySetException(a7);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            w3.y yVar = this.f9510c;
            Object[] objArr = {this.f9511d};
            yVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", w3.y.c(yVar.f16366a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f9508a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f9509b.a()));
        w3.y yVar2 = this.f9510c;
        Object[] objArr2 = new Object[0];
        yVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", w3.y.c(yVar2.f16366a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}

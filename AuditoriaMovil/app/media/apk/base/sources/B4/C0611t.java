package b4;

import a4.AbstractC0467p;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import h3.AbstractC1079a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* renamed from: b4.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0611t extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f8292a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f8293b;

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseAuth f8294c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0467p f8295d;

    public C0611t(A.l lVar, Activity activity, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, AbstractC0467p abstractC0467p) {
        this.f8292a = new WeakReference(activity);
        this.f8293b = taskCompletionSource;
        this.f8294c = firebaseAuth;
        this.f8295d = abstractC0467p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.f8292a.get();
        X2.b bVar = null;
        TaskCompletionSource taskCompletionSource = this.f8293b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzadr.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details", null, null)));
            A.l.r(context);
        } else if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
                this.f8294c.h(A.l.p(intent)).addOnSuccessListener(new r(taskCompletionSource, context, 0)).addOnFailureListener(new C0609q(taskCompletionSource, context, 0));
                return;
            }
            boolean equals = "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra);
            AbstractC0467p abstractC0467p = this.f8295d;
            if (equals) {
                a4.K p7 = A.l.p(intent);
                abstractC0467p.getClass();
                FirebaseAuth.getInstance(U3.h.e(((C0599g) abstractC0467p).f8255c)).i(abstractC0467p, p7).addOnSuccessListener(new r(taskCompletionSource, context, 1)).addOnFailureListener(new C0609q(taskCompletionSource, context, 1));
            } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
                a4.K p8 = A.l.p(intent);
                abstractC0467p.getClass();
                FirebaseAuth.getInstance(U3.h.e(((C0599g) abstractC0467p).f8255c)).q(abstractC0467p, p8).addOnSuccessListener(new r(taskCompletionSource, context, 2)).addOnFailureListener(new C0609q(taskCompletionSource, context, 2));
            } else {
                taskCompletionSource.setException(zzadr.zza(AbstractC1079a.y("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
            }
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
            } else if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                taskCompletionSource.setException(zzadr.zza(AbstractC1079a.y("WEB_CONTEXT_CANCELED")));
                A.l.r(context);
            }
        }
    }
}

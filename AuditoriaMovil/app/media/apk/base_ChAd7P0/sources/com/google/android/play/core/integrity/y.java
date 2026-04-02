package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
/* loaded from: classes.dex */
abstract class y {

    /* renamed from: b  reason: collision with root package name */
    private final String f9593b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9594c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9596e;

    /* renamed from: a  reason: collision with root package name */
    private final w3.y f9592a = new w3.y("IntegrityDialogWrapper");

    /* renamed from: d  reason: collision with root package name */
    private final Object f9595d = new Object();

    public y(String str, long j) {
        this.f9593b = str;
        this.f9594c = j;
    }

    public final Task a(Activity activity, int i7) {
        synchronized (this.f9595d) {
            try {
                if (this.f9596e) {
                    return Tasks.forResult(0);
                }
                this.f9596e = true;
                w3.y yVar = this.f9592a;
                Object[] objArr = {Integer.valueOf(i7)};
                yVar.getClass();
                if (Log.isLoggable("PlayCore", 3)) {
                    Log.d("PlayCore", w3.y.c(yVar.f16366a, "checkAndShowDialog(%s)", objArr));
                }
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f9593b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f9594c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}

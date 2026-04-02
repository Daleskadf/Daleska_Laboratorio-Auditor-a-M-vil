package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
/* renamed from: com.google.firebase.storage.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0826c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9885a;

    /* renamed from: b  reason: collision with root package name */
    public m f9886b;

    /* renamed from: c  reason: collision with root package name */
    public TaskCompletionSource f9887c;

    /* renamed from: d  reason: collision with root package name */
    public B4.e f9888d;

    public /* synthetic */ RunnableC0826c(int i7) {
        this.f9885a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9885a) {
            case 0:
                m mVar = this.f9886b;
                C4.a aVar = new C4.a(mVar.b(), mVar.f9931b.f9900a, 0);
                this.f9888d.b(aVar, true);
                aVar.a(null, this.f9887c);
                return;
            default:
                m mVar2 = this.f9886b;
                C4.a aVar2 = new C4.a(mVar2.b(), mVar2.f9931b.f9900a, 1);
                this.f9888d.b(aVar2, true);
                Uri uri = null;
                if (aVar2.l()) {
                    String optString = aVar2.i().optString("downloadTokens");
                    if (!TextUtils.isEmpty(optString)) {
                        String str = optString.split(",", -1)[0];
                        Uri.Builder buildUpon = ((Uri) mVar2.b().f5966c).buildUpon();
                        buildUpon.appendQueryParameter("alt", "media");
                        buildUpon.appendQueryParameter("token", str);
                        uri = buildUpon.build();
                    }
                }
                TaskCompletionSource taskCompletionSource = this.f9887c;
                if (taskCompletionSource != null) {
                    aVar2.a(uri, taskCompletionSource);
                    return;
                }
                return;
        }
    }
}

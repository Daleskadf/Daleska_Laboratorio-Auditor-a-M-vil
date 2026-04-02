package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzawo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes.dex */
final class zzr extends AsyncTask {
    final /* synthetic */ zzt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzr(zzt zztVar, zzq zzqVar) {
        this.zza = zztVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzt zztVar = this.zza;
        String str = (String) obj;
        if (zzt.zze(zztVar) == null || str == null) {
            return;
        }
        zzt.zze(zztVar).loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzt zztVar = this.zza;
            zzt.zzv(zztVar, (zzawo) zzt.zzu(zztVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (ExecutionException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        } catch (TimeoutException e3) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e3);
        }
        return this.zza.zzp();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfpp {
    public static final /* synthetic */ int zza = 0;
    private static volatile zzasn zzb = zzasn.UNKNOWN;
    private final Context zzc;
    private final Executor zzd;
    private final Task zze;
    private final boolean zzf;

    zzfpp(Context context, Executor executor, Task task, boolean z) {
        this.zzc = context;
        this.zzd = executor;
        this.zze = task;
        this.zzf = z;
    }

    public static zzfpp zza(final Context context, Executor executor, boolean z) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpn
                @Override // java.lang.Runnable
                public final void run() {
                    taskCompletionSource.setResult(zzfrv.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfpo
                @Override // java.lang.Runnable
                public final void run() {
                    TaskCompletionSource.this.setResult(zzfrv.zzc());
                }
            });
        }
        return new zzfpp(context, executor, taskCompletionSource.getTask(), z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzg(zzasn zzasnVar) {
        zzb = zzasnVar;
    }

    private final Task zzh(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (this.zzf) {
            Context context = this.zzc;
            final zzasi zza2 = zzaso.zza();
            zza2.zza(context.getPackageName());
            zza2.zzf(j);
            zza2.zze(zzb);
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzg(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            if (str2 != null) {
                zza2.zzb(str2);
            }
            if (str != null) {
                zza2.zzc(str);
            }
            return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpm
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i2 = zzfpp.zza;
                    if (task.isSuccessful()) {
                        int i3 = i;
                        zzfru zza3 = ((zzfrv) task.getResult()).zza(((zzaso) zzasi.this.zzbr()).zzaV());
                        zza3.zza(i3);
                        zza3.zzc();
                        return true;
                    }
                    return false;
                }
            });
        }
        return this.zze.continueWith(this.zzd, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfpl
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Boolean.valueOf(task.isSuccessful());
            }
        });
    }

    public final Task zzb(int i, String str) {
        return zzh(i, 0L, null, null, null, str);
    }

    public final Task zzc(int i, long j, Exception exc) {
        return zzh(i, j, exc, null, null, null);
    }

    public final Task zzd(int i, long j) {
        return zzh(i, j, null, null, null, null);
    }

    public final Task zze(int i, long j, String str) {
        return zzh(i, j, null, null, null, str);
    }

    public final Task zzf(int i, long j, String str, Map map) {
        return zzh(i, j, null, str, null, null);
    }
}

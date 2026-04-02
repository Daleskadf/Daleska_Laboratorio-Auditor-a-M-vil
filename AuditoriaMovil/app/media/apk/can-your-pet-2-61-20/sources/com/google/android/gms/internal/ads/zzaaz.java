package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaz extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaax zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaaz(zzaax zzaaxVar, SurfaceTexture surfaceTexture, boolean z, zzaay zzaayVar) {
        super(surfaceTexture);
        this.zzd = zzaaxVar;
        this.zza = z;
    }

    public static zzaaz zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzek.zzf(z2);
        return new zzaax().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        int i2;
        synchronized (zzaaz.class) {
            if (!zzc) {
                if (zzet.zzb(context)) {
                    i2 = zzet.zzc() ? 1 : 2;
                } else {
                    i2 = 0;
                }
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}

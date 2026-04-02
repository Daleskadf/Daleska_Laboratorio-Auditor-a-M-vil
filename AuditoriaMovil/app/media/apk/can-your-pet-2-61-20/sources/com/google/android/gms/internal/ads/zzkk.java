package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkk implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabv, zzqg, zzxn, zzug, zzio, zzik {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzko zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkk(zzko zzkoVar, zzkj zzkjVar) {
        this.zza = zzkoVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzko.zzP(this.zza, surfaceTexture);
        zzko.zzN(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzko.zzQ(this.zza, null);
        zzko.zzN(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzko.zzN(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzko.zzN(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzko.zzN(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zza(Exception exc) {
        zzko.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzb(String str, long j, long j2) {
        zzko.zzF(this.zza).zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzc(String str) {
        zzko.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzd(zzir zzirVar) {
        zzko.zzF(this.zza).zzy(zzirVar);
        zzko.zzI(this.zza, null);
        zzko.zzH(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zze(zzir zzirVar) {
        zzko.zzH(this.zza, zzirVar);
        zzko.zzF(this.zza).zzz(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzf(zzam zzamVar, zzis zzisVar) {
        zzko.zzI(this.zza, zzamVar);
        zzko.zzF(this.zza).zzA(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzg(long j) {
        zzko.zzF(this.zza).zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzh(Exception exc) {
        zzko.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzi(zzqh zzqhVar) {
        zzko.zzF(this.zza).zzD(zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzj(zzqh zzqhVar) {
        zzko.zzF(this.zza).zzE(zzqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzk(int i, long j, long j2) {
        zzko.zzF(this.zza).zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzl(int i, long j) {
        zzko.zzF(this.zza).zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzm(Object obj, long j) {
        zzko.zzF(this.zza).zzH(obj, j);
        zzko zzkoVar = this.zza;
        if (zzko.zzG(zzkoVar) == obj) {
            zzfb zzD = zzko.zzD(zzkoVar);
            zzD.zzd(26, new zzey() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzey
                public final void zza(Object obj2) {
                    zzcl zzclVar = (zzcl) obj2;
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqg
    public final void zzn(final boolean z) {
        zzko zzkoVar = this.zza;
        if (zzko.zzV(zzkoVar) == z) {
            return;
        }
        zzko.zzJ(zzkoVar, z);
        zzfb zzD = zzko.zzD(this.zza);
        zzD.zzd(23, new zzey() { // from class: com.google.android.gms.internal.ads.zzkg
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzn(z);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzo(Exception exc) {
        zzko.zzF(this.zza).zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzp(String str, long j, long j2) {
        zzko.zzF(this.zza).zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzq(String str) {
        zzko.zzF(this.zza).zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzr(zzir zzirVar) {
        zzko.zzF(this.zza).zzL(zzirVar);
        zzko.zzL(this.zza, null);
        zzko.zzK(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzs(zzir zzirVar) {
        zzko.zzK(this.zza, zzirVar);
        zzko.zzF(this.zza).zzM(zzirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzt(long j, int i) {
        zzko.zzF(this.zza).zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzu(zzam zzamVar, zzis zzisVar) {
        zzko.zzL(this.zza, zzamVar);
        zzko.zzF(this.zza).zzO(zzamVar, zzisVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabv
    public final void zzv(final zzdp zzdpVar) {
        zzko.zzM(this.zza, zzdpVar);
        zzfb zzD = zzko.zzD(this.zza);
        zzD.zzd(25, new zzey() { // from class: com.google.android.gms.internal.ads.zzkh
            @Override // com.google.android.gms.internal.ads.zzey
            public final void zza(Object obj) {
                int i = zzkk.zzb;
                ((zzcl) obj).zzr(zzdp.this);
            }
        });
        zzD.zzc();
    }
}

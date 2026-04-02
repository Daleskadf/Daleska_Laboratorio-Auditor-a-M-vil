package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzceh implements zzgv {
    private final Context zza;
    private final zzgv zzb;
    private final String zzc;
    private final int zzd;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbcj zzi;
    private zzhb zzm;
    private boolean zzj = false;
    private boolean zzk = false;
    private final AtomicLong zzl = new AtomicLong(-1);
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue();

    public zzceh(Context context, zzgv zzgvVar, String str, int i, zzhy zzhyVar, zzceg zzcegVar) {
        this.zza = context;
        this.zzb = zzgvVar;
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg() {
        if (this.zze) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeo)).booleanValue() || this.zzj) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzep)).booleanValue() && !this.zzk;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (this.zzg) {
            InputStream inputStream = this.zzf;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i2);
            }
            return this.zzb.zza(bArr, i, i2);
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        this.zzh = zzhbVar.zza;
        this.zzm = zzhbVar;
        this.zzi = zzbcj.zza(zzhbVar.zza);
        zzbcg zzbcgVar = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzel)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhbVar.zze;
                this.zzi.zzi = zzfxg.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbcgVar = com.google.android.gms.ads.internal.zzu.zzc().zzb(this.zzi);
            }
            if (zzbcgVar != null && zzbcgVar.zze()) {
                this.zzj = zzbcgVar.zzg();
                this.zzk = zzbcgVar.zzf();
                if (!zzg()) {
                    this.zzf = zzbcgVar.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhbVar.zze;
            this.zzi.zzi = zzfxg.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzen);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzem);
            }
            long longValue = l.longValue();
            com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzu.zzd();
            Future zza = zzbcu.zza(this.zza, this.zzi);
            try {
                try {
                    zzbcv zzbcvVar = (zzbcv) zza.get(longValue, TimeUnit.MILLISECONDS);
                    zzbcvVar.zzd();
                    this.zzj = zzbcvVar.zzf();
                    this.zzk = zzbcvVar.zze();
                    zzbcvVar.zza();
                    if (!zzg()) {
                        this.zzf = zzbcvVar.zzc();
                    }
                } catch (InterruptedException unused) {
                    zza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgz zza2 = zzhbVar.zza();
            zza2.zzd(Uri.parse(this.zzi.zza));
            this.zzm = zza2.zze();
        }
        return this.zzb.zzb(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
            return;
        }
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzf(zzhy zzhyVar) {
    }
}

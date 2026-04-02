package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.I;
import j4.d;
import j4.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public final class zzsk implements zzry {
    private final zzmw zza;
    private zzqt zzb = new zzqt();

    private zzsk(zzmw zzmwVar, int i7) {
        this.zza = zzmwVar;
        zzsv.zza();
    }

    public static zzry zzf(zzmw zzmwVar) {
        return new zzsk(zzmwVar, 0);
    }

    public static zzry zzg() {
        return new zzsk(new zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zza(zzmv zzmvVar) {
        this.zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzb(zznc zzncVar) {
        this.zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzc(zzqt zzqtVar) {
        this.zzb = zzqtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final String zzd() {
        String zzk;
        zzqv zzf = this.zza.zzk().zzf();
        if (zzf != null && (zzk = zzf.zzk()) != null && !zzk.isEmpty()) {
            String zzk2 = zzf.zzk();
            I.i(zzk2);
            return zzk2;
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i7, boolean z7) {
        boolean z8;
        int i8 = i7 ^ 1;
        zzqt zzqtVar = this.zzb;
        if (1 != i8) {
            z8 = false;
        } else {
            z8 = true;
        }
        zzqtVar.zzf(Boolean.valueOf(z8));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzsv.zza();
            if (i7 == 0) {
                zzmy zzk = this.zza.zzk();
                d dVar = new d();
                zzkr.zza.configure(dVar);
                dVar.f13450d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    e eVar = new e(stringWriter, dVar.f13447a, dVar.f13448b, dVar.f13449c, dVar.f13450d);
                    eVar.a(zzk);
                    eVar.c();
                    eVar.f13452b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zzmy zzk2 = this.zza.zzk();
            zzbg zzbgVar = new zzbg();
            zzkr.zza.configure(zzbgVar);
            return zzbgVar.zza().zza(zzk2);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}

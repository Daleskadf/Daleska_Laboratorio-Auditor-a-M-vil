package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.I;
import j4.d;
import j4.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i7) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzc = this.zza.zzf().zzc();
        if (zzc != null && !zzg.zzb(zzc.zzk())) {
            String zzk = zzc.zzk();
            I.i(zzk);
            return zzk;
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i7, boolean z7) {
        boolean z8;
        int i8 = i7 ^ 1;
        zzky zzkyVar = this.zzb;
        if (1 != i8) {
            z8 = false;
        } else {
            z8 = true;
        }
        zzkyVar.zzf(Boolean.valueOf(z8));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i7 == 0) {
                zziy zzf = this.zza.zzf();
                d dVar = new d();
                zzhe.zza.configure(dVar);
                dVar.f13450d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    e eVar = new e(stringWriter, dVar.f13447a, dVar.f13448b, dVar.f13449c, dVar.f13450d);
                    eVar.a(zzf);
                    eVar.c();
                    eVar.f13452b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zziy zzf2 = this.zza.zzf();
            zzam zzamVar = new zzam();
            zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf2);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}

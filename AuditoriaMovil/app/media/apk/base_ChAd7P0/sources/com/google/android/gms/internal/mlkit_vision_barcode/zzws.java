package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.I;
import j4.d;
import j4.e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* loaded from: classes.dex */
public final class zzws implements zzwe {
    private final zzrd zza;
    private zzvb zzb = new zzvb();
    private final int zzc;

    private zzws(zzrd zzrdVar, int i7) {
        this.zza = zzrdVar;
        zzxb.zza();
        this.zzc = i7;
    }

    public static zzwe zzf(zzrd zzrdVar) {
        return new zzws(zzrdVar, 0);
    }

    public static zzwe zzg(zzrd zzrdVar, int i7) {
        return new zzws(zzrdVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzb(zzrc zzrcVar) {
        this.zza.zzf(zzrcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final zzwe zzc(zzvb zzvbVar) {
        this.zzb = zzvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final String zzd() {
        zzvd zzg = this.zza.zzk().zzg();
        if (zzg != null && !zzba.zzc(zzg.zzk())) {
            String zzk = zzg.zzk();
            I.i(zzk);
            return zzk;
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwe
    public final byte[] zze(int i7, boolean z7) {
        boolean z8;
        int i8 = i7 ^ 1;
        zzvb zzvbVar = this.zzb;
        if (1 != i8) {
            z8 = false;
        } else {
            z8 = true;
        }
        zzvbVar.zzf(Boolean.valueOf(z8));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzxb.zza();
            if (i7 == 0) {
                zzrf zzk = this.zza.zzk();
                d dVar = new d();
                zzox.zza.configure(dVar);
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
            zzrf zzk2 = this.zza.zzk();
            zzfi zzfiVar = new zzfi();
            zzox.zza.configure(zzfiVar);
            return zzfiVar.zza().zza(zzk2);
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}

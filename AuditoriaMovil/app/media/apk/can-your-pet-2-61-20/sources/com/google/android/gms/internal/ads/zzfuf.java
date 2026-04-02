package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.common.base.Ascii;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfuf extends zzfuz {
    private IBinder zza;
    private String zzb;
    private int zzc;
    private float zzd;
    private int zze;
    private String zzf;
    private byte zzg;

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zza(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzc(int i) {
        this.zzg = (byte) (this.zzg | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzd(int i) {
        this.zzc = i;
        this.zzg = (byte) (this.zzg | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zze(float f) {
        this.zzd = f;
        this.zzg = (byte) (this.zzg | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzf(boolean z) {
        this.zzg = (byte) (this.zzg | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzg(int i) {
        this.zzg = (byte) (this.zzg | Ascii.DLE);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzh(IBinder iBinder) {
        if (iBinder != null) {
            this.zza = iBinder;
            return this;
        }
        throw new NullPointerException("Null windowToken");
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfuz zzi(int i) {
        this.zze = i;
        this.zzg = (byte) (this.zzg | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuz
    public final zzfva zzj() {
        IBinder iBinder;
        if (this.zzg != 63 || (iBinder = this.zza) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" windowToken");
            }
            if ((this.zzg & 1) == 0) {
                sb.append(" stableSessionToken");
            }
            if ((this.zzg & 2) == 0) {
                sb.append(" layoutGravity");
            }
            if ((this.zzg & 4) == 0) {
                sb.append(" layoutVerticalMargin");
            }
            if ((this.zzg & 8) == 0) {
                sb.append(" displayMode");
            }
            if ((this.zzg & Ascii.DLE) == 0) {
                sb.append(" triggerMode");
            }
            if ((this.zzg & 32) == 0) {
                sb.append(" windowWidthPx");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzfuh(iBinder, false, this.zzb, this.zzc, this.zzd, 0, 0, null, this.zze, null, this.zzf, null, null);
    }
}

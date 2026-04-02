package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public class zziv extends zzit {
    protected final byte[] zzb;

    @Override // com.google.android.gms.internal.measurement.zzii
    public byte zza(int i) {
        return this.zzb[i];
    }

    protected int zze() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzii
    public byte zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    protected final int zzb(int i, int i2, int i3) {
        return zzjy.zza(i, this.zzb, zze(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final zzii zza(int i, int i2) {
        int zza = zza(0, i2, zzb());
        if (zza == 0) {
            return zzii.zza;
        }
        return new zzim(this.zzb, zze(), zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    protected final String zza(Charset charset) {
        return new String(this.zzb, zze(), zzb(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzii
    public final void zza(zzij zzijVar) throws IOException {
        zzijVar.zza(this.zzb, zze(), zzb());
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzii) && zzb() == ((zzii) obj).zzb()) {
            if (zzb() == 0) {
                return true;
            }
            if (obj instanceof zziv) {
                zziv zzivVar = (zziv) obj;
                int zza = zza();
                int zza2 = zzivVar.zza();
                if (zza == 0 || zza2 == 0 || zza == zza2) {
                    return zza(zzivVar, 0, zzb());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzit
    public final boolean zza(zzii zziiVar, int i, int i2) {
        if (i2 > zziiVar.zzb()) {
            int zzb = zzb();
            throw new IllegalArgumentException("Length too large: " + i2 + zzb);
        } else if (i2 > zziiVar.zzb()) {
            int zzb2 = zziiVar.zzb();
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + zzb2);
        } else if (zziiVar instanceof zziv) {
            zziv zzivVar = (zziv) zziiVar;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzivVar.zzb;
            int zze = zze() + i2;
            int zze2 = zze();
            int zze3 = zzivVar.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        } else {
            return zziiVar.zza(0, i2).equals(zza(0, i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzd() {
        int zze = zze();
        return zznf.zzc(this.zzb, zze, zzb() + zze);
    }
}

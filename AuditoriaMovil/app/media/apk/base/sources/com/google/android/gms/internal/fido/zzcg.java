package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import org.apache.tika.fork.ForkServer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    public zzcg(zzcd zzcdVar, Character ch) {
        this.zzb = zzcdVar;
        if (ch != null && zzcdVar.zzc('=')) {
            throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcgVar = (zzcg) obj;
            if (this.zzb.equals(zzcgVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcgVar.zzc;
                if (ch != ch2) {
                    if (ch != null && ch.equals(ch2)) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            hashCode = 0;
        } else {
            hashCode = ch.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zzch zza(zzcd zzcdVar, Character ch) {
        return new zzcg(zzcdVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzap.zze(0, i8, bArr.length);
        while (i9 < i8) {
            zze(appendable, bArr, i9, Math.min(this.zzb.zzd, i8 - i9));
            i9 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final int zzc(int i7) {
        zzcd zzcdVar = this.zzb;
        return zzcj.zza(i7, zzcdVar.zzd, RoundingMode.CEILING) * zzcdVar.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzch
    public final zzch zzd() {
        zzch zzchVar = this.zza;
        if (zzchVar == null) {
            zzcd zzb = this.zzb.zzb();
            if (zzb == this.zzb) {
                zzchVar = this;
            } else {
                zzchVar = zza(zzb, this.zzc);
            }
            this.zza = zzchVar;
        }
        return zzchVar;
    }

    public final void zze(Appendable appendable, byte[] bArr, int i7, int i8) {
        boolean z7;
        zzap.zze(i7, i7 + i8, bArr.length);
        int i9 = 0;
        if (i8 <= this.zzb.zzd) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzap.zzc(z7);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | (bArr[i7 + i10] & ForkServer.ERROR)) << 8;
        }
        int i11 = ((i8 + 1) * 8) - this.zzb.zzb;
        while (i9 < i8 * 8) {
            zzcd zzcdVar = this.zzb;
            appendable.append(zzcdVar.zza(zzcdVar.zza & ((int) (j >>> (i11 - i9)))));
            i9 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i9 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i9 += this.zzb.zzb;
            }
        }
    }

    public zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}

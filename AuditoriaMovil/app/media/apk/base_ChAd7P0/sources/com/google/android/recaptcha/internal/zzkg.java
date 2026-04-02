package com.google.android.recaptcha.internal;

import io.flutter.plugins.pathprovider.b;
import j$.util.Objects;
import java.math.RoundingMode;
import org.apache.tika.fork.ForkServer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzkd zzkdVar;
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < zze.length()) {
                long j = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    zzkdVar = this.zza;
                    if (i9 >= zzkdVar.zzc) {
                        break;
                    }
                    j <<= zzkdVar.zzb;
                    if (i7 + i9 < zze.length()) {
                        j |= this.zza.zzb(zze.charAt(i10 + i7));
                        i10++;
                    }
                    i9++;
                }
                int i11 = zzkdVar.zzd;
                int i12 = i10 * zzkdVar.zzb;
                int i13 = (i11 - 1) * 8;
                while (i13 >= (i11 * 8) - i12) {
                    bArr[i8] = (byte) ((j >>> i13) & 255);
                    i13 -= 8;
                    i8++;
                }
                i7 += this.zza.zzc;
            }
            return i8;
        }
        throw new zzkf(b.e(zze.length(), "Invalid input length "));
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        int i9 = 0;
        zzjf.zzd(0, i8, bArr.length);
        while (i9 < i8) {
            zzf(appendable, bArr, i9, Math.min(this.zza.zzd, i8 - i9));
            i9 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i7) {
        return (int) (((this.zza.zzb * i7) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i7) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i7, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i7, int i8) {
        boolean z7;
        zzjf.zzd(i7, i7 + i8, bArr.length);
        int i9 = 0;
        if (i8 <= this.zza.zzd) {
            z7 = true;
        } else {
            z7 = false;
        }
        zzjf.zza(z7);
        long j = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            j = (j | (bArr[i7 + i10] & ForkServer.ERROR)) << 8;
        }
        int i11 = (i8 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i9 < i8 * 8) {
            long j8 = j >>> ((i11 - zzkdVar.zzb) - i9);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j8) & zzkdVar2.zza));
            i9 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i9 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i9 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}

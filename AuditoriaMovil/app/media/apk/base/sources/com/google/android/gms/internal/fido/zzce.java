package com.google.android.gms.internal.fido;

import com.google.android.libraries.barhopper.RecognitionOptions;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
final class zzce extends zzcg {
    final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        this.zza = new char[RecognitionOptions.UPC_A];
        zzap.zzc(zzcd.zzd(zzcdVar).length == 16);
        for (int i7 = 0; i7 < 256; i7++) {
            this.zza[i7] = zzcdVar.zza(i7 >>> 4);
            this.zza[i7 | RecognitionOptions.QR_CODE] = zzcdVar.zza(i7 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i7, int i8) {
        zzap.zze(0, i8, bArr.length);
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = bArr[i9] & ForkServer.ERROR;
            appendable.append(this.zza[i10]);
            appendable.append(this.zza[i10 | RecognitionOptions.QR_CODE]);
        }
    }

    public zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }
}

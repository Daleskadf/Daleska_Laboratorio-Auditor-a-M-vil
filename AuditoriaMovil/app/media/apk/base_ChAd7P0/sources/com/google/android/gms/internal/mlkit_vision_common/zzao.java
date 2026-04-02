package com.google.android.gms.internal.mlkit_vision_common;

import h4.C1083c;
import h4.InterfaceC1087g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao implements InterfaceC1087g {
    private boolean zza = false;
    private boolean zzb = false;
    private C1083c zzc;
    private final zzak zzd;

    public zzao(zzak zzakVar) {
        this.zzd = zzakVar;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final InterfaceC1087g add(double d7) {
        zzb();
        this.zzd.zza(this.zzc, d7, this.zzb);
        return this;
    }

    public final void zza(C1083c c1083c, boolean z7) {
        this.zza = false;
        this.zzc = c1083c;
        this.zzb = z7;
    }

    public final InterfaceC1087g add(float f) {
        zzb();
        this.zzd.zzb(this.zzc, f, this.zzb);
        return this;
    }

    public final InterfaceC1087g add(int i7) {
        zzb();
        this.zzd.zzd(this.zzc, i7, this.zzb);
        return this;
    }

    public final InterfaceC1087g add(long j) {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // h4.InterfaceC1087g
    public final InterfaceC1087g add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // h4.InterfaceC1087g
    public final InterfaceC1087g add(boolean z7) {
        zzb();
        this.zzd.zzd(this.zzc, z7 ? 1 : 0, this.zzb);
        return this;
    }

    public final InterfaceC1087g add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}

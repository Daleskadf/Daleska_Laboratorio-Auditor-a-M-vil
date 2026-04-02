package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgjz {
    @Nullable
    private String zza;
    @Nullable
    private zzgka zzb;
    @Nullable
    private zzggt zzc;

    private zzgjz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgjz(zzgjy zzgjyVar) {
    }

    public final zzgjz zza(zzggt zzggtVar) {
        this.zzc = zzggtVar;
        return this;
    }

    public final zzgjz zzb(zzgka zzgkaVar) {
        this.zzb = zzgkaVar;
        return this;
    }

    public final zzgjz zzc(String str) {
        this.zza = str;
        return this;
    }

    public final zzgkc zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            zzgka zzgkaVar = this.zzb;
            if (zzgkaVar != null) {
                zzggt zzggtVar = this.zzc;
                if (zzggtVar != null) {
                    if (zzggtVar.zza()) {
                        throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
                    }
                    if ((!zzgkaVar.equals(zzgka.zza) || !(zzggtVar instanceof zzgik)) && ((!zzgkaVar.equals(zzgka.zzc) || !(zzggtVar instanceof zzgjd)) && ((!zzgkaVar.equals(zzgka.zzb) || !(zzggtVar instanceof zzgkv)) && ((!zzgkaVar.equals(zzgka.zzd) || !(zzggtVar instanceof zzghl)) && ((!zzgkaVar.equals(zzgka.zze) || !(zzggtVar instanceof zzghx)) && (!zzgkaVar.equals(zzgka.zzf) || !(zzggtVar instanceof zzgix))))))) {
                        String zzgkaVar2 = this.zzb.toString();
                        String valueOf = String.valueOf(this.zzc);
                        throw new GeneralSecurityException("Cannot use parsing strategy " + zzgkaVar2 + " when new keys are picked according to " + valueOf + ".");
                    }
                    return new zzgkc(this.zza, this.zzb, this.zzc, null);
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}

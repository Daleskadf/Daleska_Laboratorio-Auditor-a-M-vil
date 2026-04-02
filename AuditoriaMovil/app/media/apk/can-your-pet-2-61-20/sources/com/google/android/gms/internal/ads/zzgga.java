package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgga {
    private final List zza = new ArrayList();
    private final zzgrs zzb = zzgrs.zza;
    private boolean zzc = false;

    public final void zzd() {
        for (zzgfy zzgfyVar : this.zza) {
            zzgfyVar.zza = false;
        }
    }

    public final zzgga zza(zzgfy zzgfyVar) {
        zzgga zzggaVar;
        boolean z;
        zzggaVar = zzgfyVar.zzf;
        if (zzggaVar != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        z = zzgfyVar.zza;
        if (z) {
            zzd();
        }
        zzgfyVar.zzf = this;
        this.zza.add(zzgfyVar);
        return this;
    }

    public final zzgge zzb() throws GeneralSecurityException {
        zzgfz zzgfzVar;
        zzgfz zzgfzVar2;
        zzgfz zzgfzVar3;
        int i;
        zzggi zzggiVar;
        zzggi zzggiVar2;
        zzgfv zzgfvVar;
        boolean z;
        zzgfv zzgfvVar2;
        zzgur zzgurVar;
        boolean z2;
        zzgfv zzgfvVar3;
        zzgfz zzgfzVar4;
        zzgfz zzgfzVar5;
        zzgfz zzgfzVar6;
        zzgfz zzgfzVar7;
        zzgfv unused;
        zzgfz unused2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List list = this.zza;
        zzguz zzd = zzgvc.zzd();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        char c2 = 0;
        int i2 = 0;
        while (i2 < list2.size() - 1) {
            int i3 = i2 + 1;
            zzgfzVar4 = ((zzgfy) list2.get(i2)).zze;
            zzgfzVar5 = zzgfz.zza;
            if (zzgfzVar4 == zzgfzVar5) {
                zzgfzVar6 = ((zzgfy) list2.get(i3)).zze;
                zzgfzVar7 = zzgfz.zza;
                if (zzgfzVar6 != zzgfzVar7) {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgfy zzgfyVar : this.zza) {
            unused = zzgfyVar.zzb;
            zzgfzVar = zzgfyVar.zze;
            if (zzgfzVar == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            zzgfzVar2 = zzgfyVar.zze;
            zzgfzVar3 = zzgfz.zza;
            if (zzgfzVar2 == zzgfzVar3) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i4 = 0;
                    while (i4 == 0) {
                        secureRandom.nextBytes(bArr);
                        i4 = ((bArr[c2] & 255) << 24) | ((bArr[c] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i = i4;
                }
            } else {
                unused2 = zzgfyVar.zze;
                i = 0;
            }
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            zzgfy.zza(zzgfyVar);
            zzggiVar = zzgfyVar.zzd;
            Integer num2 = c != zzggiVar.zza() ? null : valueOf;
            zzgnk zzb = zzgnk.zzb();
            zzggiVar2 = zzgfyVar.zzd;
            zzgft zza = zzb.zza(zzggiVar2, num2);
            zzgfvVar = zzgfyVar.zzb;
            z = zzgfyVar.zza;
            zzggc zzggcVar = new zzggc(zza, zzgfvVar, i, z, null);
            zzgfvVar2 = zzgfyVar.zzb;
            zzgot zzgotVar = (zzgot) zzgnu.zzc().zzd(zza, zzgot.class, zzggn.zza());
            Integer zzf = zzgotVar.zzf();
            if (zzf != null && zzf.intValue() != i) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            if (zzgfv.zza.equals(zzgfvVar2)) {
                zzgurVar = zzgur.ENABLED;
            } else if (zzgfv.zzb.equals(zzgfvVar2)) {
                zzgurVar = zzgur.DISABLED;
            } else if (!zzgfv.zzc.equals(zzgfvVar2)) {
                throw new IllegalStateException("Unknown key status");
            } else {
                zzgurVar = zzgur.DESTROYED;
            }
            zzgva zze = zzgvb.zze();
            zzgum zza2 = zzgup.zza();
            zza2.zzb(zzgotVar.zzg());
            zza2.zzc(zzgotVar.zze());
            zza2.zza(zzgotVar.zzb());
            zze.zza(zza2);
            zze.zzd(zzgurVar);
            zze.zzb(i);
            zze.zzc(zzgotVar.zzc());
            zzd.zza((zzgvb) zze.zzbr());
            z2 = zzgfyVar.zza;
            if (z2) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                zzgfvVar3 = zzgfyVar.zzb;
                if (zzgfvVar3 != zzgfv.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(zzggcVar);
            c = 1;
            c2 = 0;
        }
        if (num != null) {
            zzd.zzb(num.intValue());
            zzgvc zzgvcVar = (zzgvc) zzd.zzbr();
            zzgge.zzh(zzgvcVar);
            return new zzgge(zzgvcVar, arrayList, this.zzb, null);
        }
        throw new GeneralSecurityException("No primary was set");
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzvw implements zzvf, zzve {
    private final zzvf[] zza;
    private zzve zze;
    private zzxk zzf;
    private final zzus zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzxa zzh = new zzur(zzfzn.zzm(), zzfzn.zzm());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzvf[] zzg = new zzvf[0];

    public zzvw(zzus zzusVar, long[] jArr, zzvf... zzvfVarArr) {
        this.zzi = zzusVar;
        this.zza = zzvfVarArr;
        for (int i = 0; i < zzvfVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzxg(zzvfVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmj zzmjVar) {
        zzvf[] zzvfVarArr = this.zzg;
        return (zzvfVarArr.length > 0 ? zzvfVarArr[0] : this.zza[0]).zza(j, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        zzvf[] zzvfVarArr;
        zzvf[] zzvfVarArr2;
        long j = -9223372036854775807L;
        for (zzvf zzvfVar : this.zzg) {
            long zzd = zzvfVar.zzd();
            if (zzd != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (zzvf zzvfVar2 : this.zzg) {
                        if (zzvfVar2 == zzvfVar) {
                            break;
                        } else if (zzvfVar2.zze(zzd) != zzd) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd;
                } else if (zzd != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && zzvfVar.zze(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        long zze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzvf[] zzvfVarArr = this.zzg;
            if (i >= zzvfVarArr.length) {
                return zze;
            }
            if (zzvfVarArr[i].zze(zze) != zze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyz[] zzyzVarArr, boolean[] zArr, zzwy[] zzwyVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzyzVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzyzVarArr.length;
            if (i >= length) {
                break;
            }
            zzwy zzwyVar = zzwyVarArr[i];
            Integer num = zzwyVar != null ? (Integer) this.zzb.get(zzwyVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            zzyz zzyzVar = zzyzVarArr[i];
            if (zzyzVar != null) {
                String str = zzyzVar.zze().zzc;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.zzb.clear();
        zzwy[] zzwyVarArr2 = new zzwy[length];
        zzwy[] zzwyVarArr3 = new zzwy[length];
        zzyz[] zzyzVarArr2 = new zzyz[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.zza.length) {
            for (int i3 = 0; i3 < zzyzVarArr.length; i3++) {
                zzwyVarArr3[i3] = iArr[i3] == i2 ? zzwyVarArr[i3] : null;
                if (iArr2[i3] == i2) {
                    zzyz zzyzVar2 = zzyzVarArr[i3];
                    zzyzVar2.getClass();
                    zzcz zzczVar = (zzcz) this.zzd.get(zzyzVar2.zze());
                    zzczVar.getClass();
                    zzyzVarArr2[i3] = new zzvv(zzyzVar2, zzczVar);
                } else {
                    zzyzVarArr2[i3] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzyz[] zzyzVarArr3 = zzyzVarArr2;
            zzwy[] zzwyVarArr4 = zzwyVarArr3;
            long zzf = this.zza[i2].zzf(zzyzVarArr2, zArr, zzwyVarArr3, zArr2, j2);
            if (i2 == 0) {
                j2 = zzf;
            } else if (zzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i4 = 0; i4 < zzyzVarArr.length; i4++) {
                if (iArr2[i4] == i2) {
                    zzwy zzwyVar2 = zzwyVarArr4[i4];
                    zzwyVar2.getClass();
                    zzwyVarArr2[i4] = zzwyVar2;
                    this.zzb.put(zzwyVar2, Integer.valueOf(i2));
                    z = true;
                } else if (iArr[i4] == i2) {
                    zzek.zzf(zzwyVarArr4[i4] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i2]);
            }
            i2++;
            arrayList = arrayList2;
            zzyzVarArr2 = zzyzVarArr3;
            zzwyVarArr3 = zzwyVarArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwyVarArr2, 0, zzwyVarArr, 0, length);
        this.zzg = (zzvf[]) arrayList3.toArray(new zzvf[0]);
        this.zzh = new zzur(arrayList3, zzgad.zzb(arrayList3, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzvu
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return ((zzvf) obj).zzh().zzc();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ void zzg(zzxa zzxaVar) {
        zzvf zzvfVar = (zzvf) zzxaVar;
        zzve zzveVar = this.zze;
        zzveVar.getClass();
        zzveVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzh() {
        zzxk zzxkVar = this.zzf;
        zzxkVar.getClass();
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzi(zzvf zzvfVar) {
        this.zzc.remove(zzvfVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzvf zzvfVar2 : this.zza) {
            i += zzvfVar2.zzh().zzc;
        }
        zzcz[] zzczVarArr = new zzcz[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i2 < zzvfVarArr.length) {
                zzxk zzh = zzvfVarArr[i2].zzh();
                int i4 = zzh.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzcz zzb = zzh.zzb(i5);
                    zzam[] zzamVarArr = new zzam[zzb.zzb];
                    for (int i6 = 0; i6 < zzb.zzb; i6++) {
                        zzam zzb2 = zzb.zzb(i6);
                        zzak zzb3 = zzb2.zzb();
                        String str = zzb2.zzb;
                        if (str == null) {
                            str = "";
                        }
                        zzb3.zzK(i2 + ":" + str);
                        zzamVarArr[i6] = zzb3.zzac();
                    }
                    zzcz zzczVar = new zzcz(i2 + ":" + zzb.zzc, zzamVarArr);
                    this.zzd.put(zzczVar, zzb);
                    zzczVarArr[i3] = zzczVar;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.zzf = new zzxk(zzczVarArr);
                zzve zzveVar = this.zze;
                zzveVar.getClass();
                zzveVar.zzi(this);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj(long j, boolean z) {
        for (zzvf zzvfVar : this.zzg) {
            zzvfVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zze = zzveVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzvf zzn(int i) {
        zzvf zzvfVar = this.zza[i];
        return zzvfVar instanceof zzxg ? ((zzxg) zzvfVar).zzn() : zzvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzo(zzlg zzlgVar) {
        if (!this.zzc.isEmpty()) {
            int size = this.zzc.size();
            for (int i = 0; i < size; i++) {
                ((zzvf) this.zzc.get(i)).zzo(zzlgVar);
            }
            return false;
        }
        return this.zzh.zzo(zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxa
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}

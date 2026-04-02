package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanl implements zzaoz {
    private final List zza;

    public zzanl() {
        this(0);
    }

    public zzanl(int i, List list) {
        this.zza = list;
    }

    private final zzaop zzb(zzaoy zzaoyVar) {
        return new zzaop(zzd(zzaoyVar));
    }

    private final zzapd zzc(zzaoy zzaoyVar) {
        return new zzapd(zzd(zzaoyVar));
    }

    private final List zzd(zzaoy zzaoyVar) {
        String str;
        int i;
        List list;
        zzfo zzfoVar = new zzfo(zzaoyVar.zze);
        List list2 = this.zza;
        while (zzfoVar.zzb() > 0) {
            int zzm = zzfoVar.zzm();
            int zzd = zzfoVar.zzd() + zzfoVar.zzm();
            if (zzm == 134) {
                list2 = new ArrayList();
                int zzm2 = zzfoVar.zzm() & 31;
                for (int i2 = 0; i2 < zzm2; i2++) {
                    String zzA = zzfoVar.zzA(3, zzfwd.zzc);
                    int zzm3 = zzfoVar.zzm();
                    boolean z = (zzm3 & 128) != 0;
                    if (z) {
                        i = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzm4 = (byte) zzfoVar.zzm();
                    zzfoVar.zzL(1);
                    if (z) {
                        int i3 = zzm4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i4 = zzem.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzak zzakVar = new zzak();
                    zzakVar.zzW(str);
                    zzakVar.zzN(zzA);
                    zzakVar.zzw(i);
                    zzakVar.zzL(list);
                    list2.add(zzakVar.zzac());
                }
            }
            zzfoVar.zzK(zzd);
        }
        return list2;
    }

    public zzanl(int i) {
        this.zza = zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzaoz
    public final zzapb zza(int i, zzaoy zzaoyVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzaof(new zzaoc(zzaoyVar.zzb, zzaoyVar.zza()));
            }
            if (i == 21) {
                return new zzaof(new zzaoa());
            }
            if (i == 27) {
                return new zzaof(new zzanx(zzb(zzaoyVar), false, false));
            }
            if (i == 36) {
                return new zzaof(new zzanz(zzb(zzaoyVar)));
            }
            if (i == 89) {
                return new zzaof(new zzann(zzaoyVar.zzd));
            }
            if (i == 172) {
                return new zzaof(new zzanh(zzaoyVar.zzb, zzaoyVar.zza()));
            }
            if (i == 257) {
                return new zzaoo(new zzaoe("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i != 139) {
                            switch (i) {
                                case 15:
                                    return new zzaof(new zzank(false, zzaoyVar.zzb, zzaoyVar.zza()));
                                case 16:
                                    return new zzaof(new zzant(zzc(zzaoyVar)));
                                case 17:
                                    return new zzaof(new zzaob(zzaoyVar.zzb, zzaoyVar.zza()));
                                default:
                                    switch (i) {
                                        case 134:
                                            return new zzaoo(new zzaoe("application/x-scte35"));
                                        case 135:
                                            break;
                                        case 136:
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        } else {
                            return new zzaof(new zzanm(zzaoyVar.zzb, zzaoyVar.zza(), 5408));
                        }
                    }
                    return new zzaof(new zzanm(zzaoyVar.zzb, zzaoyVar.zza(), 4096));
                }
                return new zzaof(new zzane(zzaoyVar.zzb, zzaoyVar.zza()));
            }
        }
        return new zzaof(new zzanq(zzc(zzaoyVar)));
    }
}

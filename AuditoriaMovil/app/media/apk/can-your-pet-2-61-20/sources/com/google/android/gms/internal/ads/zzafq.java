package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafq extends zzafs {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzafq() {
        super(new zzade());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfo zzfoVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfoVar.zzt()));
    }

    private static String zzi(zzfo zzfoVar) {
        int zzq = zzfoVar.zzq();
        int zzd = zzfoVar.zzd();
        zzfoVar.zzL(zzq);
        return new String(zzfoVar.zzM(), zzd, zzq);
    }

    private static HashMap zzj(zzfo zzfoVar) {
        int zzp = zzfoVar.zzp();
        HashMap hashMap = new HashMap(zzp);
        for (int i = 0; i < zzp; i++) {
            String zzi = zzi(zzfoVar);
            Object zzh = zzh(zzfoVar, zzfoVar.zzm());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zza(zzfo zzfoVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    protected final boolean zzb(zzfo zzfoVar, long j) {
        if (zzfoVar.zzm() == 2 && "onMetaData".equals(zzi(zzfoVar)) && zzfoVar.zzb() != 0 && zzfoVar.zzm() == 8) {
            HashMap zzj = zzj(zzfoVar);
            Object obj = zzj.get(TypedValues.TransitionType.S_DURATION);
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }

    private static Object zzh(zzfo zzfoVar, int i) {
        if (i == 0) {
            return zzg(zzfoVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzfoVar.zzm() == 1);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzfoVar).doubleValue());
                        zzfoVar.zzL(2);
                        return date;
                    }
                    int zzp = zzfoVar.zzp();
                    ArrayList arrayList = new ArrayList(zzp);
                    for (int i2 = 0; i2 < zzp; i2++) {
                        Object zzh = zzh(zzfoVar, zzfoVar.zzm());
                        if (zzh != null) {
                            arrayList.add(zzh);
                        }
                    }
                    return arrayList;
                }
                return zzj(zzfoVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzi = zzi(zzfoVar);
                int zzm = zzfoVar.zzm();
                if (zzm == 9) {
                    return hashMap;
                }
                Object zzh2 = zzh(zzfoVar, zzm);
                if (zzh2 != null) {
                    hashMap.put(zzi, zzh2);
                }
            }
        } else {
            return zzi(zzfoVar);
        }
    }
}

package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.jvm.internal.j;
import m6.o;
import m6.v;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final D zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, D d7) {
        zzei zzeiVar;
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = d7;
        zzei zzeiVar2 = null;
        try {
            zzeiVar = zzei.zzd;
            zzeiVar = zzeiVar == null ? new zzei(context, null) : zzeiVar;
            zzei.zzd = zzeiVar;
            zzeiVar2 = zzeiVar;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar2;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [D6.e, java.lang.Object, n6.d] */
    public final void zzg() {
        ArrayList<List> arrayList;
        o oVar;
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i7;
        int i8;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List zzd = zzeiVar2.zzd();
            j.e(zzd, "<this>");
            if (zzd instanceof RandomAccess) {
                int size = zzd.size();
                int i9 = size / 20;
                if (size % 20 == 0) {
                    i8 = 0;
                } else {
                    i8 = 1;
                }
                arrayList = new ArrayList(i9 + i8);
                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 20) {
                    int i11 = size - i10;
                    if (20 <= i11) {
                        i11 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i11);
                    for (int i12 = 0; i12 < i11; i12++) {
                        arrayList2.add(zzd.get(i12 + i10));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator iterator = zzd.iterator();
                j.e(iterator, "iterator");
                if (!iterator.hasNext()) {
                    oVar = o.f14073a;
                } else {
                    v vVar = new v(iterator, null);
                    ?? obj = new Object();
                    obj.f903c = AbstractC1740d.k(obj, obj, vVar);
                    oVar = obj;
                }
                while (oVar.hasNext()) {
                    arrayList.add((List) oVar.next());
                }
            }
            for (List<zzej> list : arrayList) {
                zzrd zzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i7 = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN != 0) {
                        if (i7 != 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                zzi.zzr(zzk.zzg());
                            }
                        } else {
                            zzi.zzq(zzk.zzf());
                        }
                        arrayList3.add(zzejVar);
                    } else {
                        throw null;
                    }
                }
                if (zzi.zzf() + zzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        H.q(this.zzd, null, new zzer(this, zztxVar, null), 3);
        zzh();
    }
}

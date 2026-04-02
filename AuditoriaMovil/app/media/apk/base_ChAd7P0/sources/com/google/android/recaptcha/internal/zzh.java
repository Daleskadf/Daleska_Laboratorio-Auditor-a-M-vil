package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import F6.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l6.e;
import l6.f;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh extends i implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, dVar);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzen zzenVar2;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzenVar2 = (zzen) this.zze;
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            D d7 = (D) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(H.c(d7, new zzg(zzeVar, this.zzc, this.zzd, null)));
                }
            }
            K[] kArr = (K[]) arrayList.toArray(new K[0]);
            this.zze = zzenVar;
            this.zza = 1;
            obj = H.d((K[]) Arrays.copyOf(kArr, kArr.length), this);
            if (obj != enumC1565a) {
                zzenVar2 = zzenVar;
            } else {
                return enumC1565a;
            }
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        for (f fVar : (List) obj) {
            Object obj2 = fVar.f13868a;
            if (!(obj2 instanceof e)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar2 != null) {
            zzenVar2.zza();
        }
        return zzsiVar;
    }
}

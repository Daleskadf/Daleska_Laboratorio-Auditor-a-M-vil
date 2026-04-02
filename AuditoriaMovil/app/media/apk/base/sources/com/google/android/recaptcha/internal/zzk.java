package com.google.android.recaptcha.internal;

import F6.D;
import F6.H;
import F6.K;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
public final class zzk extends i implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object obj2;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            org.slf4j.helpers.i.M(obj);
        } else {
            org.slf4j.helpers.i.M(obj);
            D d7 = (D) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                arrayList.add(H.c(d7, new zzj(zzeVar, this.zzd, this.zze, null)));
            }
            K[] kArr = (K[]) arrayList.toArray(new K[0]);
            this.zzf = zzf;
            this.zza = 1;
            obj = H.d((K[]) Arrays.copyOf(kArr, kArr.length), this);
            if (obj != enumC1565a) {
                zzenVar = zzf;
            } else {
                return enumC1565a;
            }
        }
        List<f> list = (List) obj;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (f fVar : list) {
                if (!(fVar.f13868a instanceof e)) {
                    zzenVar.zza();
                    obj2 = j.f13876a;
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        obj2 = org.slf4j.helpers.i.j(zzbdVar);
        return new f(obj2);
    }
}

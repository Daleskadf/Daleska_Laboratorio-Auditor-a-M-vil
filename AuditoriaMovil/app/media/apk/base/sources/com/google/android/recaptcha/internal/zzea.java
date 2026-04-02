package com.google.android.recaptcha.internal;

import F6.C0106t;
import F6.InterfaceC0105s;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.l;
/* loaded from: classes.dex */
final class zzea extends i implements l {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ InterfaceC0105s zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, InterfaceC0105s interfaceC0105s, d dVar) {
        super(1, dVar);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = interfaceC0105s;
    }

    @Override // p6.AbstractC1698a
    public final d create(d dVar) {
        return new zzea(this.zzc, this.zzd, this.zze, dVar);
    }

    @Override // w6.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((d) obj)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        zzbd e7;
        zzdt zzdtVar;
        zzen zzenVar2;
        zzdt zzdtVar2;
        zzcj zzcjVar;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        int i7 = this.zzb;
        if (i7 != 0) {
            if (i7 != 1) {
                zzenVar = (zzen) this.zza;
                try {
                    org.slf4j.helpers.i.M(obj);
                    zzenVar.zza();
                    zzec zzecVar = this.zzc;
                    zzcjVar = zzcm.zzb;
                    zzecVar.zzf = zzcjVar;
                    return Boolean.valueOf(((C0106t) this.zze).C(j.f13876a));
                } catch (zzbd e8) {
                    e7 = e8;
                    this.zzc.zzd = e7;
                    zzenVar.zzb(e7);
                    throw e7;
                }
            }
            zzenVar2 = (zzen) this.zza;
            try {
                org.slf4j.helpers.i.M(obj);
            } catch (zzbd e9) {
                e7 = e9;
                zzenVar = zzenVar2;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            zzekVar = this.zzc.zzb;
            zzen zzf = zzekVar.zzf(41);
            try {
                zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzf;
                this.zzb = 1;
                Object zzo = zzdtVar.zzo(j, this);
                if (zzo != enumC1565a) {
                    zzenVar2 = zzf;
                    obj = zzo;
                }
                return enumC1565a;
            } catch (zzbd e10) {
                zzenVar = zzf;
                e7 = e10;
                this.zzc.zzd = e7;
                zzenVar.zzb(e7);
                throw e7;
            }
        }
        zzsc zzscVar = (zzsc) obj;
        this.zzc.zze = zzscVar;
        zzdtVar2 = this.zzc.zza;
        long j8 = this.zzd;
        this.zza = zzenVar2;
        this.zzb = 2;
        if (zzdtVar2.zzn(zzscVar, j8, this) != enumC1565a) {
            zzenVar = zzenVar2;
            zzenVar.zza();
            zzec zzecVar2 = this.zzc;
            zzcjVar = zzcm.zzb;
            zzecVar2.zzf = zzcjVar;
            return Boolean.valueOf(((C0106t) this.zze).C(j.f13876a));
        }
        return enumC1565a;
    }
}

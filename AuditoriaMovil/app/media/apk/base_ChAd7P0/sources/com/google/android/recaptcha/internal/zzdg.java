package com.google.android.recaptcha.internal;

import F6.D;
import F6.G0;
import F6.H;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdg extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, d dVar) {
        super(2, dVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzek zzu;
        zzen zzenVar;
        Exception e7;
        zzbd e8;
        G0 e9;
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                org.slf4j.helpers.i.M(obj);
            } catch (G0 e10) {
                e9 = e10;
                zzs3 = this.zzc.zzs(e9, new zzbd(zzbb.zzc, zzba.zzb, e9.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e11) {
                e8 = e11;
                zzs2 = this.zzc.zzs(e8, e8);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e12) {
                e7 = e12;
                zzs = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        } else {
            org.slf4j.helpers.i.M(obj);
            zzu = this.zzc.zzu(this.zzd);
            zzen zzf = zzu.zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                Object z7 = H.z(j, zzdfVar, this);
                if (z7 != enumC1565a) {
                    zzenVar = zzf;
                    obj = z7;
                } else {
                    return enumC1565a;
                }
            } catch (G0 e13) {
                zzenVar = zzf;
                e9 = e13;
                zzs3 = this.zzc.zzs(e9, new zzbd(zzbb.zzc, zzba.zzb, e9.getMessage()));
                zzenVar.zzb(zzs3);
                throw zzs3;
            } catch (zzbd e14) {
                zzenVar = zzf;
                e8 = e14;
                zzs2 = this.zzc.zzs(e8, e8);
                zzenVar.zzb(zzs2);
                throw zzs2;
            } catch (Exception e15) {
                zzenVar = zzf;
                e7 = e15;
                zzs = this.zzc.zzs(e7, new zzbd(zzbb.zzc, zzba.zzZ, e7.getMessage()));
                zzenVar.zzb(zzs);
                throw zzs;
            }
        }
        return (zzsr) obj;
    }
}

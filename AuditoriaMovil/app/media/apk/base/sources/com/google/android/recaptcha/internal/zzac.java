package com.google.android.recaptcha.internal;

import F6.D;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import l6.j;
import n6.d;
import o6.EnumC1565a;
import p6.i;
import w6.p;
/* loaded from: classes.dex */
final class zzac extends i implements p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, d dVar) {
        super(2, dVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // p6.AbstractC1698a
    public final d create(Object obj, d dVar) {
        return new zzac(this.zzc, this.zzd, dVar);
    }

    @Override // w6.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((D) obj, (d) obj2)).invokeSuspend(j.f13876a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // p6.AbstractC1698a
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        zzan zzanVar;
        String str;
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e7) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e7.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i7 = 2;
            this.zzb = 2;
            if (e7 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e7).getErrorCode();
                if (errorCode != -100) {
                    if (errorCode != -12) {
                        if (errorCode != -3) {
                            if (errorCode != -2) {
                                if (errorCode != -1) {
                                    switch (errorCode) {
                                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                            i7 = 54;
                                            break;
                                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                            i7 = 53;
                                            break;
                                        case -17:
                                            i7 = 52;
                                            break;
                                        case -16:
                                            i7 = 43;
                                            break;
                                        case -15:
                                            i7 = 42;
                                            break;
                                        case -14:
                                            i7 = 41;
                                            break;
                                        default:
                                            switch (errorCode) {
                                                case -9:
                                                    i7 = 36;
                                                    break;
                                                case -8:
                                                    i7 = 35;
                                                    break;
                                                case -7:
                                                    i7 = 34;
                                                    break;
                                                case -6:
                                                    i7 = 33;
                                                    break;
                                                case -5:
                                                    i7 = 32;
                                                    break;
                                            }
                                    }
                                } else {
                                    i7 = 28;
                                }
                            } else {
                                i7 = 29;
                            }
                        } else {
                            i7 = 30;
                        }
                    } else {
                        i7 = 39;
                    }
                } else {
                    i7 = 44;
                }
            } else {
                i7 = 45;
            }
            zztd zzf = zzte.zzf();
            zzf.zzq(i7);
            zzf.zzr(15);
            obj = zzf.zzk();
            if (obj != enumC1565a) {
                zzyVar = zzaeVar;
            } else {
                return enumC1565a;
            }
        }
        if (zzenVar != 0) {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                org.slf4j.helpers.i.M(obj);
                int zza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(zza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            org.slf4j.helpers.i.M(obj);
            zzenVar = zzenVar2;
        } else {
            org.slf4j.helpers.i.M(obj);
            zzen zzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzanVar = zzaeVar2.zzc;
            str = zzaeVar2.zze;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzb;
            if (obj == enumC1565a) {
                return enumC1565a;
            }
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zzf2 = zzti.zzf();
        zztg zzf3 = zzth.zzf();
        zzf3.zzw((String) obj);
        zzf2.zzf((zzth) zzf3.zzk());
        return zzz.zza(zzaeVar3, (zzti) zzf2.zzk());
    }
}

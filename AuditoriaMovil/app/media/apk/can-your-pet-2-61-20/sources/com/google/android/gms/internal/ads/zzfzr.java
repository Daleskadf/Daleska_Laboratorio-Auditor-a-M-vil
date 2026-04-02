package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfzr extends zzfzg {
    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfzr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg, com.google.android.gms.internal.ads.zzfzh
    public final /* bridge */ /* synthetic */ zzfzh zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfzr zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzr(int i) {
        super(i);
        this.zzd = new Object[zzfzs.zzh(i)];
    }

    public final zzfzr zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zzf(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfzs zzi() {
        zzfzs zzv;
        boolean zzw;
        int i = this.zzb;
        if (i != 0) {
            if (i == 1) {
                return new zzgbq(Objects.requireNonNull(this.zza[0]));
            }
            if (this.zzd == null || zzfzs.zzh(i) != this.zzd.length) {
                zzv = zzfzs.zzv(this.zzb, this.zza);
                this.zzb = zzv.size();
            } else {
                int i2 = this.zzb;
                Object[] objArr = this.zza;
                zzw = zzfzs.zzw(i2, objArr.length);
                if (zzw) {
                    objArr = Arrays.copyOf(objArr, i2);
                }
                int i3 = this.zze;
                Object[] objArr2 = this.zzd;
                zzv = new zzgbf(objArr, i3, objArr2, objArr2.length - 1, this.zzb);
            }
            this.zzc = true;
            this.zzd = null;
            return zzv;
        }
        return zzgbf.zza;
    }

    public final zzfzr zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfzs.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfzf.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}

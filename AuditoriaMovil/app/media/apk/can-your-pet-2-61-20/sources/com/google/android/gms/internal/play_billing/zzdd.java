package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdd;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public abstract class zzdd<MessageType extends zzdd<MessageType, BuilderType>, BuilderType extends zzcz<MessageType, BuilderType>> extends zzbm<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzfn zzc = zzfn.zzc();

    private static zzdd zzA(zzdd zzddVar, byte[] bArr, int i, int i2, zzcp zzcpVar) throws zzdn {
        zzdd zzj = zzddVar.zzj();
        try {
            zzev zzb2 = zzes.zza().zzb(zzj.getClass());
            zzb2.zzh(zzj, bArr, 0, i2, new zzbp(zzcpVar));
            zzb2.zzf(zzj);
            return zzj;
        } catch (zzdn e) {
            e.zzf(zzj);
            throw e;
        } catch (zzfl e2) {
            zzdn zza = e2.zza();
            zza.zzf(zzj);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzdn) {
                throw ((zzdn) e3.getCause());
            }
            zzdn zzdnVar = new zzdn(e3);
            zzdnVar.zzf(zzj);
            throw zzdnVar;
        } catch (IndexOutOfBoundsException unused) {
            zzdn zzg = zzdn.zzg();
            zzg.zzf(zzj);
            throw zzg;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdd zzi(Class cls) {
        Map map = zzb;
        zzdd zzddVar = (zzdd) map.get(cls);
        if (zzddVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzddVar = (zzdd) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzddVar == null) {
            zzddVar = (zzdd) ((zzdd) zzfw.zze(cls)).zzy(6, null, null);
            if (zzddVar == null) {
                throw new IllegalStateException();
            }
            map.put(cls, zzddVar);
        }
        return zzddVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdd zzk(zzdd zzddVar, byte[] bArr, zzcp zzcpVar) throws zzdn {
        zzdd zzA = zzA(zzddVar, bArr, 0, bArr.length, zzcpVar);
        if (zzA == null || zzA.zzw()) {
            return zzA;
        }
        zzdn zza = new zzfl(zzA).zza();
        zza.zzf(zzA);
        throw zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdi zzl() {
        return zzde.zzf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdk zzm() {
        return zzet.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzdk zzn(zzdk zzdkVar) {
        int size = zzdkVar.size();
        return zzdkVar.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zzq(zzek zzekVar, String str, Object[] objArr) {
        return new zzeu(zzekVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzt(Class cls, zzdd zzddVar) {
        zzddVar.zzs();
        zzb.put(cls, zzddVar);
    }

    private final int zzz(zzev zzevVar) {
        return zzes.zza().zzb(getClass()).zza(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzes.zza().zzb(getClass()).zzj(this, (zzdd) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (zzx()) {
            return zze();
        }
        int i = this.zza;
        if (i == 0) {
            int zze = zze();
            this.zza = zze;
            return zze;
        }
        return i;
    }

    public final String toString() {
        return zzem.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzbm
    public final int zza(zzev zzevVar) {
        if (zzx()) {
            int zza = zzevVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int zza2 = zzevVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
                return zza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + zza2);
        }
        return i;
    }

    final int zze() {
        return zzes.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzel
    public final /* synthetic */ zzek zzf() {
        return (zzdd) zzy(6, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzcz zzh() {
        return (zzcz) zzy(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdd zzj() {
        return (zzdd) zzy(4, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzek
    public final /* synthetic */ zzej zzo() {
        return (zzcz) zzy(5, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzr() {
        zzes.zza().zzb(getClass()).zzf(this);
        zzs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzu(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.play_billing.zzek
    public final void zzv(zzck zzckVar) throws IOException {
        zzes.zza().zzb(getClass()).zzi(this, zzcl.zza(zzckVar));
    }

    public final boolean zzw() {
        Boolean bool = Boolean.TRUE;
        byte byteValue = ((Byte) zzy(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzes.zza().zzb(getClass()).zzk(this);
        zzy(2, true != zzk ? null : this, null);
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzy(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.play_billing.zzek
    public final int zzg() {
        int i;
        if (zzx()) {
            i = zzz(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzz(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }
}

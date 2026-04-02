package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.android.recaptcha.internal.zzmx;
import com.google.android.recaptcha.internal.zznd;
import io.flutter.plugins.pathprovider.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public abstract class zznd<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzpm zzc = zzpm.zzc();

    public static zznj zzA() {
        return zznx.zzf();
    }

    public static zznk zzB() {
        return zzot.zze();
    }

    public static zznk zzC(zznk zznkVar) {
        int size = zznkVar.size();
        return zznkVar.zzd(size + size);
    }

    public static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzF(zzoi zzoiVar, String str, Object[] objArr) {
        return new zzou(zzoiVar, str, objArr);
    }

    public static void zzI(Class cls, zznd zzndVar) {
        zzndVar.zzH();
        zzb.put(cls, zzndVar);
    }

    public static final boolean zzK(zznd zzndVar, boolean z7) {
        Object obj;
        byte byteValue = ((Byte) zzndVar.zzh(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzl = zzos.zza().zzb(zzndVar.getClass()).zzl(zzndVar);
        if (z7) {
            if (true != zzl) {
                obj = null;
            } else {
                obj = zzndVar;
            }
            zzndVar.zzh(2, obj, null);
        }
        return zzl;
    }

    private final int zzf(zzow zzowVar) {
        return zzos.zza().zzb(getClass()).zza(this);
    }

    private static zznd zzg(zznd zzndVar) {
        if (zzndVar != null && !zzK(zzndVar, true)) {
            throw new zzpk(zzndVar).zza();
        }
        return zzndVar;
    }

    public static zznd zzi(zznd zzndVar, byte[] bArr, int i7, int i8, zzmo zzmoVar) {
        if (i8 == 0) {
            return zzndVar;
        }
        zznd zzv = zzndVar.zzv();
        try {
            zzow zzb2 = zzos.zza().zzb(zzv.getClass());
            zzb2.zzi(zzv, bArr, 0, i8, new zzkt(zzmoVar));
            zzb2.zzf(zzv);
            return zzv;
        } catch (zznn e7) {
            if (e7.zzb()) {
                throw new zznn(e7);
            }
            throw e7;
        } catch (zzpk e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zznn) {
                throw ((zznn) e9.getCause());
            }
            throw new zznn(e9);
        } catch (IndexOutOfBoundsException unused) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static zznc zzs(zzoi zzoiVar, Object obj, zzoi zzoiVar2, zzng zzngVar, int i7, zzpw zzpwVar, Class cls) {
        return new zznc(zzoiVar, StringUtils.EMPTY, null, new zznb(null, i7, zzpwVar, false, false), cls);
    }

    public static /* bridge */ /* synthetic */ zznd zzt(zznd zzndVar, byte[] bArr, int i7, int i8, zzmo zzmoVar) {
        return zzi(zzndVar, bArr, 0, i8, zzmoVar);
    }

    public static zznd zzu(Class cls) {
        Map map = zzb;
        zznd zzndVar = (zznd) map.get(cls);
        if (zzndVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzndVar = (zznd) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzndVar == null) {
            zzndVar = (zznd) ((zznd) zzps.zze(cls)).zzh(6, null, null);
            if (zzndVar != null) {
                map.put(cls, zzndVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzndVar;
    }

    public static zznd zzw(zznd zzndVar, InputStream inputStream) {
        zzli zzlgVar;
        if (inputStream == null) {
            byte[] bArr = zznl.zzb;
            int length = bArr.length;
            zzlgVar = zzli.zzH(bArr, 0, 0, false);
        } else {
            zzlgVar = new zzlg(inputStream, RecognitionOptions.AZTEC, null);
        }
        int i7 = zzmo.zzb;
        int i8 = zzos.zza;
        zzmo zzmoVar = zzmo.zza;
        zznd zzv = zzndVar.zzv();
        try {
            zzow zzb2 = zzos.zza().zzb(zzv.getClass());
            zzb2.zzh(zzv, zzlj.zzq(zzlgVar), zzmoVar);
            zzb2.zzf(zzv);
            zzg(zzv);
            return zzv;
        } catch (zznn e7) {
            if (e7.zzb()) {
                throw new zznn(e7);
            }
            throw e7;
        } catch (zzpk e8) {
            throw e8.zza();
        } catch (IOException e9) {
            if (e9.getCause() instanceof zznn) {
                throw ((zznn) e9.getCause());
            }
            throw new zznn(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zznn) {
                throw ((zznn) e10.getCause());
            }
            throw e10;
        }
    }

    public static zznd zzx(zznd zzndVar, byte[] bArr) {
        int i7 = zzmo.zzb;
        int i8 = zzos.zza;
        zznd zzi = zzi(zzndVar, bArr, 0, bArr.length, zzmo.zza);
        zzg(zzi);
        return zzi;
    }

    public static zzni zzy() {
        return zzne.zzf();
    }

    public static zzni zzz(zzni zzniVar) {
        int size = zzniVar.size();
        return zzniVar.zzg(size + size);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzos.zza().zzb(getClass()).zzk(this, (zznd) obj);
    }

    public final int hashCode() {
        if (!zzL()) {
            int i7 = this.zza;
            if (i7 == 0) {
                int zzn = zzn();
                this.zza = zzn;
                return zzn;
            }
            return i7;
        }
        return zzn();
    }

    public final String toString() {
        return zzok.zza(this, super.toString());
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzoq zzD() {
        return (zzoq) zzh(7, null, null);
    }

    public final void zzG() {
        zzos.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    public final void zzH() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    public final void zzJ(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | f.API_PRIORITY_OTHER;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzko
    public final int zza(zzow zzowVar) {
        if (zzL()) {
            int zza = zzowVar.zza(this);
            if (zza >= 0) {
                return zza;
            }
            throw new IllegalStateException(b.e(zza, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & f.API_PRIORITY_OTHER;
        if (i7 == Integer.MAX_VALUE) {
            int zza2 = zzowVar.zza(this);
            if (zza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza2;
                return zza2;
            }
            throw new IllegalStateException(b.e(zza2, "serialized size must be non-negative, was "));
        }
        return i7;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzad() {
        return (zzmx) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzae() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final void zze(zzln zzlnVar) {
        zzos.zza().zzb(getClass()).zzj(this, zzlo.zza(zzlnVar));
    }

    public abstract Object zzh(int i7, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zzoj
    public final /* synthetic */ zzoi zzm() {
        return (zznd) zzh(6, null, null);
    }

    public final int zzn() {
        return zzos.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final int zzo() {
        int i7;
        if (zzL()) {
            i7 = zzf(null);
            if (i7 < 0) {
                throw new IllegalStateException(b.e(i7, "serialized size must be non-negative, was "));
            }
        } else {
            i7 = this.zzd & f.API_PRIORITY_OTHER;
            if (i7 == Integer.MAX_VALUE) {
                i7 = zzf(null);
                if (i7 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i7;
                } else {
                    throw new IllegalStateException(b.e(i7, "serialized size must be non-negative, was "));
                }
            }
        }
        return i7;
    }

    @Override // com.google.android.recaptcha.internal.zzoj
    public final boolean zzp() {
        return zzK(this, true);
    }

    public final zzmx zzq() {
        return (zzmx) zzh(5, null, null);
    }

    public final zzmx zzr() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    public final zznd zzv() {
        return (zznd) zzh(4, null, null);
    }
}

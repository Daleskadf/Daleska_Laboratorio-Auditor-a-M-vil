package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import com.google.android.gms.internal.p002firebaseauthapi.zzakg.zzb;
import io.flutter.plugins.pathprovider.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzakg<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzain<MessageType, BuilderType> {
    private static Map<Class<?>, zzakg<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamy zzb = zzamy.zzc();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zza */
    /* loaded from: classes.dex */
    public static class zza<T extends zzakg<T, ?>> extends zzair<T> {
        public zza(T t7) {
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzc */
    /* loaded from: classes.dex */
    public static final class zzc implements zzaka<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzanh zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzank zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzalm zza(zzalm zzalmVar, zzaln zzalnVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final zzals zza(zzals zzalsVar, zzals zzalsVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzd */
    /* loaded from: classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzakg<MessageType, BuilderType> implements zzalp {
        protected zzajy<zzc> zzc = zzajy.zzb();

        public final zzajy<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzajy) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zze */
    /* loaded from: classes.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzf */
    /* loaded from: classes.dex */
    public static class zzf<ContainingType extends zzaln, Type> extends zzajs<ContainingType, Type> {
    }

    private final int zzb(zzamc<?> zzamcVar) {
        if (zzamcVar == null) {
            return zzaly.zza().zza((zzaly) this).zza(this);
        }
        return zzamcVar.zza(this);
    }

    public static <E> zzakn<E> zzp() {
        return zzamb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzaly.zza().zza((zzaly) this).zzb(this, (zzakg) obj);
    }

    public int hashCode() {
        if (zzw()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzalo.zza(this, super.toString());
    }

    public abstract Object zza(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final int zzi() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final int zzl() {
        return zza((zzamc) null);
    }

    public final <MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzq() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final /* synthetic */ zzalm zzr() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final /* synthetic */ zzaln zzs() {
        return (zzakg) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzt() {
        zzaly.zza().zza((zzaly) this).zzd(this);
        zzu();
    }

    public final void zzu() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
    public final boolean zzv() {
        return zzb(this, true);
    }

    public final boolean zzw() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    private final int zza() {
        return zzaly.zza().zza((zzaly) this).zzb(this);
    }

    private static <T extends zzakg<T, ?>> T zzb(T t7, zzaiw zzaiwVar, zzajv zzajvVar) {
        zzaji zzc2 = zzaiwVar.zzc();
        T t8 = (T) zza(t7, zzc2, zzajvVar);
        zzc2.zzc(0);
        return t8;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final int zza(zzamc zzamcVar) {
        if (zzw()) {
            int zzb2 = zzb(zzamcVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(b.e(zzb2, "serialized size must be non-negative, was "));
        } else if (zzi() != Integer.MAX_VALUE) {
            return zzi();
        } else {
            int zzb3 = zzb(zzamcVar);
            zzb(zzb3);
            return zzb3;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzb */
    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzakg<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzaip<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzw()) {
                this.zza = (MessageType) messagetype.zzo();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzf();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzw()) {
                zzh();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaip
        public final /* synthetic */ zzaip zzb() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzc */
        public final MessageType zze() {
            MessageType messagetype = (MessageType) zzf();
            if (messagetype.zzv()) {
                return messagetype;
            }
            throw new zzamw(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalm
        /* renamed from: zzd */
        public MessageType zzf() {
            if (!this.zza.zzw()) {
                return this.zza;
            }
            this.zza.zzt();
            return this.zza;
        }

        public final void zzg() {
            if (!this.zza.zzw()) {
                zzh();
            }
        }

        public void zzh() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final /* synthetic */ zzaln zzs() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalp
        public final boolean zzv() {
            return zzakg.zzb(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaly.zza().zza((zzaly) messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzain
    public final void zzb(int i7) {
        if (i7 >= 0) {
            this.zzd = (i7 & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(b.e(i7, "serialized size must be non-negative, was "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends zzakg<T, ?>> boolean zzb(T t7, boolean z7) {
        byte byteValue = ((Byte) t7.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zze2 = zzaly.zza().zza((zzaly) t7).zze(t7);
        if (z7) {
            t7.zza(zze.zzb, zze2 ? t7 : null, null);
        }
        return zze2;
    }

    private static <T extends zzakg<T, ?>> T zza(T t7) {
        if (t7 == null || zzb(t7, true)) {
            return t7;
        }
        zzakm zza2 = new zzamw(t7).zza();
        zza2.getClass();
        throw zza2;
    }

    public static <T extends zzakg<?, ?>> T zza(Class<T> cls) {
        zzakg<?, ?> zzakgVar = zzc.get(cls);
        if (zzakgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakgVar = zzc.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (zzakgVar == null) {
            zzakgVar = (T) ((zzakg) zzana.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzakgVar != null) {
                zzc.put(cls, zzakgVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzakgVar;
    }

    public static <T extends zzakg<T, ?>> T zza(T t7, zzaiw zzaiwVar, zzajv zzajvVar) {
        return (T) zza(zzb(t7, zzaiwVar, zzajvVar));
    }

    public static <T extends zzakg<T, ?>> T zza(T t7, InputStream inputStream, zzajv zzajvVar) {
        zzaji zzajkVar;
        if (inputStream == null) {
            byte[] bArr = zzaki.zzb;
            zzajkVar = zzaji.zza(bArr, 0, bArr.length, false);
        } else {
            zzajkVar = new zzajk(inputStream);
        }
        return (T) zza(zza(t7, zzajkVar, zzajvVar));
    }

    public static <T extends zzakg<T, ?>> T zza(T t7, byte[] bArr, zzajv zzajvVar) {
        return (T) zza(zza(t7, bArr, 0, bArr.length, zzajvVar));
    }

    private static <T extends zzakg<T, ?>> T zza(T t7, zzaji zzajiVar, zzajv zzajvVar) {
        T t8 = (T) t7.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t8);
            zza2.zza(t8, zzajm.zza(zzajiVar), zzajvVar);
            zza2.zzd(t8);
            return t8;
        } catch (zzakm e7) {
            if (e7.zzl()) {
                throw new zzakm(e7);
            }
            throw e7;
        } catch (zzamw e8) {
            zzakm zza3 = e8.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzakm) {
                throw ((zzakm) e9.getCause());
            }
            throw new zzakm(e9);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof zzakm) {
                throw ((zzakm) e10.getCause());
            }
            throw e10;
        }
    }

    private static <T extends zzakg<T, ?>> T zza(T t7, byte[] bArr, int i7, int i8, zzajv zzajvVar) {
        if (i8 == 0) {
            return t7;
        }
        T t8 = (T) t7.zzo();
        try {
            zzamc zza2 = zzaly.zza().zza((zzaly) t8);
            zza2.zza(t8, bArr, 0, i8, new zzaiv(zzajvVar));
            zza2.zzd(t8);
            return t8;
        } catch (zzakm e7) {
            if (e7.zzl()) {
                throw new zzakm(e7);
            }
            throw e7;
        } catch (zzamw e8) {
            zzakm zza3 = e8.zza();
            zza3.getClass();
            throw zza3;
        } catch (IOException e9) {
            if (e9.getCause() instanceof zzakm) {
                throw ((zzakm) e9.getCause());
            }
            throw new zzakm(e9);
        } catch (IndexOutOfBoundsException unused) {
            zzakm zzj = zzakm.zzj();
            zzj.getClass();
            throw zzj;
        }
    }

    public static <E> zzakn<E> zza(zzakn<E> zzaknVar) {
        return zzaknVar.zza(zzaknVar.size() << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
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

    public static Object zza(zzaln zzalnVar, String str, Object[] objArr) {
        return new zzama(zzalnVar, str, objArr);
    }

    public static <T extends zzakg<?, ?>> void zza(Class<T> cls, T t7) {
        t7.zzu();
        zzc.put(cls, t7);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaln
    public final void zza(zzajo zzajoVar) {
        zzaly.zza().zza((zzaly) this).zza((zzamc) this, (zzanm) zzajq.zza(zzajoVar));
    }
}

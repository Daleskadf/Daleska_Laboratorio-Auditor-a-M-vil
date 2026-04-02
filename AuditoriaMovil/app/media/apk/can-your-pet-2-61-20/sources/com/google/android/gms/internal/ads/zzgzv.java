package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzgzv;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzgzv<MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> extends zzgxq<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Object, zzgzv<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected zzhcy zzt = zzhcy.zzc();

    protected static zzgzx zzbA() {
        return zzgxx.zzd();
    }

    protected static zzgzx zzbB(zzgzx zzgzxVar) {
        int size = zzgzxVar.size();
        return zzgzxVar.zze(size == 0 ? 10 : size + size);
    }

    protected static zzgzy zzbC() {
        return zzgzc.zzd();
    }

    protected static zzgzy zzbD(zzgzy zzgzyVar) {
        int size = zzgzyVar.size();
        return zzgzyVar.zze(size == 0 ? 10 : size + size);
    }

    protected static zzhac zzbE() {
        return zzgzm.zzd();
    }

    protected static zzhac zzbF(zzhac zzhacVar) {
        int size = zzhacVar.size();
        return zzhacVar.zze(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzhad zzbG() {
        return zzgzw.zzg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzhad zzbH(zzhad zzhadVar) {
        int size = zzhadVar.size();
        return zzhadVar.zzh(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzhag zzbI() {
        return zzhba.zzh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzhag zzbJ(zzhag zzhagVar) {
        int size = zzhagVar.size();
        return zzhagVar.zze(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzhah<E> zzbK() {
        return zzhbw.zzd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzhah<E> zzbL(zzhah<E> zzhahVar) {
        int size = zzhahVar.size();
        return zzhahVar.zzf(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzbQ(Method method, Object obj, Object... objArr) {
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
    public static Object zzbR(zzhbl zzhblVar, String str, Object[] objArr) {
        return new zzhbx(zzhblVar, str, objArr);
    }

    static Method zzbS(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException("Generated message class \"" + name + "\" missing method \"" + str + "\".", e);
        }
    }

    public static <ContainingType extends zzhbl, Type> zzgzt<ContainingType, Type> zzbe(ContainingType containingtype, zzhbl zzhblVar, zzhaa zzhaaVar, int i, zzhdn zzhdnVar, boolean z, Class cls) {
        return new zzgzt<>(containingtype, Collections.emptyList(), zzhblVar, new zzgzs(zzhaaVar, i, zzhdnVar, true, z), cls);
    }

    public static <ContainingType extends zzhbl, Type> zzgzt<ContainingType, Type> zzbf(ContainingType containingtype, Type type, zzhbl zzhblVar, zzhaa zzhaaVar, int i, zzhdn zzhdnVar, Class cls) {
        return new zzgzt<>(containingtype, type, zzhblVar, new zzgzs(zzhaaVar, i, zzhdnVar, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzgzv> T zzbh(Class<T> cls) {
        zzgzv<?, ?> zzgzvVar = zzc.get(cls);
        if (zzgzvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgzvVar = zzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgzvVar == null) {
            zzgzvVar = ((zzgzv) zzhdh.zzg(cls)).zzbt();
            if (zzgzvVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzgzvVar);
        }
        return zzgzvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbk(T t, InputStream inputStream) throws zzhak {
        T t2 = (T) zzg(t, inputStream, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbl(T t, InputStream inputStream, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzg(t, inputStream, zzgzfVar);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbm(T t, zzgyj zzgyjVar) throws zzhak {
        T t2 = (T) zzbr(t, zzgyjVar, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbn(T t, zzgyt zzgytVar) throws zzhak {
        return (T) zzbs(t, zzgytVar, zzgzf.zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbo(T t, InputStream inputStream) throws zzhak {
        T t2 = (T) zzbz(t, zzgyt.zzI(inputStream, 4096), zzgzf.zza);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbp(T t, ByteBuffer byteBuffer) throws zzhak {
        return (T) zzbv(t, byteBuffer, zzgzf.zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbq(T t, byte[] bArr) throws zzhak {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgzf.zza);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbr(T t, zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzh(t, zzgyjVar, zzgzfVar);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbs(T t, zzgyt zzgytVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzbz(t, zzgytVar, zzgzfVar);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbu(T t, InputStream inputStream, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzbz(t, zzgyt.zzI(inputStream, 4096), zzgzfVar);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbv(T t, ByteBuffer byteBuffer, zzgzf zzgzfVar) throws zzhak {
        zzgyt zzJ;
        int i = zzgyt.zzd;
        if (byteBuffer.hasArray()) {
            zzJ = zzgyt.zzJ(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        } else if (!byteBuffer.isDirect() || !zzhdh.zzB()) {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.duplicate().get(bArr);
            zzJ = zzgyt.zzJ(bArr, 0, remaining, true);
        } else {
            zzJ = new zzgyr(byteBuffer, false, null);
        }
        T t2 = (T) zzbs(t, zzJ, zzgzfVar);
        zzf(t2);
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv<T, ?>> T zzbx(T t, byte[] bArr, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) zzi(t, bArr, 0, bArr.length, zzgzfVar);
        zzf(t2);
        return t2;
    }

    protected static <T extends zzgzv<T, ?>> T zzby(T t, zzgyt zzgytVar) throws zzhak {
        return (T) zzbz(t, zzgytVar, zzgzf.zza);
    }

    static <T extends zzgzv<T, ?>> T zzbz(T t, zzgyt zzgytVar, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) t.zzbj();
        try {
            zzhcg zzb2 = zzhbv.zza().zzb(t2.getClass());
            zzb2.zzh(t2, zzgyu.zzq(zzgytVar), zzgzfVar);
            zzb2.zzf(t2);
            return t2;
        } catch (zzhak e) {
            e = e;
            if (e.zzl()) {
                e = new zzhak(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhcw e2) {
            zzhak zza2 = e2.zza();
            zza2.zzh(t2);
            throw zza2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhak) {
                throw ((zzhak) e3.getCause());
            }
            zzhak zzhakVar = new zzhak(e3);
            zzhakVar.zzh(t2);
            throw zzhakVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhak) {
                throw ((zzhak) e4.getCause());
            }
            throw e4;
        }
    }

    private int zzc(zzhcg<?> zzhcgVar) {
        if (zzhcgVar == null) {
            return zzhbv.zza().zzb(getClass()).zza(this);
        }
        return zzhcgVar.zza(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzgzv> void zzca(Class<T> cls, T t) {
        t.zzbW();
        zzc.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final <T extends zzgzv<T, ?>> boolean zzcd(T t, boolean z) {
        byte byteValue = ((Byte) t.zzbO(zzgzu.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzhbv.zza().zzb(t.getClass()).zzk(t);
        if (z) {
            t.zzbP(zzgzu.SET_MEMOIZED_IS_INITIALIZED, true != zzk ? null : t);
        }
        return zzk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends zzgzr<MessageType, BuilderType>, BuilderType, T> zzgzt<MessageType, T> zze(zzgzd<MessageType, T> zzgzdVar) {
        return (zzgzt) zzgzdVar;
    }

    private static <T extends zzgzv<T, ?>> T zzf(T t) throws zzhak {
        if (t == null || t.zzbw()) {
            return t;
        }
        zzhak zza2 = t.zzaP().zza();
        zza2.zzh(t);
        throw zza2;
    }

    private static <T extends zzgzv<T, ?>> T zzg(T t, InputStream inputStream, zzgzf zzgzfVar) throws zzhak {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            zzgyt zzI = zzgyt.zzI(new zzgxo(inputStream, zzgyt.zzG(read, inputStream)), 4096);
            T t2 = (T) zzbz(t, zzI, zzgzfVar);
            try {
                zzI.zzz(0);
                return t2;
            } catch (zzhak e) {
                e.zzh(t2);
                throw e;
            }
        } catch (zzhak e2) {
            if (e2.zzl()) {
                throw new zzhak(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new zzhak(e3);
        }
    }

    private static <T extends zzgzv<T, ?>> T zzh(T t, zzgyj zzgyjVar, zzgzf zzgzfVar) throws zzhak {
        zzgyt zzl = zzgyjVar.zzl();
        T t2 = (T) zzbz(t, zzl, zzgzfVar);
        try {
            zzl.zzz(0);
            return t2;
        } catch (zzhak e) {
            e.zzh(t2);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends zzgzv<T, ?>> T zzi(T t, byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        T t2 = (T) t.zzbj();
        try {
            zzhcg zzb2 = zzhbv.zza().zzb(t2.getClass());
            zzb2.zzi(t2, bArr, i, i + i2, new zzgxv(zzgzfVar));
            zzb2.zzf(t2);
            return t2;
        } catch (zzhak e) {
            e = e;
            if (e.zzl()) {
                e = new zzhak(e);
            }
            e.zzh(t2);
            throw e;
        } catch (zzhcw e2) {
            zzhak zza2 = e2.zza();
            zza2.zzh(t2);
            throw zza2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhak) {
                throw ((zzhak) e3.getCause());
            }
            zzhak zzhakVar = new zzhak(e3);
            zzhakVar.zzh(t2);
            throw zzhakVar;
        } catch (IndexOutOfBoundsException unused) {
            zzhak zzj = zzhak.zzj();
            zzj.zzh(t2);
            throw zzj;
        }
    }

    private void zzj() {
        if (this.zzt == zzhcy.zzc()) {
            this.zzt = zzhcy.zzf();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzhbv.zza().zzb(getClass()).zzj(this, (zzgzv) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzce()) {
            return zzaW();
        }
        if (zzcc()) {
            zzcb(zzaW());
        }
        return zzaX();
    }

    public String toString() {
        return zzhbn.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxq
    public int zzaL() {
        return this.zzd & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxq
    public int zzaM(zzhcg zzhcgVar) {
        if (!zzce()) {
            if (zzaL() != Integer.MAX_VALUE) {
                return zzaL();
            }
            int zzc2 = zzc(zzhcgVar);
            zzaS(zzc2);
            return zzc2;
        }
        int zzc3 = zzc(zzhcgVar);
        if (zzc3 >= 0) {
            return zzc3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzc3);
    }

    @Override // com.google.android.gms.internal.ads.zzgxq
    public zzhbq zzaO() {
        throw new UnsupportedOperationException("Lite does not support the mutable API.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgxq
    public void zzaS(int i) {
        if (i >= 0) {
            this.zzd = i | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    int zzaW() {
        return zzhbv.zza().zzb(getClass()).zzb(this);
    }

    int zzaX() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public int zzaY() {
        return zzaM(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> BuilderType zzaZ() {
        return (BuilderType) zzbO(zzgzu.NEW_BUILDER);
    }

    public final zzhbt<MessageType> zzbM() {
        return (zzhbt) zzbO(zzgzu.GET_PARSER);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object zzbN() throws Exception {
        return zzbO(zzgzu.BUILD_MESSAGE_INFO);
    }

    protected Object zzbO(zzgzu zzgzuVar) {
        return zzde(zzgzuVar, null, null);
    }

    protected Object zzbP(zzgzu zzgzuVar, Object obj) {
        return zzde(zzgzuVar, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbT() {
        this.zzq = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbU() {
        zzaS(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzbV() {
        zzhbv.zza().zzb(getClass()).zzf(this);
        zzbW();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzbW() {
        this.zzd &= Integer.MAX_VALUE;
    }

    protected void zzbX(int i, zzgyj zzgyjVar) {
        zzj();
        zzhcy zzhcyVar = this.zzt;
        zzhcyVar.zzg();
        if (i != 0) {
            zzhcyVar.zzj((i << 3) | 2, zzgyjVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    protected final void zzbY(zzhcy zzhcyVar) {
        this.zzt = zzhcy.zze(this.zzt, zzhcyVar);
    }

    protected void zzbZ(int i, int i2) {
        zzj();
        zzhcy zzhcyVar = this.zzt;
        zzhcyVar.zzg();
        if (i != 0) {
            zzhcyVar.zzj(i << 3, Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> BuilderType zzba(MessageType messagetype) {
        BuilderType zzaZ = zzaZ();
        zzaZ.zzbj(messagetype);
        return zzaZ;
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    /* renamed from: zzbb */
    public final BuilderType zzcY() {
        return (BuilderType) zzbO(zzgzu.NEW_BUILDER);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    /* renamed from: zzbc */
    public final BuilderType zzcZ() {
        BuilderType buildertype = (BuilderType) zzbO(zzgzu.NEW_BUILDER);
        buildertype.zzbj(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    /* renamed from: zzbi */
    public final MessageType zzbt() {
        return (MessageType) zzbO(zzgzu.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType zzbj() {
        return (MessageType) zzbO(zzgzu.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final boolean zzbw() {
        Boolean bool = Boolean.TRUE;
        return zzcd(this, true);
    }

    void zzcb(int i) {
        this.zzq = i;
    }

    boolean zzcc() {
        return zzaX() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean zzce() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected boolean zzcf(int i, zzgyt zzgytVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        zzj();
        return this.zzt.zzk(i, zzgytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbl
    public void zzda(zzgza zzgzaVar) throws IOException {
        zzhbv.zza().zzb(getClass()).zzm(this, zzgzb.zza(zzgzaVar));
    }

    protected abstract Object zzde(zzgzu zzgzuVar, Object obj, Object obj2);
}

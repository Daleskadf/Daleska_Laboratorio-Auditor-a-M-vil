package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class zzgo extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzgm zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzgo() {
    }

    public static /* bridge */ /* synthetic */ void zzi(zzgo zzgoVar) {
        zzgoVar.zzo();
    }

    private final int zzl(Comparable comparable) {
        int i7 = this.zzb;
        int i8 = i7 - 1;
        int i9 = 0;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((zzgi) this.zza[i8]).zza());
            if (compareTo > 0) {
                return -(i7 + 1);
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((zzgi) this.zza[i10]).zza());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else if (compareTo2 > 0) {
                i9 = i10 + 1;
            } else {
                return i10;
            }
        }
        return -(i9 + 1);
    }

    public final Object zzm(int i7) {
        zzo();
        Object value = ((zzgi) this.zza[i7]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.zzb - i7) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i8 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i8] = new zzgi(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    public final void zzo() {
        if (!this.zzd) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzl(comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzgm(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgo)) {
            return super.equals(obj);
        }
        zzgo zzgoVar = (zzgo) obj;
        int size = size();
        if (size != zzgoVar.size()) {
            return false;
        }
        int i7 = this.zzb;
        if (i7 == zzgoVar.zzb) {
            for (int i8 = 0; i8 < i7; i8++) {
                if (!zzg(i8).equals(zzgoVar.zzg(i8))) {
                    return false;
                }
            }
            if (i7 == size) {
                return true;
            }
            return this.zzc.equals(zzgoVar.zzc);
        }
        return entrySet().equals(zzgoVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzgi) this.zza[zzl]).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i7 = this.zzb;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.zza[i9].hashCode();
        }
        if (this.zzc.size() > 0) {
            return this.zzc.hashCode() + i8;
        }
        return i8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = DesugarCollections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = DesugarCollections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzgi) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i7 = -(zzl + 1);
        if (i7 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzgi zzgiVar = (zzgi) this.zza[15];
            this.zzb = 15;
            zzn().put(zzgiVar.zza(), zzgiVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i7, objArr, i7 + 1, 15 - i7);
        this.zza[i7] = new zzgi(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i7) {
        if (i7 < this.zzb) {
            return (zzgi) this.zza[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzgo(zzgn zzgnVar) {
    }
}

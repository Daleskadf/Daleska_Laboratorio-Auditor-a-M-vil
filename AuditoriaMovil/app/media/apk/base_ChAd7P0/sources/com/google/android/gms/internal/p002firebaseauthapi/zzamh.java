package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamh  reason: invalid package */
/* loaded from: classes.dex */
public class zzamh<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzamn zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (!this.zzd) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza((zzamh<K, V>) comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzamn(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzamh)) {
            return super.equals(obj);
        }
        zzamh zzamhVar = (zzamh) obj;
        int size = size();
        if (size != zzamhVar.size()) {
            return false;
        }
        int i7 = this.zzb;
        if (i7 != zzamhVar.zzb) {
            return entrySet().equals(zzamhVar.entrySet());
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!zza(i8).equals(zzamhVar.zza(i8))) {
                return false;
            }
        }
        if (i7 == size) {
            return true;
        }
        return this.zzc.equals(zzamhVar.zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzamh<K, V>) comparable);
        if (zza >= 0) {
            return (V) ((zzaml) this.zza[zza]).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i7 = this.zzb;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += this.zza[i9].hashCode();
        }
        if (this.zzc.size() > 0) {
            return i8 + this.zzc.hashCode();
        }
        return i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzamh<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzamh<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzamh() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzd() {
        return new zzami(this);
    }

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K k2) {
        int i7;
        int i8 = this.zzb;
        int i9 = i8 - 1;
        if (i9 >= 0) {
            int compareTo = k2.compareTo((Comparable) ((zzaml) this.zza[i9]).getKey());
            if (compareTo > 0) {
                i7 = i8 + 1;
                return -i7;
            } else if (compareTo == 0) {
                return i9;
            }
        }
        int i10 = 0;
        while (i10 <= i9) {
            int i11 = (i10 + i9) / 2;
            int compareTo2 = k2.compareTo((Comparable) ((zzaml) this.zza[i11]).getKey());
            if (compareTo2 < 0) {
                i9 = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        i7 = i10 + 1;
        return -i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i7) {
        zzg();
        V v6 = (V) ((zzaml) this.zza[i7]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7 + 1, objArr, i7, (this.zzb - i7) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzaml(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v6;
    }

    public final V zza(K k2, V v6) {
        zzg();
        int zza = zza((zzamh<K, V>) k2);
        if (zza >= 0) {
            return (V) ((zzaml) this.zza[zza]).setValue(v6);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i7 = -(zza + 1);
        if (i7 >= 16) {
            return zzf().put(k2, v6);
        }
        int i8 = this.zzb;
        if (i8 == 16) {
            zzaml zzamlVar = (zzaml) this.zza[15];
            this.zzb = i8 - 1;
            zzf().put((K) zzamlVar.getKey(), (V) zzamlVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i7, objArr, i7 + 1, (objArr.length - i7) - 1);
        this.zza[i7] = new zzaml(this, k2, v6);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i7) {
        if (i7 < this.zzb) {
            return (zzaml) this.zza[i7];
        }
        throw new ArrayIndexOutOfBoundsException(i7);
    }

    public void zza() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.zzd) {
            return;
        }
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

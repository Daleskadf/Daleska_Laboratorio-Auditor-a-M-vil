package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaj  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzaj<E> extends zzai<E> implements List<E>, RandomAccess, j$.util.List {
    private static final zzaz<Object> zza = new zzal(zzar.zza, 0);

    public static <E> zzaj<E> zzb(Object[] objArr, int i7) {
        if (i7 == 0) {
            return (zzaj<E>) zzar.zza;
        }
        return new zzar(objArr, i7);
    }

    public static <E> zzam<E> zzg() {
        return new zzam<>();
    }

    public static <E> zzaj<E> zzh() {
        return (zzaj<E>) zzar.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzw.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i7 = 0; i7 < size; i7++) {
                        if (zzp.zza(get(i7), list.get(i7))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e7 = get(i8);
                        i8++;
                        if (!zzp.zza(e7, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i8 = 0; i8 < size; i8++) {
            i7 = ~(~(get(i8).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzaz) listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i7, E e7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public int zza(Object[] objArr, int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            objArr[i7 + i8] = get(i8);
        }
        return i7 + size;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    @Deprecated
    public final zzaj<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public final zzba<E> iterator() {
        return (zzaz) listIterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i7) {
        zzw.zzb(i7, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzal(this, i7);
    }

    public static <E> zzaj<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzaj<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (objArr[i7] == null) {
                throw new NullPointerException(b.e(i7, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzaj<E> zza(Collection<? extends E> collection) {
        if (collection instanceof zzai) {
            zzaj<E> zzc = ((zzai) collection).zzc();
            if (zzc.zze()) {
                Object[] array = zzc.toArray();
                return zzb(array, array.length);
            }
            return zzc;
        }
        return zzb(collection.toArray());
    }

    public static <E> zzaj<E> zza(E e7, E e8, E e9, E e10, E e11, E e12, E e13, E e14) {
        return zzb(e7, e8, e9, e10, e11, e12, e13, e14);
    }

    @Override // java.util.List
    /* renamed from: zza */
    public zzaj<E> subList(int i7, int i8) {
        zzw.zza(i7, i8, size());
        int i9 = i8 - i7;
        if (i9 == size()) {
            return this;
        }
        if (i9 == 0) {
            return (zzaj<E>) zzar.zza;
        }
        return new zzao(this, i7, i9);
    }
}

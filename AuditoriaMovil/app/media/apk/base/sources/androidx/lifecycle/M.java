package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class M {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f7900a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f7901b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f7902c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f7903d;

    /* renamed from: e  reason: collision with root package name */
    public final Z1.d f7904e;

    public M(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f7900a = linkedHashMap;
        this.f7901b = new LinkedHashMap();
        this.f7902c = new LinkedHashMap();
        this.f7903d = new LinkedHashMap();
        this.f7904e = new L(this, 0);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(M this$0) {
        Map map;
        C c8;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        LinkedHashMap linkedHashMap = this$0.f7901b;
        kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                map = new LinkedHashMap(linkedHashMap);
            } else {
                kotlin.jvm.internal.j.e(linkedHashMap, "<this>");
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
                kotlin.jvm.internal.j.d(map, "with(...)");
            }
        } else {
            map = m6.q.f14075a;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap2 = this$0.f7900a;
            if (hasNext) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String key = (String) entry2.getKey();
                Object a7 = ((Z1.d) entry2.getValue()).a();
                kotlin.jvm.internal.j.e(key, "key");
                if (a7 != null) {
                    Class[] clsArr = f;
                    for (int i7 = 0; i7 < 29; i7++) {
                        Class cls = clsArr[i7];
                        kotlin.jvm.internal.j.b(cls);
                        if (!cls.isInstance(a7)) {
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a7.getClass() + " into saved state");
                }
                Object obj = this$0.f7902c.get(key);
                if (obj instanceof C) {
                    c8 = (C) obj;
                } else {
                    c8 = null;
                }
                if (c8 != null) {
                    c8.l(a7);
                } else {
                    linkedHashMap2.put(key, a7);
                }
                I6.q qVar = (I6.q) this$0.f7903d.get(key);
                if (qVar != null) {
                    I6.s sVar = (I6.s) qVar;
                    if (a7 == null) {
                        a7 = J6.l.f2445a;
                    }
                    sVar.F(null, a7);
                }
            } else {
                Set<String> keySet = linkedHashMap2.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap2.get(str));
                }
                l6.d[] dVarArr = {new l6.d("keys", arrayList), new l6.d("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    l6.d dVar = dVarArr[i8];
                    String str2 = (String) dVar.f13865a;
                    Object obj2 = dVar.f13866b;
                    if (obj2 == null) {
                        bundle.putString(str2, null);
                    } else if (obj2 instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj2).byteValue());
                    } else if (obj2 instanceof Character) {
                        bundle.putChar(str2, ((Character) obj2).charValue());
                    } else if (obj2 instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj2).doubleValue());
                    } else if (obj2 instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj2).floatValue());
                    } else if (obj2 instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj2).intValue());
                    } else if (obj2 instanceof Long) {
                        bundle.putLong(str2, ((Number) obj2).longValue());
                    } else if (obj2 instanceof Short) {
                        bundle.putShort(str2, ((Number) obj2).shortValue());
                    } else if (obj2 instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj2);
                    } else if (obj2 instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj2);
                    } else if (obj2 instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj2);
                    } else if (obj2 instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj2);
                    } else if (obj2 instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj2);
                    } else if (obj2 instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj2);
                    } else if (obj2 instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj2);
                    } else if (obj2 instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj2);
                    } else if (obj2 instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj2);
                    } else if (obj2 instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj2);
                    } else if (obj2 instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj2);
                    } else if (obj2 instanceof Object[]) {
                        Class<?> componentType = obj2.getClass().getComponentType();
                        kotlin.jvm.internal.j.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj2);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj2);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj2);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str2, (Serializable) obj2);
                        } else {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                    } else if (obj2 instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj2);
                    } else if (obj2 instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj2);
                    } else if (obj2 instanceof Size) {
                        bundle.putSize(str2, (Size) obj2);
                    } else if (obj2 instanceof SizeF) {
                        bundle.putSizeF(str2, (SizeF) obj2);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj2.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                }
                return bundle;
            }
        }
    }

    public M() {
        this.f7900a = new LinkedHashMap();
        this.f7901b = new LinkedHashMap();
        this.f7902c = new LinkedHashMap();
        this.f7903d = new LinkedHashMap();
        this.f7904e = new L(this, 0);
    }
}

package com.dexterous.flutterlocalnotifications;

import I4.G;
import I4.H;
import I4.n;
import L4.I;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
@Keep
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements H {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            return;
        }
        throw null;
    }

    public static /* bridge */ /* synthetic */ Class a(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.baseType;
    }

    public static /* bridge */ /* synthetic */ Map b(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.subtypeToLabel;
    }

    public static /* bridge */ /* synthetic */ String c(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory) {
        return runtimeTypeAdapterFactory.typeFieldName;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // I4.H
    public <R> G create(n nVar, P4.a<R> aVar) {
        if (aVar.f4022a != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            G d7 = nVar.d(this, new P4.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), d7);
            linkedHashMap2.put(entry.getValue(), d7);
        }
        return new I(this, linkedHashMap, linkedHashMap2).a();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls != null && str != null) {
            if (!this.subtypeToLabel.containsKey(cls) && !this.labelToSubtype.containsKey(str)) {
                this.labelToSubtype.put(str, cls);
                this.subtypeToLabel.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}

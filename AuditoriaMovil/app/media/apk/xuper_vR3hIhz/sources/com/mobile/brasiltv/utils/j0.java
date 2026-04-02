package com.mobile.brasiltv.utils;

import android.content.SharedPreferences;
/* loaded from: classes3.dex */
public final class j0 implements v9.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f8723a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f8724b;

    public j0(String str, Boolean bool) {
        this.f8723a = str;
        this.f8724b = bool;
    }

    @Override // v9.a
    public /* bridge */ /* synthetic */ void a(Object obj, z9.g gVar, Object obj2) {
        d((c) obj, gVar, ((Boolean) obj2).booleanValue());
    }

    @Override // v9.a
    /* renamed from: c */
    public Boolean b(c cVar, z9.g gVar) {
        boolean z10;
        t9.i.g(cVar, "thisRef");
        t9.i.g(gVar, "property");
        SharedPreferences e10 = cVar.e();
        String str = this.f8723a;
        if (str == null) {
            str = gVar.getName();
        }
        Boolean bool = this.f8724b;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        return Boolean.valueOf(e10.getBoolean(str, z10));
    }

    public void d(c cVar, z9.g gVar, boolean z10) {
        t9.i.g(cVar, "thisRef");
        t9.i.g(gVar, "property");
        SharedPreferences.Editor edit = cVar.e().edit();
        String str = this.f8723a;
        if (str == null) {
            str = gVar.getName();
        }
        edit.putBoolean(str, z10).apply();
    }
}

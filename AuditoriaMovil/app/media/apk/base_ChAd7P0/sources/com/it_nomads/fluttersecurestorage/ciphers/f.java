package com.it_nomads.fluttersecurestorage.ciphers;

import R1.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10152e = a.RSA_ECB_PKCS1Padding;
    public static final e f = e.AES_CBC_PKCS7Padding;

    /* renamed from: a  reason: collision with root package name */
    public final a f10153a;

    /* renamed from: b  reason: collision with root package name */
    public final e f10154b;

    /* renamed from: c  reason: collision with root package name */
    public final a f10155c;

    /* renamed from: d  reason: collision with root package name */
    public final e f10156d;

    public f(SharedPreferences sharedPreferences, Map map) {
        a aVar = f10152e;
        this.f10153a = a.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", aVar.name()));
        e eVar = f;
        this.f10154b = e.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", eVar.name()));
        String name = aVar.name();
        Object obj = map.get("keyCipherAlgorithm");
        a valueOf = a.valueOf(obj != null ? obj.toString() : name);
        int i7 = valueOf.minVersionCode;
        int i8 = Build.VERSION.SDK_INT;
        this.f10155c = i7 <= i8 ? valueOf : aVar;
        String name2 = eVar.name();
        Object obj2 = map.get("storageCipherAlgorithm");
        e valueOf2 = e.valueOf(obj2 != null ? obj2.toString() : name2);
        this.f10156d = valueOf2.minVersionCode <= i8 ? valueOf2 : eVar;
    }

    public final j a(Context context) {
        return this.f10156d.storageCipher.i(this.f10155c.keyCipher.g(context), context);
    }

    public final j b(Context context) {
        return this.f10154b.storageCipher.i(this.f10153a.keyCipher.g(context), context);
    }
}

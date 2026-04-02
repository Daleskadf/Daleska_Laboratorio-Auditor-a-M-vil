package com.google.firebase.storage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: h  reason: collision with root package name */
    public long f9922h;

    /* renamed from: a  reason: collision with root package name */
    public String f9916a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f9917b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f9918c = null;

    /* renamed from: d  reason: collision with root package name */
    public A.l f9919d = A.l.n(StringUtils.EMPTY);

    /* renamed from: e  reason: collision with root package name */
    public String f9920e = null;
    public String f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f9921g = null;

    /* renamed from: i  reason: collision with root package name */
    public String f9923i = null;
    public A.l j = A.l.n(StringUtils.EMPTY);

    /* renamed from: k  reason: collision with root package name */
    public A.l f9924k = A.l.n(StringUtils.EMPTY);

    /* renamed from: l  reason: collision with root package name */
    public A.l f9925l = A.l.n(StringUtils.EMPTY);

    /* renamed from: m  reason: collision with root package name */
    public A.l f9926m = A.l.n(StringUtils.EMPTY);

    /* renamed from: n  reason: collision with root package name */
    public A.l f9927n = A.l.n(Collections.emptyMap());

    public final JSONObject a() {
        HashMap hashMap = new HashMap();
        A.l lVar = this.f9919d;
        if (lVar.f25a) {
            hashMap.put("contentType", (String) lVar.f26b);
        }
        if (this.f9927n.f25a) {
            hashMap.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, new JSONObject((Map) this.f9927n.f26b));
        }
        A.l lVar2 = this.j;
        if (lVar2.f25a) {
            hashMap.put("cacheControl", (String) lVar2.f26b);
        }
        A.l lVar3 = this.f9924k;
        if (lVar3.f25a) {
            hashMap.put("contentDisposition", (String) lVar3.f26b);
        }
        A.l lVar4 = this.f9925l;
        if (lVar4.f25a) {
            hashMap.put("contentEncoding", (String) lVar4.f26b);
        }
        A.l lVar5 = this.f9926m;
        if (lVar5.f25a) {
            hashMap.put("contentLanguage", (String) lVar5.f26b);
        }
        return new JSONObject(hashMap);
    }
}

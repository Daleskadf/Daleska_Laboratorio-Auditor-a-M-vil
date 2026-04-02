package com.umeng.message.tag;

import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushTagCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.be;
import com.umeng.message.proguard.bi;
import com.umeng.message.proguard.d;
import com.umeng.message.proguard.e;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.g;
import com.umeng.message.proguard.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class TagManager {

    /* renamed from: b  reason: collision with root package name */
    private static volatile TagManager f12245b;

    /* renamed from: a  reason: collision with root package name */
    private final be f12246a = new be();

    @Deprecated
    /* loaded from: classes3.dex */
    public interface TCallBack extends UPushTagCallback<ITagManager.Result> {
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface TagListCallBack extends UPushTagCallback<List<String>> {
    }

    private TagManager() {
    }

    public static /* synthetic */ boolean b() {
        boolean z10;
        if (MessageSharedPrefs.getInstance(y.a()).f11344b.b("tag_send_policy", -1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            UPLog.i("TagManager", "tag server disable!");
        }
        return z10;
    }

    public static /* synthetic */ ITagManager.Result c() {
        return e();
    }

    public static /* synthetic */ JSONObject d() {
        Application a10 = y.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", e.a());
        jSONObject.put("utdid", d.o(a10));
        jSONObject.put("device_token", MessageSharedPrefs.getInstance(a10).l());
        jSONObject.put("ts", System.currentTimeMillis());
        return jSONObject;
    }

    private static ITagManager.Result e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", ITagManager.SUCCESS);
            jSONObject.put("remain", MessageSharedPrefs.getInstance(y.a()).d());
        } catch (Exception e10) {
            UPLog.e("TagManager", e10);
        }
        return new ITagManager.Result(jSONObject);
    }

    public static TagManager getInstance() {
        if (f12245b == null) {
            synchronized (TagManager.class) {
                if (f12245b == null) {
                    f12245b = new TagManager();
                }
            }
        }
        return f12245b;
    }

    public void addTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.1
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr2;
                ITagManager.Result result;
                boolean z10;
                ITagManager.Result result2 = new ITagManager.Result();
                try {
                    String[] strArr3 = strArr;
                    if (strArr3 != null && strArr3.length != 0) {
                        if (TagManager.a()) {
                            UPLog.e("TagManager", "No utdid or device_token");
                            result2.setErrors("No utdid or device_token");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th) {
                                UPLog.e("TagManager", th);
                                return;
                            }
                        } else if (TagManager.b()) {
                            UPLog.e("TagManager", "Tag api is disabled by the server");
                            result2.setErrors("Tag api is disabled by the server");
                            try {
                                uPushTagCallback.onMessage(false, result2);
                                return;
                            } catch (Throwable th2) {
                                UPLog.e("TagManager", th2);
                                return;
                            }
                        } else {
                            Application a10 = y.a();
                            ArrayList arrayList = new ArrayList();
                            Set<String> b10 = MessageSharedPrefs.getInstance(a10).f11344b.b("tags", new HashSet());
                            for (String str : strArr) {
                                if (!b10.contains(str) && !arrayList.contains(str)) {
                                    byte[] bytes = str.getBytes();
                                    if (bytes != null && bytes.length <= 128 && bytes.length > 0) {
                                        arrayList.add(str);
                                    } else {
                                        UPLog.e("TagManager", "tag length must be 1~128 byte");
                                        result2.setErrors("tag length must be 1~128 byte");
                                        try {
                                            uPushTagCallback.onMessage(false, result2);
                                            return;
                                        } catch (Throwable th3) {
                                            UPLog.e("TagManager", th3);
                                            return;
                                        }
                                    }
                                }
                            }
                            if (arrayList.size() > MessageSharedPrefs.getInstance(a10).d()) {
                                UPLog.e("TagManager", "tag count limit");
                                result2.setErrors("tag count limit");
                                try {
                                    uPushTagCallback.onMessage(false, result2);
                                    return;
                                } catch (Throwable th4) {
                                    UPLog.e("TagManager", th4);
                                    return;
                                }
                            } else if (!MessageSharedPrefs.getInstance(a10).a("tag_add_")) {
                                UPLog.e("TagManager", "interval limit");
                                result2.setErrors("interval limit");
                                try {
                                    uPushTagCallback.onMessage(false, result2);
                                    return;
                                } catch (Throwable th5) {
                                    UPLog.e("TagManager", th5);
                                    return;
                                }
                            } else if (arrayList.size() == 0) {
                                try {
                                    uPushTagCallback.onMessage(true, TagManager.c());
                                    return;
                                } catch (Throwable th6) {
                                    UPLog.e("TagManager", th6);
                                    return;
                                }
                            } else {
                                try {
                                    JSONObject d10 = TagManager.d();
                                    d10.put("tags", bi.a(arrayList));
                                    be unused = TagManager.this.f12246a;
                                    String[] strArr4 = strArr;
                                    Application a11 = y.a();
                                    result = new ITagManager.Result(g.a(d10, "https://msg.umengcloud.com/v3/tag/add", UMUtils.getAppkey(a11)));
                                    if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
                                        MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(a11);
                                        messageSharedPrefs.a(strArr4);
                                        messageSharedPrefs.a(result.remain);
                                        messageSharedPrefs.a("tag_add_", result.interval);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                                try {
                                    try {
                                        z10 = result.status.equals(ITagManager.SUCCESS);
                                    } catch (Exception e11) {
                                        e = e11;
                                        result2 = result;
                                        UPLog.e("TagManager", e);
                                        result = result2;
                                        z10 = false;
                                        uPushTagCallback.onMessage(z10, result);
                                        return;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        result2 = result;
                                        try {
                                            UPLog.e("TagManager", th);
                                            try {
                                                uPushTagCallback.onMessage(false, result2);
                                                return;
                                            } catch (Throwable th8) {
                                                UPLog.e("TagManager", th8);
                                                return;
                                            }
                                        } catch (Throwable th9) {
                                            try {
                                                uPushTagCallback.onMessage(false, result2);
                                            } catch (Throwable th10) {
                                                UPLog.e("TagManager", th10);
                                            }
                                            throw th9;
                                        }
                                    }
                                    uPushTagCallback.onMessage(z10, result);
                                    return;
                                } catch (Throwable th11) {
                                    UPLog.e("TagManager", th11);
                                    return;
                                }
                            }
                        }
                    }
                    UPLog.e("TagManager", "No tags");
                    result2.setErrors("No tags");
                    try {
                        uPushTagCallback.onMessage(false, result2);
                    } catch (Throwable th12) {
                        UPLog.e("TagManager", th12);
                    }
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        });
    }

    public void deleteTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.2
            @Override // java.lang.Runnable
            public final void run() {
                ITagManager.Result result;
                String a10;
                ITagManager.Result result2 = new ITagManager.Result();
                boolean z10 = false;
                try {
                    Application a11 = y.a();
                    String[] strArr2 = strArr;
                    if (strArr2 != null && strArr2.length > 0) {
                        for (String str : strArr2) {
                            byte[] bytes = str.getBytes();
                            if (bytes != null && bytes.length <= 128 && bytes.length > 0) {
                            }
                            result2.setErrors("tag length must be 1~128 byte.");
                            try {
                                return;
                            } catch (Throwable th) {
                                return;
                            }
                        }
                    }
                    if (!MessageSharedPrefs.getInstance(a11).a("tag_del_")) {
                        UPLog.e("TagManager", "interval limit");
                        result2.setErrors("interval limit");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                        } catch (Throwable th2) {
                            UPLog.e("TagManager", th2);
                        }
                    } else if (TagManager.b()) {
                        result2.setErrors("tag server disable.");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                        } catch (Throwable th3) {
                            UPLog.e("TagManager", th3);
                        }
                    } else if (TagManager.a()) {
                        result2.setErrors("check request failed.");
                        try {
                            uPushTagCallback.onMessage(false, result2);
                        } catch (Throwable th4) {
                            UPLog.e("TagManager", th4);
                        }
                    } else {
                        String[] strArr3 = strArr;
                        if (strArr3 != null && strArr3.length != 0) {
                            try {
                                JSONObject d10 = TagManager.d();
                                String[] strArr4 = strArr;
                                if (strArr4 == null) {
                                    a10 = "";
                                } else {
                                    a10 = bi.a(Arrays.asList(strArr4));
                                }
                                d10.put("tags", a10);
                                be unused = TagManager.this.f12246a;
                                String[] strArr5 = strArr;
                                Application a12 = y.a();
                                result = new ITagManager.Result(g.a(d10, "https://msg.umengcloud.com/v3/tag/delete", UMUtils.getAppkey(a12)));
                                if (TextUtils.equals(result.status, ITagManager.SUCCESS)) {
                                    MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(a12);
                                    if (strArr5 != null && strArr5.length != 0) {
                                        Set<String> b10 = messageSharedPrefs.f11344b.b("tags", new HashSet());
                                        for (String str2 : strArr5) {
                                            b10.remove(str2);
                                        }
                                        messageSharedPrefs.f11344b.a("tags", b10);
                                    }
                                    messageSharedPrefs.a(result.remain);
                                    messageSharedPrefs.a("tag_del_", result.interval);
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                            try {
                                try {
                                    z10 = result.status.equals(ITagManager.SUCCESS);
                                } catch (Exception e11) {
                                    e = e11;
                                    result2 = result;
                                    UPLog.e("TagManager", e);
                                    result = result2;
                                    uPushTagCallback.onMessage(z10, result);
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    result2 = result;
                                    try {
                                        UPLog.e("TagManager", th);
                                        try {
                                            uPushTagCallback.onMessage(false, result2);
                                            return;
                                        } catch (Throwable th6) {
                                            UPLog.e("TagManager", th6);
                                            return;
                                        }
                                    } finally {
                                        try {
                                            uPushTagCallback.onMessage(false, result2);
                                        } catch (Throwable th7) {
                                            UPLog.e("TagManager", th7);
                                        }
                                    }
                                }
                                uPushTagCallback.onMessage(z10, result);
                                return;
                            } catch (Throwable th8) {
                                UPLog.e("TagManager", th8);
                                return;
                            }
                        }
                        UPLog.e("TagManager", "No tags.");
                        result2.setErrors("No tags.");
                        try {
                            uPushTagCallback.onMessage(true, result2);
                        } catch (Throwable th9) {
                            UPLog.e("TagManager", th9);
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                }
            }
        });
    }

    public void getTags(final UPushTagCallback<List<String>> uPushTagCallback) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.3
            @Override // java.lang.Runnable
            public final void run() {
                boolean z10;
                Pair pair;
                ArrayList arrayList = new ArrayList();
                boolean z11 = false;
                try {
                    if (!MessageSharedPrefs.getInstance(y.a()).a("tag_add_")) {
                        UPLog.e("TagManager", "interval limit");
                    } else if (TagManager.b()) {
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                        } catch (Throwable th) {
                            UPLog.e("TagManager", th);
                        }
                    } else {
                        try {
                            if (!TagManager.a()) {
                                try {
                                    be unused = TagManager.this.f12246a;
                                    JSONObject d10 = TagManager.d();
                                    Application a10 = y.a();
                                    JSONObject a11 = g.a(d10, "https://msg.umengcloud.com/v3/tag/get", UMUtils.getAppkey(a10));
                                    if (a11 == null) {
                                        pair = new Pair(Boolean.FALSE, null);
                                    } else {
                                        ITagManager.Result result = new ITagManager.Result(a11);
                                        boolean equals = TextUtils.equals(result.status, ITagManager.SUCCESS);
                                        if (equals) {
                                            MessageSharedPrefs messageSharedPrefs = MessageSharedPrefs.getInstance(a10);
                                            messageSharedPrefs.a(result.remain);
                                            messageSharedPrefs.a("tag_get_", result.interval);
                                            String optString = a11.optString("tags");
                                            if (optString.length() > 0) {
                                                String[] split = optString.split(",");
                                                List asList = Arrays.asList(split);
                                                messageSharedPrefs.f11344b.a("tags");
                                                messageSharedPrefs.a(split);
                                                pair = new Pair(Boolean.TRUE, asList);
                                            }
                                        }
                                        pair = new Pair(Boolean.valueOf(equals), null);
                                    }
                                    z10 = ((Boolean) pair.first).booleanValue();
                                } catch (Exception e10) {
                                    e = e10;
                                    z10 = false;
                                }
                                try {
                                    List list = (List) pair.second;
                                    if (list != null && !list.isEmpty()) {
                                        arrayList.addAll(list);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    UPLog.e("TagManager", "getTags error:", e);
                                    uPushTagCallback.onMessage(z10, arrayList);
                                    return;
                                }
                                try {
                                    uPushTagCallback.onMessage(z10, arrayList);
                                    return;
                                } catch (Throwable th2) {
                                    UPLog.e("TagManager", th2);
                                    return;
                                }
                            }
                            try {
                                uPushTagCallback.onMessage(false, arrayList);
                            } catch (Throwable th3) {
                                UPLog.e("TagManager", th3);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z11 = z10;
                            try {
                                UPLog.e("TagManager", th);
                                try {
                                    uPushTagCallback.onMessage(z11, arrayList);
                                } catch (Throwable th5) {
                                    UPLog.e("TagManager", th5);
                                }
                            } finally {
                                try {
                                    uPushTagCallback.onMessage(z11, arrayList);
                                } catch (Throwable th6) {
                                    UPLog.e("TagManager", th6);
                                }
                            }
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        });
    }

    public static /* synthetic */ boolean a() {
        if (TextUtils.isEmpty(d.o(y.a()))) {
            UPLog.e("TagManager", "utdid empty.");
            return true;
        } else if (f.b()) {
            UPLog.i("TagManager", "check tag failed, silent mode!");
            return true;
        } else if (TextUtils.isEmpty(PushAgent.getInstance(y.a()).getRegistrationId())) {
            UPLog.e("TagManager", "deviceToken empty.");
            return true;
        } else {
            return false;
        }
    }
}

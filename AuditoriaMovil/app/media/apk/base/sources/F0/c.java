package F0;

import A.f;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {
    public static final Object f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static c f1111g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1112a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1113b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f1114c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f1115d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final a f1116e;

    public c(Context context) {
        this.f1112a = context;
        this.f1116e = new a(this, context.getMainLooper(), 0);
    }

    public static c a(Context context) {
        c cVar;
        synchronized (f) {
            try {
                if (f1111g == null) {
                    f1111g = new c(context.getApplicationContext());
                }
                cVar = f1111g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final boolean b(Intent intent) {
        Object[] objArr;
        ArrayList arrayList;
        int i7;
        String str;
        boolean z7;
        String str2;
        synchronized (this.f1113b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f1112a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z8 = true;
                boolean z9 = false;
                if ((intent.getFlags() & 8) != 0) {
                    objArr = 1;
                } else {
                    objArr = null;
                }
                if (objArr != null) {
                    Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList2 = (ArrayList) this.f1114c.get(intent.getAction());
                if (arrayList2 != null) {
                    if (objArr != null) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList2);
                    }
                    ArrayList arrayList3 = null;
                    int i8 = 0;
                    while (i8 < arrayList2.size()) {
                        b bVar = (b) arrayList2.get(i8);
                        if (objArr != null) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + bVar.f1107a);
                        }
                        if (bVar.f1109c) {
                            if (objArr != null) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z7 = z8;
                        } else {
                            String str3 = action;
                            arrayList = arrayList2;
                            i7 = i8;
                            str = action;
                            z7 = z8;
                            int match = bVar.f1107a.match(str3, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (match >= 0) {
                                if (objArr != null) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(bVar);
                                bVar.f1109c = z7;
                            } else if (objArr != null) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str2 = "unknown reason";
                                            } else {
                                                str2 = "type";
                                            }
                                        } else {
                                            str2 = "data";
                                        }
                                    } else {
                                        str2 = "action";
                                    }
                                } else {
                                    str2 = "category";
                                }
                                Log.v("LocalBroadcastManager", "  Filter did not match: " + str2);
                            }
                        }
                        i8 = i7 + 1;
                        z8 = z7;
                        arrayList2 = arrayList;
                        action = str;
                        z9 = false;
                    }
                    boolean z10 = z8;
                    if (arrayList3 != null) {
                        for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                            ((b) arrayList3.get(i9)).f1109c = false;
                        }
                        this.f1115d.add(new f(10, intent, arrayList3));
                        if (!this.f1116e.hasMessages(z10 ? 1 : 0)) {
                            this.f1116e.sendEmptyMessage(z10 ? 1 : 0);
                        }
                        return z10;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

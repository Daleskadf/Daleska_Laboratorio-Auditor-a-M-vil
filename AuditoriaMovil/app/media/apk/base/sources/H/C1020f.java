package h;

import a.AbstractC0412a;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import g.C0996a;
import g.C1001f;
import g.C1002g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import m6.AbstractC1446g;
import m6.AbstractC1447h;
import m6.AbstractC1449j;
import m6.p;
import m6.q;
import m6.s;
import z0.AbstractActivityC2064y;
/* renamed from: h.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020f extends AbstractC0412a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11150a;

    public /* synthetic */ C1020f(int i7) {
        this.f11150a = i7;
    }

    @Override // a.AbstractC0412a
    public final Object Q(Intent intent, int i7) {
        List arrayList;
        boolean z7;
        switch (this.f11150a) {
            case 0:
                if (i7 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data == null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data2 = intent.getData();
                    if (data2 != null) {
                        linkedHashSet.add(data2);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData == null && linkedHashSet.isEmpty()) {
                        arrayList = p.f14074a;
                    } else {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i8 = 0; i8 < itemCount; i8++) {
                                Uri uri = clipData.getItemAt(i8).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        arrayList = new ArrayList(linkedHashSet);
                    }
                    return (Uri) AbstractC1447h.P(arrayList);
                }
                return data;
            case 1:
                q qVar = q.f14075a;
                if (i7 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i9 : intArrayExtra) {
                            if (i9 == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            arrayList2.add(Boolean.valueOf(z7));
                        }
                        ArrayList O7 = AbstractC1446g.O(stringArrayExtra);
                        Iterator it = O7.iterator();
                        Iterator it2 = arrayList2.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(AbstractC1449j.M(O7), AbstractC1449j.M(arrayList2)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new l6.d(it.next(), it2.next()));
                        }
                        return s.T(arrayList3);
                    }
                    return qVar;
                }
                return qVar;
            case 2:
                return new C0996a(intent, i7);
            default:
                return new C0996a(intent, i7);
        }
    }

    @Override // a.AbstractC0412a
    public final Intent g(AbstractActivityC2064y abstractActivityC2064y, Intent input) {
        Bundle bundleExtra;
        switch (this.f11150a) {
            case 0:
                return j0(abstractActivityC2064y, (C1002g) input);
            case 1:
                String[] input2 = (String[]) input;
                j.e(input2, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
                j.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                j.e(input, "input");
                return input;
            default:
                C1001f c1001f = (C1001f) input;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = c1001f.f11081b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c1001f = new C1001f(c1001f.f11080a, null, c1001f.f11082c, c1001f.f11083d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c1001f);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r0 >= 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent j0(android.app.Activity r3, g.C1002g r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.j.e(r3, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.j.e(r4, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L11
            goto L1c
        L11:
            r1 = 30
            if (r0 < r1) goto L2e
            int r0 = B5.AbstractC0047u.C()
            r1 = 2
            if (r0 < r1) goto L2e
        L1c:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r3.<init>(r0)
            h.e r4 = r4.f11084a
            java.lang.String r4 = android.support.v4.media.session.a.r(r4)
            r3.setType(r4)
            goto Lba
        L2e:
            android.content.pm.ResolveInfo r0 = android.support.v4.media.session.a.q(r3)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L64
            android.content.pm.ResolveInfo r3 = android.support.v4.media.session.a.q(r3)
            if (r3 == 0) goto L5e
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r3 = r3.name
            r0.setClassName(r1, r3)
            h.e r3 = r4.f11084a
            java.lang.String r3 = android.support.v4.media.session.a.r(r3)
            r0.setType(r3)
        L5c:
            r3 = r0
            goto Lba
        L5e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L64:
            android.content.pm.ResolveInfo r0 = android.support.v4.media.session.a.o(r3)
            if (r0 == 0) goto L92
            android.content.pm.ResolveInfo r3 = android.support.v4.media.session.a.o(r3)
            if (r3 == 0) goto L8c
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.provider.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r3 = r3.name
            r0.setClassName(r1, r3)
            h.e r3 = r4.f11084a
            java.lang.String r3 = android.support.v4.media.session.a.r(r3)
            r0.setType(r3)
            goto L5c
        L8c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L92:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r3.<init>(r0)
            h.e r4 = r4.f11084a
            java.lang.String r4 = android.support.v4.media.session.a.r(r4)
            r3.setType(r4)
            java.lang.String r4 = r3.getType()
            if (r4 != 0) goto Lba
        */
        //  java.lang.String r4 = "*/*"
        /*
            r3.setType(r4)
            java.lang.String r4 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r3.putExtra(r0, r4)
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1020f.j0(android.app.Activity, g.g):android.content.Intent");
    }

    @Override // a.AbstractC0412a
    public F2.c u(AbstractActivityC2064y abstractActivityC2064y, Intent intent) {
        switch (this.f11150a) {
            case 0:
                j.e((C1002g) intent, "input");
                return null;
            case 1:
                String[] input = (String[]) intent;
                j.e(input, "input");
                if (input.length == 0) {
                    return new F2.c(q.f14075a);
                }
                for (String str : input) {
                    if (X.d.checkSelfPermission(abstractActivityC2064y, str) != 0) {
                        return null;
                    }
                }
                int O7 = s.O(input.length);
                if (O7 < 16) {
                    O7 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(O7);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new F2.c(linkedHashMap);
            default:
                return super.u(abstractActivityC2064y, intent);
        }
    }
}

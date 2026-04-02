package h;

import a.AbstractC0412a;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import g.C1002g;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.j;
import m6.p;
import z0.AbstractActivityC2064y;
/* renamed from: h.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015a extends AbstractC0412a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11146a;

    public C1015a(int i7) {
        this.f11146a = i7;
        if (i7 > 1) {
            return;
        }
        throw new IllegalArgumentException("Max items must be higher than 1");
    }

    @Override // a.AbstractC0412a
    public final Object Q(Intent intent, int i7) {
        if (i7 != -1) {
            intent = null;
        }
        p pVar = p.f14074a;
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null || !linkedHashSet.isEmpty()) {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i8 = 0; i8 < itemCount; i8++) {
                        Uri uri = clipData.getItemAt(i8).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
            return pVar;
        }
        return pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0 >= 2) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // a.AbstractC0412a
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent g(android.app.Activity r5, g.C1002g r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.j.e(r5, r0)
            java.lang.String r0 = "input"
            kotlin.jvm.internal.j.e(r6, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L14
        L12:
            r0 = r3
            goto L21
        L14:
            r1 = 30
            if (r0 < r1) goto L20
            int r0 = B5.AbstractC0047u.C()
            r1 = 2
            if (r0 < r1) goto L20
            goto L12
        L20:
            r0 = r2
        L21:
            int r1 = r4.f11146a
            if (r0 == 0) goto L4a
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r5.<init>(r0)
            h.e r6 = r6.f11084a
            java.lang.String r6 = android.support.v4.media.session.a.r(r6)
            r5.setType(r6)
            int r6 = B5.AbstractC0029b.a()
            if (r1 > r6) goto L42
            java.lang.String r6 = "android.provider.extra.PICK_IMAGES_MAX"
            r5.putExtra(r6, r1)
            goto Ldb
        L42:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Max items must be less or equals MediaStore.getPickImagesMaxLimit()"
            r5.<init>(r6)
            throw r5
        L4a:
            android.content.pm.ResolveInfo r0 = android.support.v4.media.session.a.q(r5)
            if (r0 == 0) goto L51
            r2 = r3
        L51:
            java.lang.String r0 = "Required value was null."
            if (r2 == 0) goto L83
            android.content.pm.ResolveInfo r5 = android.support.v4.media.session.a.q(r5)
            if (r5 == 0) goto L7d
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r2)
            android.content.pm.ApplicationInfo r2 = r5.applicationInfo
            java.lang.String r2 = r2.packageName
            java.lang.String r5 = r5.name
            r0.setClassName(r2, r5)
            h.e r5 = r6.f11084a
            java.lang.String r5 = android.support.v4.media.session.a.r(r5)
            r0.setType(r5)
            java.lang.String r5 = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX"
            r0.putExtra(r5, r1)
            r5 = r0
            goto Ldb
        L7d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L83:
            android.content.pm.ResolveInfo r2 = android.support.v4.media.session.a.o(r5)
            if (r2 == 0) goto Lae
            android.content.pm.ResolveInfo r5 = android.support.v4.media.session.a.o(r5)
            if (r5 == 0) goto La8
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "com.google.android.gms.provider.action.PICK_IMAGES"
            r6.<init>(r0)
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo
            java.lang.String r0 = r0.packageName
            java.lang.String r5 = r5.name
            r6.setClassName(r0, r5)
            java.lang.String r5 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"
            r6.putExtra(r5, r1)
            r5 = r6
            goto Ldb
        La8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        Lae:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r5.<init>(r0)
            h.e r6 = r6.f11084a
            java.lang.String r6 = android.support.v4.media.session.a.r(r6)
            r5.setType(r6)
            java.lang.String r6 = "android.intent.extra.ALLOW_MULTIPLE"
            r5.putExtra(r6, r3)
            java.lang.String r6 = r5.getType()
            if (r6 != 0) goto Ldb
        */
        //  java.lang.String r6 = "*/*"
        /*
            r5.setType(r6)
            java.lang.String r6 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r6 = new java.lang.String[]{r6, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r5.putExtra(r0, r6)
        Ldb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1015a.g(android.app.Activity, g.g):android.content.Intent");
    }

    @Override // a.AbstractC0412a
    public final F2.c u(AbstractActivityC2064y abstractActivityC2064y, Intent intent) {
        C1002g input = (C1002g) intent;
        j.e(input, "input");
        return null;
    }
}

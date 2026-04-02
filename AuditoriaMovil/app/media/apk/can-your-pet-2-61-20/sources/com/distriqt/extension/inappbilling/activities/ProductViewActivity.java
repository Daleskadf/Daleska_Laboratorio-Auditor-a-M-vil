package com.distriqt.extension.inappbilling.activities;

import android.app.Activity;
import android.content.Intent;
import com.distriqt.extension.inappbilling.InAppBilling;
import com.distriqt.extension.inappbilling.events.ProductViewEvent;
import com.distriqt.extension.inappbilling.utils.Logger;
/* loaded from: classes.dex */
public class ProductViewActivity extends Activity {
    public static final int REQUEST_CODE = 12342;
    public static final String TAG = "ProductViewActivity";

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[Catch: Exception -> 0x00f7, TryCatch #0 {Exception -> 0x00f7, blocks: (B:3:0x0011, B:12:0x0047, B:13:0x0066, B:15:0x006c, B:17:0x0080, B:24:0x00e4, B:26:0x00ed, B:18:0x0096, B:19:0x00b5, B:21:0x00bb, B:23:0x00cf, B:6:0x0038), top: B:31:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[Catch: Exception -> 0x00f7, TryCatch #0 {Exception -> 0x00f7, blocks: (B:3:0x0011, B:12:0x0047, B:13:0x0066, B:15:0x006c, B:17:0x0080, B:24:0x00e4, B:26:0x00ed, B:18:0x0096, B:19:0x00b5, B:21:0x00bb, B:23:0x00cf, B:6:0x0038), top: B:31:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ed A[Catch: Exception -> 0x00f7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00f7, blocks: (B:3:0x0011, B:12:0x0047, B:13:0x0066, B:15:0x006c, B:17:0x0080, B:24:0x00e4, B:26:0x00ed, B:18:0x0096, B:19:0x00b5, B:21:0x00bb, B:23:0x00cf, B:6:0x0038), top: B:31:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = "market://details?id="
            java.lang.String r1 = "appmarket://details?id="
            super.onCreate(r8)
            java.lang.String r8 = com.distriqt.extension.inappbilling.activities.ProductViewActivity.TAG
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "onCreate()"
            com.distriqt.extension.inappbilling.utils.Logger.d(r8, r4, r3)
            android.content.Intent r8 = r7.getIntent()     // Catch: java.lang.Exception -> Lf7
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> Lf7
            java.lang.String r3 = "service"
            java.lang.String r8 = r8.getString(r3)     // Catch: java.lang.Exception -> Lf7
            android.content.Context r3 = r7.getApplicationContext()     // Catch: java.lang.Exception -> Lf7
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Exception -> Lf7
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> Lf7
            java.lang.String r5 = "android.intent.action.VIEW"
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lf7
            int r5 = r8.hashCode()     // Catch: java.lang.Exception -> Lf7
            r6 = 1793737948(0x6aea44dc, float:1.4160691E26)
            if (r5 == r6) goto L38
            goto L42
        L38:
            java.lang.String r5 = "huawei_app_gallery"
            boolean r8 = r8.equals(r5)     // Catch: java.lang.Exception -> Lf7
            if (r8 == 0) goto L42
            r8 = 0
            goto L43
        L42:
            r8 = -1
        L43:
            r5 = 337641472(0x14200000, float:8.077936E-27)
            if (r8 == 0) goto L96
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf7
            r8.<init>(r0)     // Catch: java.lang.Exception -> Lf7
            r8.append(r3)     // Catch: java.lang.Exception -> Lf7
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Lf7
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> Lf7
            r4.setData(r8)     // Catch: java.lang.Exception -> Lf7
            android.content.pm.PackageManager r8 = r7.getPackageManager()     // Catch: java.lang.Exception -> Lf7
            java.util.List r8 = r8.queryIntentActivities(r4, r2)     // Catch: java.lang.Exception -> Lf7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> Lf7
        L66:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> Lf7
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> Lf7
            java.lang.String r2 = "com.android.vending"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lf7
            if (r1 == 0) goto L66
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r0 = r0.name     // Catch: java.lang.Exception -> Lf7
            r8.<init>(r1, r0)     // Catch: java.lang.Exception -> Lf7
            r4.addFlags(r5)     // Catch: java.lang.Exception -> Lf7
            r4.setComponent(r8)     // Catch: java.lang.Exception -> Lf7
            goto Le4
        L96:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf7
            r8.<init>(r1)     // Catch: java.lang.Exception -> Lf7
            r8.append(r3)     // Catch: java.lang.Exception -> Lf7
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> Lf7
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> Lf7
            r4.setData(r8)     // Catch: java.lang.Exception -> Lf7
            android.content.pm.PackageManager r8 = r7.getPackageManager()     // Catch: java.lang.Exception -> Lf7
            java.util.List r8 = r8.queryIntentActivities(r4, r2)     // Catch: java.lang.Exception -> Lf7
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> Lf7
        Lb5:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> Lf7
            if (r0 == 0) goto Le4
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> Lf7
            java.lang.String r2 = "com.huawei.appmarket"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Lf7
            if (r1 == 0) goto Lb5
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r1 = r1.packageName     // Catch: java.lang.Exception -> Lf7
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.Exception -> Lf7
            java.lang.String r0 = r0.name     // Catch: java.lang.Exception -> Lf7
            r8.<init>(r1, r0)     // Catch: java.lang.Exception -> Lf7
            r4.addFlags(r5)     // Catch: java.lang.Exception -> Lf7
            r4.setComponent(r8)     // Catch: java.lang.Exception -> Lf7
        Le4:
            r8 = 12342(0x3036, float:1.7295E-41)
            r7.startActivityForResult(r4, r8)     // Catch: java.lang.Exception -> Lf7
            com.distriqt.core.utils.IExtensionContext r8 = com.distriqt.extension.inappbilling.InAppBilling.context     // Catch: java.lang.Exception -> Lf7
            if (r8 == 0) goto Lfc
            com.distriqt.core.utils.IExtensionContext r8 = com.distriqt.extension.inappbilling.InAppBilling.context     // Catch: java.lang.Exception -> Lf7
            java.lang.String r0 = "productview:displayed"
            java.lang.String r1 = ""
            r8.dispatchEvent(r0, r1)     // Catch: java.lang.Exception -> Lf7
            goto Lfc
        Lf7:
            r8 = move-exception
            r0 = 0
            com.distriqt.extension.inappbilling.utils.Errors.handleException(r0, r8)
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.distriqt.extension.inappbilling.activities.ProductViewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Logger.d(TAG, "onActivityResult(%d,%d,...)", Integer.valueOf(i), Integer.valueOf(i2));
        if (InAppBilling.context != null) {
            InAppBilling.context.dispatchEvent(ProductViewEvent.DISMISSED, "");
        }
        finish();
    }
}

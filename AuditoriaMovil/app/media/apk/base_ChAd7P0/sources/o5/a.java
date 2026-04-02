package O5;

import A.f;
import C5.d;
import H5.b;
import K5.r;
import L5.q;
import L5.t;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import org.apache.tika.mime.MimeTypes;
/* loaded from: classes.dex */
public class a implements b, I5.a, t {

    /* renamed from: a  reason: collision with root package name */
    public final PackageManager f3863a;

    /* renamed from: b  reason: collision with root package name */
    public I5.b f3864b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap f3865c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f3866d = new HashMap();

    public a(f fVar) {
        this.f3863a = (PackageManager) fVar.f10b;
        fVar.f11c = this;
    }

    public final void a(String str, String str2, boolean z7, r rVar) {
        if (this.f3864b == null) {
            rVar.b(null, "error", "Plugin not bound to an Activity");
            return;
        }
        HashMap hashMap = this.f3865c;
        if (hashMap == null) {
            rVar.b(null, "error", "Can not process text actions before calling queryTextActions");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            rVar.b(null, "error", "Text processing activity not found");
            return;
        }
        int hashCode = rVar.hashCode();
        this.f3866d.put(Integer.valueOf(hashCode), rVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z7);
        ((d) this.f3864b).f571a.startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f3865c;
        PackageManager packageManager = this.f3863a;
        if (hashMap == null) {
            this.f3865c = new HashMap();
            int i7 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeTypes.PLAIN_TEXT);
            if (i7 >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f3865c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f3865c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f3865c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // L5.t
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        String str;
        HashMap hashMap = this.f3866d;
        if (!hashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        if (i8 == -1) {
            str = intent.getStringExtra("android.intent.extra.PROCESS_TEXT");
        } else {
            str = null;
        }
        ((q) hashMap.remove(Integer.valueOf(i7))).a(str);
        return true;
    }

    @Override // I5.a
    public final void onAttachedToActivity(I5.b bVar) {
        this.f3864b = bVar;
        ((d) bVar).a(this);
    }

    @Override // I5.a
    public final void onDetachedFromActivity() {
        ((d) this.f3864b).d(this);
        this.f3864b = null;
    }

    @Override // I5.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((d) this.f3864b).d(this);
        this.f3864b = null;
    }

    @Override // I5.a
    public final void onReattachedToActivityForConfigChanges(I5.b bVar) {
        this.f3864b = bVar;
        ((d) bVar).a(this);
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
    }
}

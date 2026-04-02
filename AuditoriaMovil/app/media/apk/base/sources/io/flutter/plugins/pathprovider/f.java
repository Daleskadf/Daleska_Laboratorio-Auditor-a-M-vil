package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f implements H5.b {

    /* renamed from: a  reason: collision with root package name */
    public Context f12391a;

    public final ArrayList a(d dVar) {
        String str;
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        Context context = this.f12391a;
        switch (e.f12390a[dVar.ordinal()]) {
            case 1:
                str = null;
                break;
            case 2:
                str = "music";
                break;
            case 3:
                str = "podcasts";
                break;
            case 4:
                str = "ringtones";
                break;
            case 5:
                str = "alarms";
                break;
            case 6:
                str = "notifications";
                break;
            case 7:
                str = "pictures";
                break;
            case 8:
                str = "movies";
                break;
            case 9:
                str = "downloads";
                break;
            case 10:
                str = "dcim";
                break;
            case 11:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + dVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // H5.b
    public final void onAttachedToEngine(H5.a aVar) {
        try {
            b.n(aVar.f2030b, this);
        } catch (Exception e7) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e7);
        }
        this.f12391a = aVar.f2029a;
    }

    @Override // H5.b
    public final void onDetachedFromEngine(H5.a aVar) {
        b.n(aVar.f2030b, null);
    }
}

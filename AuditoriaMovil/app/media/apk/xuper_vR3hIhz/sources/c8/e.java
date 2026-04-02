package c8;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class e extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public Map f5642a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public boolean f5643b;

    public boolean O2(String str) {
        return this.f5642a.containsKey(str);
    }

    public PublishSubject P2(String str) {
        return (PublishSubject) this.f5642a.get(str);
    }

    public boolean Q2(String str) {
        int checkSelfPermission;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            checkSelfPermission = activity.checkSelfPermission(str);
            if (checkSelfPermission == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    public boolean R2(String str) {
        boolean isPermissionRevokedByPolicy;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            isPermissionRevokedByPolicy = activity.getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
            return isPermissionRevokedByPolicy;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    public void S2(String str) {
        if (this.f5643b) {
            String str2 = b.f5629b;
        }
    }

    public void T2(String[] strArr, int[] iArr, boolean[] zArr) {
        boolean z10;
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            S2("onRequestPermissionsResult  " + strArr[i10]);
            PublishSubject publishSubject = (PublishSubject) this.f5642a.get(strArr[i10]);
            if (publishSubject == null) {
                Log.e(b.f5629b, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.f5642a.remove(strArr[i10]);
            if (iArr[i10] == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            publishSubject.onNext(new a(strArr[i10], z10, zArr[i10]));
            publishSubject.onComplete();
        }
    }

    public void U2(String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public void V2(String str, PublishSubject publishSubject) {
        this.f5642a.put(str, publishSubject);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            zArr[i11] = shouldShowRequestPermissionRationale(strArr[i11]);
        }
        T2(strArr, iArr, zArr);
    }
}

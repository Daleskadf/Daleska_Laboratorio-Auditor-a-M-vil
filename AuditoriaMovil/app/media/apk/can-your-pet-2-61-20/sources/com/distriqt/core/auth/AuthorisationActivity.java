package com.distriqt.core.auth;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import com.distriqt.core.auth.impl.AuthorisationBase;
/* loaded from: classes.dex */
public class AuthorisationActivity extends Activity {
    public static final String EXTRA_AUTHTYPE = "extra_authType";
    public static final String EXTRA_PERMISSIONS = "extra_permissions";
    private static final String TAG = "AuthorisationActivity";
    public static AuthorisationBase authorisation;
    private String[] _permissions;
    private String _type;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(8192, 8192);
        try {
            Bundle extras = getIntent().getExtras();
            this._permissions = extras.getStringArray(EXTRA_PERMISSIONS);
            this._type = extras.getString(EXTRA_AUTHTYPE);
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        String[] strArr = this._permissions;
        if (strArr.length == 0) {
            authorisation.onRequestPermissionsResult(11, strArr, new int[0], this._type);
            finish();
            return;
        }
        ActivityCompat.requestPermissions(this, strArr, 11);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        authorisation.onRequestPermissionsResult(i, strArr, iArr, this._type);
        finish();
    }
}

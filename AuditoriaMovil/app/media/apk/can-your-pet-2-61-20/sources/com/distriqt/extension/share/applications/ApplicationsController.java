package com.distriqt.extension.share.applications;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.share.events.ApplicationEvent;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.JSONUtils;
import com.distriqt.extension.share.utils.Logger;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class ApplicationsController extends ActivityStateListener {
    public static final int RC_START_ACTIVITY = 92832;
    public static final String TAG = "ApplicationsController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public ApplicationsController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public boolean isInstalled(String str) {
        Logger.d(TAG, "isInstalled( %s )", str);
        try {
            this._extContext.getActivity().getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean launch(String str, ApplicationOptions applicationOptions) {
        Intent intent;
        String str2 = TAG;
        Logger.d(str2, "launch( %s, [ %s, %s ] )", str, applicationOptions.action, applicationOptions.data);
        if (isInstalled(str)) {
            if (applicationOptions.data.contains("@s.whatsapp.net")) {
                try {
                    Cursor query = this._extContext.getActivity().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"_id"}, "data1=?", new String[]{applicationOptions.data}, null);
                    if (query.getCount() > 0) {
                        query.moveToFirst();
                        applicationOptions.data = "content://com.android.contacts/data/" + query.getString(0);
                        Logger.d(str2, "launch:: updated data: %s ", applicationOptions.data);
                    } else {
                        Logger.d(str2, "launch:: no matching contact found", new Object[0]);
                    }
                    query.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                if (applicationOptions.action.equals("MAIN")) {
                    intent = this._extContext.getActivity().getPackageManager().getLaunchIntentForPackage(str);
                    intent.addCategory("android.intent.category.LAUNCHER");
                } else {
                    intent = new Intent("android.intent.action." + applicationOptions.action);
                    intent.setPackage(str);
                }
                if (applicationOptions.type != null && applicationOptions.type.length() > 0) {
                    intent.setType(applicationOptions.type);
                }
                if (applicationOptions.data != null && applicationOptions.data.length() > 0) {
                    intent.setData(Uri.parse(applicationOptions.data));
                }
                for (String str3 : applicationOptions.extras.keySet()) {
                    Logger.d(TAG, "launch::extra[%s]=%s", str3, applicationOptions.extras.get(str3));
                    if (str3.equals("android.intent.extra.STREAM")) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.parse(applicationOptions.extras.get(str3)));
                    } else {
                        intent.putExtra(str3, applicationOptions.extras.get(str3));
                    }
                }
                this._extContext.getActivity().startActivity(intent);
                return true;
            } catch (Exception e2) {
                Errors.handleException(e2);
            }
        }
        return false;
    }

    private boolean isValidString(String str) {
        return str != null && str.length() > 0;
    }

    public boolean startActivity(IntentObject intentObject) {
        Logger.d(TAG, "startActivity( %s )", intentObject.toString());
        try {
            Intent intent = new Intent();
            if (isValidString(intentObject.action)) {
                intent.setAction(intentObject.action);
            }
            if (isValidString(intentObject.packageName)) {
                intent.setPackage(intentObject.packageName);
            }
            if (isValidString(intentObject.type) && isValidString(intentObject.data)) {
                intent.setDataAndType(Uri.parse(intentObject.data), intentObject.type);
            } else if (isValidString(intentObject.data)) {
                intent.setData(Uri.parse(intentObject.data));
            } else if (isValidString(intentObject.type)) {
                intent.setType(intentObject.type);
            }
            if (isValidString(intentObject.extrasJSON)) {
                intent.putExtras(JSONUtils.toBundle(new JSONObject(intentObject.extrasJSON)));
            }
            this._extContext.getActivity().startActivityForResult(intent, RC_START_ACTIVITY);
            return true;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 92832) {
            this._extContext.dispatchEvent(ApplicationEvent.ACTIVITY_RESULT, ApplicationEvent.formatForEvent(i2, intent));
        }
    }
}

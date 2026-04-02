package com.distriqt.extension.share.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.distriqt.extension.share.ShareExtension;
import com.distriqt.extension.share.controller.ShareController;
import com.distriqt.extension.share.events.ShareEvent;
import com.distriqt.extension.share.utils.Logger;
/* loaded from: classes.dex */
public class ShareActivity extends Activity {
    public static final String EXTRA_OPTIONS = "extraOptions";
    public static final int SHARE_REQUEST_CODE = 550044;
    public static final String TAG = "ShareActivity";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        ShareOptions shareOptions;
        super.onCreate(bundle);
        if (ShareController.shareIntent != null) {
            try {
                shareOptions = (ShareOptions) getIntent().getParcelableExtra(EXTRA_OPTIONS);
            } catch (Exception unused) {
                shareOptions = null;
            }
            ShareController.shareIntent.addFlags(67108864);
            startActivityForResult(Intent.createChooser(ShareController.shareIntent, shareOptions.title), 550044);
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        String str = TAG;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = (intent == null || intent.getExtras() == null) ? "" : intent.getExtras().toString();
        Logger.d(str, "onActivityResult( %d, %d, %s )", objArr);
        if (i == 550044) {
            if (i2 != 0) {
                ShareExtension.context.dispatchStatusEventAsync(ShareEvent.COMPLETE, ShareEvent.formatActivityForEvent(""));
            } else {
                ShareExtension.context.dispatchStatusEventAsync(ShareEvent.CANCELLED, ShareEvent.formatErrorForEvent("", ""));
            }
        }
        ShareExtension.context.dispatchStatusEventAsync(ShareEvent.CLOSED, ShareEvent.formatActivityForEvent(""));
        ShareController.shareIntent = null;
        finish();
    }
}

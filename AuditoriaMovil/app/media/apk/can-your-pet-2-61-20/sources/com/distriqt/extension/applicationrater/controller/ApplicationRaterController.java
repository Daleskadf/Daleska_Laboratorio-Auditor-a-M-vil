package com.distriqt.extension.applicationrater.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.applicationrater.events.ApplicationIDEvent;
import com.distriqt.extension.applicationrater.events.ApplicationRaterEvent;
import com.distriqt.extension.applicationrater.utils.Errors;
import com.distriqt.extension.applicationrater.utils.Logger;
/* loaded from: classes.dex */
public class ApplicationRaterController {
    public static String AMAZON_APPSTORE_URL = "amzn://apps/android?p=";
    public static String AMAZON_INSTALLER_PACKAGE = "com.amazon.venezia";
    public static String GOOGLE_APPSTORE_URL = "market://details?id=";
    public static String GOOGLE_INSTALLER_PACKAGE = "com.android.vending";
    public static String HUAWEI_APPSTORE_URL = "appmarket://details?id=";
    public static String HUAWEI_INSTALLER_PACKAGE = "com.huawei.appmarket";
    public static String SAMSUNG_GALAXY_URL = "samsungapps://AppRating/";
    public static String SAMSUNG_INSTALLER_PACKAGE = "com.sec.android.app.samsungapps";
    public static final String STORE_AMAZON = "amazon";
    public static final String STORE_DEFAULT = "default";
    public static final String STORE_GOOGLEPLAY = "googleplay";
    public static final String STORE_HUAWEIAPPGALLERY = "huaweiappgallery";
    public static final String STORE_SAMSUNGGALAXY = "samsung";
    public static final String STORE_UNKNOWN = "unknown";
    public static final String TAG = "ApplicationRaterController";
    private static Dialog rateDialog;
    private IExtensionContext _extContext;
    private ReviewController _reviewController;

    public ApplicationRaterController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
        rateDialog = null;
    }

    public void dispose() {
        dismissRateDialog();
    }

    private int getThemeId(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 3075958) {
            if (str.equals("dark")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 102970646) {
            if (hashCode == 1544803905 && str.equals("default")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("light")) {
                c = 3;
            }
            c = 65535;
        }
        return c != 3 ? 16974126 : 16974130;
    }

    public void showRateDialog(final String str, final String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            dismissRateDialog();
            float f = this._extContext.getActivity().getResources().getDisplayMetrics().density;
            int i = (int) ((20.0f * f) + 0.5f);
            Logger.d(TAG, "showRateDialog(): padding: %d, scale: %f", Integer.valueOf(i), Float.valueOf(f));
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this._extContext.getActivity(), getThemeId(str8));
            LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(i, 0, i, i);
            Button button = new Button(contextThemeWrapper);
            button.setText(str5);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.applicationrater.controller.ApplicationRaterController.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ApplicationRaterController.this.rate(str, str2);
                    ApplicationRaterController.this._extContext.dispatchEvent(ApplicationRaterEvent.SELECTED_RATE, "");
                    ApplicationRaterController.this.dismissRateDialog();
                }
            });
            linearLayout.addView(button);
            Button button2 = new Button(contextThemeWrapper);
            button2.setText(str7);
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.applicationrater.controller.ApplicationRaterController.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ApplicationRaterController.this._extContext.dispatchEvent(ApplicationRaterEvent.SELECTED_LATER, "");
                    ApplicationRaterController.this.dismissRateDialog();
                }
            });
            linearLayout.addView(button2);
            Button button3 = new Button(contextThemeWrapper);
            button3.setText(str6);
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.applicationrater.controller.ApplicationRaterController.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ApplicationRaterController.this._extContext.dispatchEvent(ApplicationRaterEvent.SELECTED_DECLINE, "");
                    ApplicationRaterController.this.dismissRateDialog();
                }
            });
            linearLayout.addView(button3);
            AlertDialog.Builder builder = new AlertDialog.Builder(contextThemeWrapper);
            builder.setTitle(str3);
            builder.setMessage(str4);
            builder.setView(linearLayout);
            builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.distriqt.extension.applicationrater.controller.ApplicationRaterController.4
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    ApplicationRaterController.this._extContext.dispatchEvent(ApplicationRaterEvent.CANCELLED, "");
                    Dialog unused = ApplicationRaterController.rateDialog = null;
                }
            });
            AlertDialog create = builder.create();
            rateDialog = create;
            create.show();
            this._extContext.dispatchEvent(ApplicationRaterEvent.DIALOG_DISPLAYED, "");
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public void dismissRateDialog() {
        Dialog dialog = rateDialog;
        if (dialog != null) {
            dialog.dismiss();
            rateDialog = null;
        }
    }

    public void rate(String str, String str2) {
        Logger.d(TAG, "rate( %s, %s )", str, str2);
        try {
            Intent rateIntentForApplication = getRateIntentForApplication(str, str2);
            if (rateIntentForApplication != null) {
                this._extContext.getActivity().startActivity(rateIntentForApplication);
            }
        } catch (Exception e) {
            Errors.handleException(e);
        }
    }

    public String getInstallerStore() {
        Logger.d(TAG, "getInstallerStore()", new Object[0]);
        try {
            String installerPackageName = this._extContext.getActivity().getPackageManager().getInstallerPackageName(this._extContext.getActivity().getPackageName());
            return AMAZON_INSTALLER_PACKAGE.equals(installerPackageName) ? STORE_AMAZON : GOOGLE_INSTALLER_PACKAGE.equals(installerPackageName) ? STORE_GOOGLEPLAY : HUAWEI_INSTALLER_PACKAGE.equals(installerPackageName) ? STORE_HUAWEIAPPGALLERY : SAMSUNG_INSTALLER_PACKAGE.equals(installerPackageName) ? STORE_SAMSUNGGALAXY : "unknown";
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
        }
    }

    public void retrieveApplicationId() {
        Logger.d(TAG, "retrieveApplicationId()", new Object[0]);
        this._extContext.dispatchEvent(ApplicationIDEvent.RETRIEVED, ApplicationIDEvent.formatForEvent(this._extContext.getActivity().getPackageName()));
    }

    public ReviewController reviewController() {
        if (this._reviewController == null) {
            this._reviewController = new ReviewController(this._extContext);
        }
        return this._reviewController;
    }

    private Intent getRateIntentForApplication(String str, String str2) {
        Logger.d(TAG, "getRateIntentForApplication( %s, %s )", str, str2);
        if (STORE_AMAZON.equals(str2)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(AMAZON_APPSTORE_URL + str));
        } else if (STORE_GOOGLEPLAY.equals(str2)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(GOOGLE_APPSTORE_URL + str));
        } else if (STORE_HUAWEIAPPGALLERY.equals(str2)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(HUAWEI_APPSTORE_URL + str));
        } else if (STORE_SAMSUNGGALAXY.equals(str2)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(SAMSUNG_GALAXY_URL + str));
        } else if ("unknown".equals(str2)) {
            return getRateIntentForApplication(str, STORE_GOOGLEPLAY);
        } else {
            return getRateIntentForApplication(str, getInstallerStore());
        }
    }
}

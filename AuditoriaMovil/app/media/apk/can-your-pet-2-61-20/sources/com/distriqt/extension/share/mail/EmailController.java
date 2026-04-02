package com.distriqt.extension.share.mail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Html;
import com.distriqt.core.ActivityStateListener;
import com.distriqt.core.utils.FileProviderUtils;
import com.distriqt.core.utils.IExtensionContext;
import com.distriqt.extension.share.content.ShareFileProvider;
import com.distriqt.extension.share.events.MessageEvent;
import com.distriqt.extension.share.utils.Errors;
import com.distriqt.extension.share.utils.Logger;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class EmailController extends ActivityStateListener {
    public static final String EMAIL_INTENT_TYPE = "message/rfc822";
    public static final int SEND_MAIL_REQUEST_CODE = 550044;
    public static final String TAG = "EmailController";
    private IExtensionContext _extContext;

    public void dispose() {
    }

    public EmailController(IExtensionContext iExtensionContext) {
        this._extContext = iExtensionContext;
    }

    public boolean isMailSupported() {
        try {
            PackageManager packageManager = this._extContext.getActivity().getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(EMAIL_INTENT_TYPE);
            return packageManager.queryIntentActivities(intent, 65600).size() != 0;
        } catch (Exception e) {
            Errors.handleException(e);
            return false;
        }
    }

    public boolean sendMail(String str, String str2, String[] strArr) {
        Logger.d(TAG, "sendMail( %s, %s, %s )", str, str2, Arrays.toString(strArr));
        MailOptions mailOptions = new MailOptions();
        mailOptions.setSubject(str);
        mailOptions.setBody(str2);
        mailOptions.setRecipients(strArr);
        this._extContext.getActivity().startActivityForResult(Intent.createChooser(fromOptions(this._extContext.getActivity(), mailOptions), mailOptions.getTitle()), 550044);
        return true;
    }

    public boolean sendMailWithOptions(String str, String str2, String[] strArr, String[] strArr2, String[] strArr3, ArrayList<MessageAttachment> arrayList, boolean z, boolean z2) {
        Logger.d(TAG, "sendMailWithOptions( %s, %s, %s )", str, str2, Arrays.toString(strArr));
        MailOptions mailOptions = new MailOptions();
        mailOptions.setSubject(str);
        mailOptions.setBody(str2);
        mailOptions.setRecipients(strArr);
        mailOptions.setCcRecipients(strArr2);
        mailOptions.setBccRecipients(strArr3);
        mailOptions.setHtml(z);
        if (arrayList != null && arrayList.size() > 0) {
            mailOptions.setAttachments(arrayList);
        }
        Intent fromOptions = fromOptions(this._extContext.getActivity(), mailOptions);
        if (z2) {
            this._extContext.getActivity().startActivityForResult(Intent.createChooser(fromOptions, mailOptions.getTitle()), 550044);
        } else {
            this._extContext.getActivity().startActivityForResult(fromOptions, 550044);
        }
        return true;
    }

    @Override // com.distriqt.core.ActivityStateListener
    public void onActivityResult(int i, int i2, Intent intent) {
        IExtensionContext iExtensionContext;
        Logger.d(TAG, "onActivityResult(%d,%d,...)", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i != 550044 || (iExtensionContext = this._extContext) == null) {
            return;
        }
        iExtensionContext.dispatchEvent(MessageEvent.MESSAGE_MAIL_COMPOSE, MessageEvent.MESSAGE_MAIL_COMPOSE_COMPLETE);
    }

    public static Intent fromOptions(Activity activity, MailOptions mailOptions) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(67108864);
        intent.setType(EMAIL_INTENT_TYPE);
        intent.putExtra("android.intent.extra.EMAIL", mailOptions.getRecipients());
        intent.putExtra("android.intent.extra.SUBJECT", mailOptions.getSubject());
        if (mailOptions.isHtml()) {
            intent.putExtra("android.intent.extra.TEXT", Html.fromHtml(mailOptions.getBody()));
        } else {
            intent.putExtra("android.intent.extra.TEXT", mailOptions.getBody());
        }
        if (mailOptions.getCcRecipients().length >= 1) {
            intent.putExtra("android.intent.extra.CC", mailOptions.getCcRecipients());
        }
        if (mailOptions.getBccRecipients().length >= 1) {
            intent.putExtra("android.intent.extra.BCC", mailOptions.getBccRecipients());
        }
        if (mailOptions.getAttachments() != null && mailOptions.getAttachments().size() > 0) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            for (int i = 0; i < mailOptions.getAttachments().size(); i++) {
                MessageAttachment messageAttachment = mailOptions.getAttachments().get(i);
                Logger.d(TAG, "attachment: %s", messageAttachment.nativePath);
                try {
                    Context applicationContext = activity.getApplicationContext();
                    uri = FileProviderUtils.copyFileToProviderCache(applicationContext, ShareFileProvider.authority(applicationContext), messageAttachment.nativePath, true);
                } catch (Exception e) {
                    Errors.handleException(e);
                    uri = null;
                }
                if (uri != null) {
                    try {
                        arrayList.add(uri);
                    } catch (Exception e2) {
                        Errors.handleException(e2);
                    }
                } else {
                    Logger.d(TAG, "ATTACHMENT_ERROR::File doesn't exist?", new Object[0]);
                }
            }
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        return intent;
    }
}

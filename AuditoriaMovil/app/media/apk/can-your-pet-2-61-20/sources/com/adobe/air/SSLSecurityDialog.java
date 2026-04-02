package com.adobe.air;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.net.http.SslCertificate;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.adobe.air.utils.Utils;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public class SSLSecurityDialog {
    public static final String TAG = SSLSecurityDialog.class.toString();
    private static final String USER_ACTION_TRUST_ALWAYS = "always";
    private static final String USER_ACTION_TRUST_NONE = "none";
    private static final String USER_ACTION_TRUST_SESSION = "session";
    private Condition m_condition;
    private Lock m_lock;
    private String m_useraction = null;

    public SSLSecurityDialog() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.m_lock = reentrantLock;
        this.m_condition = reentrantLock.newCondition();
    }

    public int check(long j, String str) {
        CertificateEventData certificateEventData = new CertificateEventData(j, str);
        Entrypoints.registerCertificateCallback(0, certificateEventData, null);
        return certificateEventData.waitForResult();
    }

    public String show(String str, byte[] bArr) {
        ShowSSLDialog(str, bArr, null, false);
        return this.m_useraction;
    }

    public void ShowSSLDialog(String str, byte[] bArr, SslCertificate sslCertificate, boolean z) {
        Certificate certificate;
        AndroidActivityWrapper GetAndroidActivityWrapper = AndroidActivityWrapper.GetAndroidActivityWrapper();
        Activity activity = GetAndroidActivityWrapper.getActivity();
        if (activity == null) {
            activity = GetAndroidActivityWrapper.WaitForNewActivity();
        }
        final AndroidAlertDialog androidAlertDialog = new AndroidAlertDialog(activity);
        AlertDialog.Builder GetAlertDialogBuilder = androidAlertDialog.GetAlertDialogBuilder();
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        Resources resources = activity.getResources();
        View GetLayoutView = Utils.GetLayoutView("ssl_certificate_warning", resources, layoutInflater);
        if (GetLayoutView != null) {
            Resources resources2 = GetLayoutView.getResources();
            TextView textView = (TextView) Utils.GetWidgetInViewByNameFromPackage("ServerName", resources2, GetLayoutView);
            textView.setText(((Object) textView.getText()) + " " + str);
            if (bArr != null) {
                certificate = new Certificate();
                certificate.setCertificate(bArr);
            } else {
                certificate = new Certificate(sslCertificate);
            }
            ((TextView) Utils.GetWidgetInViewByNameFromPackage("CertificateDetails", resources2, GetLayoutView)).setText(String.format(Utils.GetResourceString("IDA_CERTIFICATE_DETAILS", resources), certificate.getIssuedToCommonName(), certificate.getIssuedToOrganization(), certificate.getIssuedToOrganizationalUnit(), certificate.getIssuedByCommonName(), certificate.getIssuedByOrganization(), certificate.getIssuedByOrganizationalUnit(), certificate.getIssuedOn(), certificate.getExpiresOn()), TextView.BufferType.SPANNABLE);
            ((Button) Utils.GetWidgetInViewByNameFromPackage("NeutralButton", resources2, GetLayoutView)).setOnClickListener(new View.OnClickListener() { // from class: com.adobe.air.SSLSecurityDialog.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SSLSecurityDialog.this.SetUserAction(SSLSecurityDialog.USER_ACTION_TRUST_SESSION);
                    androidAlertDialog.dismiss();
                }
            });
            Button button = (Button) Utils.GetWidgetInViewByNameFromPackage("PositiveButton", resources2, GetLayoutView);
            if (z) {
                button.setOnClickListener(new View.OnClickListener() { // from class: com.adobe.air.SSLSecurityDialog.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        SSLSecurityDialog.this.SetUserAction("always");
                        androidAlertDialog.dismiss();
                    }
                });
                button.setVisibility(0);
            } else {
                button.setVisibility(8);
            }
            ((Button) Utils.GetWidgetInViewByNameFromPackage("NegativeButton", resources2, GetLayoutView)).setOnClickListener(new View.OnClickListener() { // from class: com.adobe.air.SSLSecurityDialog.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SSLSecurityDialog.this.SetUserAction("none");
                    androidAlertDialog.dismiss();
                }
            });
            GetAlertDialogBuilder.setView(GetLayoutView);
            GetAlertDialogBuilder.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.adobe.air.SSLSecurityDialog.4
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 4) {
                        SSLSecurityDialog.this.SetUserAction("none");
                        return false;
                    }
                    return false;
                }
            });
            activity.runOnUiThread(new Runnable() { // from class: com.adobe.air.SSLSecurityDialog.5
                @Override // java.lang.Runnable
                public void run() {
                    androidAlertDialog.show();
                    androidAlertDialog.setFullScreen();
                }
            });
            this.m_lock.lock();
            try {
                if (this.m_useraction == null) {
                    this.m_condition.await();
                }
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                this.m_lock.unlock();
                throw th;
            }
            this.m_lock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void SetUserAction(String str) {
        this.m_lock.lock();
        this.m_useraction = str;
        this.m_condition.signal();
        this.m_lock.unlock();
    }

    public String show(String str, SslCertificate sslCertificate) {
        ShowSSLDialog(str, null, sslCertificate, false);
        return this.m_useraction;
    }

    public String getUserAction() {
        return this.m_useraction;
    }
}

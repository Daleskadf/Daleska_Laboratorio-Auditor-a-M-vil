package com.distriqt.extension.adverts.platforms.huawei.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.distriqt.extension.adverts.R;
import com.distriqt.extension.adverts.controller.consent.ConsentOptions;
import com.huawei.hms.ads.consent.bean.AdProvider;
import com.huawei.hms.ads.consent.constant.ConsentStatus;
import com.huawei.hms.ads.consent.inter.Consent;
import java.util.List;
/* loaded from: classes.dex */
public class ConsentDialog extends Dialog {
    private View consentDialogView;
    private Button consentNoBtn;
    private Button consentYesBtn;
    private LinearLayout contentLayout;
    private LayoutInflater inflater;
    private TextView initInfoTv;
    private View initView;
    private ConsentDialogCallback mCallback;
    private Context mContext;
    private ConsentOptions mOptions;
    private List<AdProvider> madProviders;
    private Button moreInfoBackBtn;
    private TextView moreInfoTv;
    private View moreInfoView;
    private Button partnerListBackBtn;
    private View partnersListView;
    private TextView titleTv;

    /* loaded from: classes.dex */
    public interface ConsentDialogCallback {
        void updateConsentStatus(ConsentStatus consentStatus);
    }

    public ConsentDialog(Context context, List<AdProvider> list, ConsentOptions consentOptions) {
        super(context, R.style.dialog);
        this.mContext = context;
        this.madProviders = list;
        this.mOptions = consentOptions;
    }

    public void setCallback(ConsentDialogCallback consentDialogCallback) {
        this.mCallback = consentDialogCallback;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        LayoutInflater from = LayoutInflater.from(this.mContext);
        this.inflater = from;
        View inflate = from.inflate(R.layout.dialog_consent, (ViewGroup) null);
        this.consentDialogView = inflate;
        setContentView(inflate);
        TextView textView = (TextView) findViewById(R.id.consent_dialog_title_text);
        this.titleTv = textView;
        textView.setText(this.mOptions.dialogContent.title);
        this.initView = this.inflater.inflate(R.layout.dialog_consent_content, (ViewGroup) null);
        this.moreInfoView = this.inflater.inflate(R.layout.dialog_consent_moreinfo, (ViewGroup) null);
        this.partnersListView = this.inflater.inflate(R.layout.dialog_consent_partner_list, (ViewGroup) null);
        showInitConsentInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateConsentStatus(ConsentStatus consentStatus) {
        Consent.getInstance(this.mContext).setConsentStatus(consentStatus);
        this.mContext.getSharedPreferences("HuaweiAdsSdkSharedPreferences", 0).edit().putInt("consent", consentStatus.getValue()).commit();
        ConsentDialogCallback consentDialogCallback = this.mCallback;
        if (consentDialogCallback != null) {
            consentDialogCallback.updateConsentStatus(consentStatus);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showInitConsentInfo() {
        addContentView(this.initView);
        addInitButtonAndLinkClick(this.consentDialogView);
    }

    private void addInitButtonAndLinkClick(View view) {
        Button button = (Button) view.findViewById(R.id.btn_consent_init_yes);
        this.consentYesBtn = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConsentDialog.this.dismiss();
                ConsentDialog.this.updateConsentStatus(ConsentStatus.PERSONALIZED);
            }
        });
        Button button2 = (Button) view.findViewById(R.id.btn_consent_init_skip);
        this.consentNoBtn = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConsentDialog.this.dismiss();
                ConsentDialog.this.updateConsentStatus(ConsentStatus.NON_PERSONALIZED);
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.consent_center_init_content);
        this.initInfoTv = textView;
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.initInfoTv.setText(insertLinkIntoText(this.mOptions.dialogContent.contentText, new ClickableSpan() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                ConsentDialog.this.showTouchHereInfo();
            }
        }, "%MORE_INFO%", "here"));
        this.initInfoTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private SpannableStringBuilder insertLinkIntoText(String str, ClickableSpan clickableSpan, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.replace(str2, str3));
        if (indexOf > 0) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0000FF"));
            int i = indexOf + 4;
            spannableStringBuilder.setSpan(clickableSpan, indexOf, i, 33);
            spannableStringBuilder.setSpan(foregroundColorSpan, indexOf, i, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTouchHereInfo() {
        addContentView(this.moreInfoView);
        addMoreInfoButtonAndLinkClick(this.consentDialogView);
    }

    private void addMoreInfoButtonAndLinkClick(View view) {
        Button button = (Button) view.findViewById(R.id.btn_consent_more_info_back);
        this.moreInfoBackBtn = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConsentDialog.this.showInitConsentInfo();
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.consent_center_more_info_content);
        this.moreInfoTv = textView;
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.moreInfoTv.setText(insertLinkIntoText(this.mOptions.dialogContent.moreInfoText, new ClickableSpan() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.5
            @Override // android.text.style.ClickableSpan
            public void onClick(View view2) {
                ConsentDialog.this.showPartnersListInfo();
            }
        }, "%MORE_INFO%", "here"));
        this.moreInfoTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPartnersListInfo() {
        ((TextView) this.partnersListView.findViewById(R.id.partners_list)).setText(this.mOptions.dialogContent.mediationPartnersText);
        TextView textView = (TextView) this.partnersListView.findViewById(R.id.partners_list_content);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        textView.setText("");
        List<AdProvider> list = this.madProviders;
        if (list != null) {
            for (AdProvider adProvider : list) {
                textView.append(Html.fromHtml("<font color='#0000FF'><a href=" + adProvider.getPrivacyPolicyUrl() + ">" + adProvider.getName() + "</a>"));
                textView.append("  ");
            }
        } else {
            textView.append(" 3rd party’s full list of advertisers is empty");
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        addContentView(this.partnersListView);
        addPartnersListButtonAndLinkClick(this.consentDialogView);
    }

    private void addPartnersListButtonAndLinkClick(View view) {
        Button button = (Button) view.findViewById(R.id.btn_partners_list_back);
        this.partnerListBackBtn = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.distriqt.extension.adverts.platforms.huawei.dialogs.ConsentDialog.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ConsentDialog.this.showTouchHereInfo();
            }
        });
    }

    private void addContentView(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.consent_center_layout);
        this.contentLayout = linearLayout;
        linearLayout.removeAllViews();
        this.contentLayout.addView(view);
    }
}

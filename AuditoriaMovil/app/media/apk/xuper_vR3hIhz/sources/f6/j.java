package f6;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hpplay.component.protocol.PlistBuilder;
import com.mobile.brasiltv.utils.b0;
import com.mobile.brasiltv.view.dialog.PaymentTipDialog;
import com.mobile.brasiltv.view.dialog.UploadVoucherDialog;
import com.msandroid.mobile.R;
import com.zhy.autolayout.utils.AutoUtils;
import h9.t;
import mobile.com.requestframe.utils.response.GetOrderInfoData;
import s9.l;
/* loaded from: classes3.dex */
public final class j extends BaseQuickAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final a f13315b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public l f13316a;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(t9.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends t9.j implements l {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ GetOrderInfoData f13318b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GetOrderInfoData getOrderInfoData) {
            super(1);
            this.f13318b = getOrderInfoData;
        }

        public final void b(PaymentTipDialog paymentTipDialog) {
            t9.i.g(paymentTipDialog, "it");
            l lVar = j.this.f13316a;
            if (lVar != null) {
                lVar.invoke(this.f13318b.getOrderId());
            }
            paymentTipDialog.dismiss();
        }

        @Override // s9.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PaymentTipDialog) obj);
            return t.f14242a;
        }
    }

    public j() {
        super((int) R.layout.adapter_order);
    }

    public static final void g(j jVar, GetOrderInfoData getOrderInfoData, View view) {
        t9.i.g(jVar, "this$0");
        t9.i.g(getOrderInfoData, "$item");
        Context context = jVar.mContext;
        t9.i.f(context, "mContext");
        new PaymentTipDialog(context, new b(getOrderInfoData)).show();
    }

    public static final void h(j jVar, GetOrderInfoData getOrderInfoData, View view) {
        t9.i.g(jVar, "this$0");
        t9.i.g(getOrderInfoData, "$item");
        Context context = jVar.mContext;
        t9.i.f(context, "mContext");
        String uploadUrl = getOrderInfoData.getUploadUrl();
        t9.i.d(uploadUrl);
        new UploadVoucherDialog(context, uploadUrl).show();
    }

    public static final void i(j jVar, GetOrderInfoData getOrderInfoData, View view) {
        t9.i.g(jVar, "this$0");
        t9.i.g(getOrderInfoData, "$item");
        Context context = jVar.mContext;
        t9.i.f(context, "mContext");
        b0.o(context, getOrderInfoData.getOrderId(), getOrderInfoData.getPaymentType(), getOrderInfoData.getPaymentPlatform());
    }

    public static final void j(j jVar, GetOrderInfoData getOrderInfoData, View view) {
        t9.i.g(jVar, "this$0");
        t9.i.g(getOrderInfoData, "$item");
        b0.U(jVar, ">>> enterOrderProgressPage state: " + getOrderInfoData.getState());
        Context context = jVar.mContext;
        t9.i.f(context, "mContext");
        b0.n(context, getOrderInfoData.getOrderId());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() != null) {
            getRecyclerView().setAdapter(this);
        } else {
            super.bindToRecyclerView(recyclerView);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: f */
    public void convert(BaseViewHolder baseViewHolder, final GetOrderInfoData getOrderInfoData) {
        String paymentCurrency;
        String substring;
        boolean z10;
        boolean z11;
        t9.i.g(baseViewHolder, "helper");
        t9.i.g(getOrderInfoData, PlistBuilder.KEY_ITEM);
        if (getOrderInfoData.getPackageType() == 1) {
            baseViewHolder.setText(R.id.mTextType, this.mContext.getResources().getString(R.string.mobile_vip));
        } else {
            baseViewHolder.setText(R.id.mTextType, this.mContext.getResources().getString(R.string.tv_vip));
        }
        l(baseViewHolder, getOrderInfoData);
        baseViewHolder.setText(R.id.mTextOrderName, this.mContext.getString(R.string.order_record_name, getOrderInfoData.getPackagePlanName(), String.valueOf(getOrderInfoData.getAuthorizedDays())));
        baseViewHolder.setText(R.id.mTvMoney, getOrderInfoData.getPaymentAmount());
        String paymentCurrency2 = getOrderInfoData.getPaymentCurrency();
        if (t9.i.b(paymentCurrency2, "BRL")) {
            paymentCurrency = "R$";
        } else if (t9.i.b(paymentCurrency2, "USD")) {
            paymentCurrency = "$";
        } else {
            paymentCurrency = getOrderInfoData.getPaymentCurrency();
        }
        baseViewHolder.setText(R.id.mTvMoneyFlag, paymentCurrency);
        baseViewHolder.setText(R.id.mTextOrderId, this.mContext.getResources().getString(R.string.order_number, getOrderInfoData.getOrderId()));
        if (!TextUtils.isEmpty(getOrderInfoData.getCreateTime()) && getOrderInfoData.getCreateTime().length() >= 16) {
            substring = y6.b.e(getOrderInfoData.getCreateTime(), "yyyy-MM-dd HH:mm:SS", "dd-MM-yyyy HH:mm");
        } else {
            String c10 = y6.b.c();
            t9.i.f(c10, "getLocalUTCTime()");
            substring = c10.substring(0, 16);
            t9.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        baseViewHolder.setText(R.id.mTextOrderTime, this.mContext.getResources().getString(R.string.purchase_time, substring));
        baseViewHolder.setText(R.id.mTvPayMethod, this.mContext.getResources().getString(R.string.order_pay_method, getOrderInfoData.getPaymentType()));
        String paymentInfo = getOrderInfoData.getPaymentInfo();
        if (paymentInfo != null && paymentInfo.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            baseViewHolder.setVisible(R.id.mTvPay, false);
        } else {
            baseViewHolder.setVisible(R.id.mTvPay, true);
        }
        String uploadUrl = getOrderInfoData.getUploadUrl();
        if (uploadUrl != null && uploadUrl.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            baseViewHolder.setGone(R.id.mLayoutUploadVoucher, false);
        } else {
            baseViewHolder.setGone(R.id.mLayoutUploadVoucher, true);
        }
        baseViewHolder.setOnClickListener(R.id.mTvPay, new View.OnClickListener() { // from class: f6.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.g(j.this, getOrderInfoData, view);
            }
        });
        baseViewHolder.setOnClickListener(R.id.mTvUploadVoucher, new View.OnClickListener() { // from class: f6.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.h(j.this, getOrderInfoData, view);
            }
        });
        baseViewHolder.setOnClickListener(R.id.mTvFeedback, new View.OnClickListener() { // from class: f6.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.i(j.this, getOrderInfoData, view);
            }
        });
        baseViewHolder.setOnClickListener(R.id.mTvOrderProcess, new View.OnClickListener() { // from class: f6.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j.j(j.this, getOrderInfoData, view);
            }
        });
    }

    public final void k(l lVar) {
        t9.i.g(lVar, "callback");
        this.f13316a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
        if (r2.equals(com.titans.entity.CdnType.DIGITAL_TYPE_PCDN) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r2.equals("3") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
        r11.setText(com.msandroid.mobile.R.id.mTextState, r10.mContext.getResources().getString(com.msandroid.mobile.R.string.transaction_failed));
        r11.setGone(com.msandroid.mobile.R.id.mTvNote, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d8, code lost:
        if (r2.equals("2") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
        if (r2.equals("1") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        r11.setText(com.msandroid.mobile.R.id.mTextState, r10.mContext.getResources().getString(com.msandroid.mobile.R.string.order_payment_complete));
        r11.setGone(com.msandroid.mobile.R.id.mTvNote, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.chad.library.adapter.base.BaseViewHolder r11, mobile.com.requestframe.utils.response.GetOrderInfoData r12) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.j.l(com.chad.library.adapter.base.BaseViewHolder, mobile.com.requestframe.utils.response.GetOrderInfoData):void");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.g
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        t9.i.g(viewGroup, "parent");
        BaseViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
        t9.i.f(onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        AutoUtils.autoSize(onCreateViewHolder.itemView);
        return onCreateViewHolder;
    }
}

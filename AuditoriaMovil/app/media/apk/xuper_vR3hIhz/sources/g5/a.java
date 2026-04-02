package g5;

import android.view.ViewGroup;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hpplay.component.protocol.PlistBuilder;
import com.mobile.brasiltv.view.AutoCardView;
import com.msandroid.mobile.R;
import com.zhy.autolayout.utils.AutoUtils;
import java.util.List;
import mobile.com.requestframe.utils.response.Msg;
import mobile.com.requestframe.utils.response.pushMsg;
/* loaded from: classes3.dex */
public final class a extends j5.a {
    public a() {
        super(R.layout.item_sys_msg, null, 2, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public void convert(BaseViewHolder baseViewHolder, Msg msg) {
        boolean z10;
        boolean z11;
        t9.i.g(baseViewHolder, "helper");
        t9.i.g(msg, PlistBuilder.KEY_ITEM);
        Integer status = msg.getStatus();
        if (status != null && status.intValue() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        baseViewHolder.setGone(R.id.mVRedDot, z10);
        pushMsg content = msg.getContent();
        baseViewHolder.setText(R.id.mTvTitle, (content == null || (r0 = content.getTitle()) == null) ? "" : "");
        pushMsg content2 = msg.getContent();
        baseViewHolder.setText(R.id.mTvContent, (content2 == null || (r0 = content2.getText()) == null) ? "" : "");
        String e10 = y6.b.e(msg.getCreateTime(), "yyyy-MM-dd'T'HH:mm:ss", "M-d HH:mm");
        if (e10 != null && e10.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            baseViewHolder.setText(R.id.mTvDate, "");
            baseViewHolder.setText(R.id.mTvTime, "");
            return;
        }
        t9.i.f(e10, "date");
        List M = ba.t.M(e10, new String[]{" "}, false, 0, 6, null);
        baseViewHolder.setText(R.id.mTvDate, (CharSequence) M.get(0));
        baseViewHolder.setText(R.id.mTvTime, (CharSequence) M.get(1));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup viewGroup, int i10) {
        BaseViewHolder onCreateDefViewHolder = super.onCreateDefViewHolder(viewGroup, i10);
        ((AutoCardView) onCreateDefViewHolder.getView(R.id.mAcvCard)).setRadius(AutoUtils.getPercentWidthSize(10));
        t9.i.f(onCreateDefViewHolder, "holder");
        return onCreateDefViewHolder;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.g
    public BaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        t9.i.g(viewGroup, "parent");
        BaseViewHolder onCreateViewHolder = super.onCreateViewHolder(viewGroup, i10);
        t9.i.f(onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        AutoUtils.autoSize(onCreateViewHolder.convertView);
        return onCreateViewHolder;
    }
}

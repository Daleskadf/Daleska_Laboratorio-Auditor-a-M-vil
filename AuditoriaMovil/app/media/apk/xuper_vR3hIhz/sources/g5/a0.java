package g5;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.hpplay.component.protocol.PlistBuilder;
import com.mobile.brasiltv.bean.FeedBackContacTime;
import com.mobile.brasiltv.bean.FeedBackContactBean;
import com.mobile.brasiltv.bean.FeedBackTitleBean;
import com.msandroid.mobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mobile.com.requestframe.utils.response.FeedBackContactData;
import mobile.com.requestframe.utils.response.WorkInfoBean;
/* loaded from: classes3.dex */
public final class a0 extends BaseMultiItemQuickAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13634a = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(t9.g gVar) {
            this();
        }
    }

    public a0() {
        super(new ArrayList());
        addItemType(1, R.layout.item_feedback_service_item_title);
        addItemType(2, R.layout.item_feedback_service_item_contact);
        addItemType(3, R.layout.item_feedback_service_item_time);
    }

    public final void a(Context context, List list) {
        List<String> list2;
        t9.i.g(context, com.umeng.analytics.pro.f.X);
        t9.i.g(list, "feedBackContacts");
        List<T> data = getData();
        t9.i.f(data, "data");
        data.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FeedBackContactData feedBackContactData = (FeedBackContactData) it.next();
            if (!com.mobile.brasiltv.utils.b0.J(feedBackContactData.getName()) && !com.mobile.brasiltv.utils.b0.J(feedBackContactData.getLogo())) {
                data.add(new FeedBackTitleBean(feedBackContactData));
                int i10 = 0;
                for (Object obj : feedBackContactData.getWorkInfoList()) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        i9.j.j();
                    }
                    WorkInfoBean workInfoBean = (WorkInfoBean) obj;
                    if (feedBackContactData.getWorkInfoList().size() == 1) {
                        String contact = workInfoBean.getContact();
                        data.add(new FeedBackContactBean(contact, context.getString(R.string.customer_service_land) + ": "));
                    } else {
                        String contact2 = workInfoBean.getContact();
                        data.add(new FeedBackContactBean(contact2, context.getString(R.string.customer_service_land) + ' ' + i11 + ": "));
                    }
                    String workingTimeDesc = workInfoBean.getWorkingTimeDesc();
                    if (workingTimeDesc != null) {
                        list2 = ba.t.M(workingTimeDesc, new String[]{","}, false, 0, 6, null);
                    } else {
                        list2 = null;
                    }
                    if (list2 != null) {
                        for (String str : list2) {
                            data.add(new FeedBackContacTime(str));
                        }
                    }
                    i10 = i11;
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public void convert(BaseViewHolder baseViewHolder, MultiItemEntity multiItemEntity) {
        int i10;
        t9.i.g(baseViewHolder, "helper");
        t9.i.g(multiItemEntity, PlistBuilder.KEY_ITEM);
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType == 3) {
                    baseViewHolder.setText(R.id.tvTime, ((FeedBackContacTime) multiItemEntity).getTime());
                    return;
                }
                return;
            }
            FeedBackContactBean feedBackContactBean = (FeedBackContactBean) multiItemEntity;
            baseViewHolder.setText(R.id.tvContactName, feedBackContactBean.getName()).setText(R.id.tvContact, feedBackContactBean.getContact());
            return;
        }
        FeedBackTitleBean feedBackTitleBean = (FeedBackTitleBean) multiItemEntity;
        View view = baseViewHolder.getView(R.id.line);
        if (baseViewHolder.getAdapterPosition() == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        a7.e eVar = a7.e.f288a;
        Context context = this.mContext;
        t9.i.f(context, "mContext");
        String logo = feedBackTitleBean.getLogo();
        View view2 = baseViewHolder.getView(R.id.ivIcon);
        t9.i.f(view2, "helper.getView(R.id.ivIcon)");
        eVar.b(context, logo, (ImageView) view2, R.mipmap.ic_logo);
        baseViewHolder.setText(R.id.tvName, feedBackTitleBean.getName());
    }
}

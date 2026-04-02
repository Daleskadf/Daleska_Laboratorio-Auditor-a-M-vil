package g5;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hpplay.component.protocol.PlistBuilder;
import com.msandroid.mobile.R;
import com.zhy.autolayout.utils.AutoUtils;
import mobile.com.requestframe.utils.response.QuestionBean;
/* loaded from: classes3.dex */
public final class z extends BaseQuickAdapter {

    /* renamed from: a  reason: collision with root package name */
    public s9.l f13976a;

    /* renamed from: b  reason: collision with root package name */
    public int f13977b;

    public z() {
        super((int) R.layout.item_feedback_item);
    }

    public static final void c(z zVar, BaseViewHolder baseViewHolder, View view) {
        t9.i.g(zVar, "this$0");
        t9.i.g(baseViewHolder, "$helper");
        zVar.f(baseViewHolder.getAdapterPosition() - zVar.getHeaderLayoutCount());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: b */
    public void convert(final BaseViewHolder baseViewHolder, QuestionBean questionBean) {
        boolean z10;
        t9.i.g(baseViewHolder, "helper");
        t9.i.g(questionBean, PlistBuilder.KEY_ITEM);
        baseViewHolder.setText(R.id.tvName, questionBean.getName());
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.ivChoose);
        if (this.f13977b == baseViewHolder.getAdapterPosition() - getHeaderLayoutCount()) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setSelected(z10);
        ((ImageView) baseViewHolder.getView(R.id.ivChoose)).setOnClickListener(new View.OnClickListener() { // from class: g5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z.c(z.this, baseViewHolder, view);
            }
        });
    }

    public final QuestionBean d() {
        return (QuestionBean) getItem(this.f13977b);
    }

    public final void e(s9.l lVar) {
        this.f13976a = lVar;
    }

    public final void f(int i10) {
        this.f13977b = i10;
        s9.l lVar = this.f13976a;
        if (lVar != null) {
            boolean z10 = true;
            if (i10 != ((getItemCount() - getFooterLayoutCount()) - getHeaderLayoutCount()) - 1) {
                z10 = false;
            }
            lVar.invoke(Boolean.valueOf(z10));
        }
        notifyDataSetChanged();
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

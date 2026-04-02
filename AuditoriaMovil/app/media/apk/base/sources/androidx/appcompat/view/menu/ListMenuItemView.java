package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.example.appecoactivate.R;
import h0.AbstractC1066z;
import i.AbstractC1091a;
import java.lang.reflect.Field;
import o.j;
import o.q;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    public j f7279a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f7280b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f7281c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f7282d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f7283e;

    /* renamed from: e0  reason: collision with root package name */
    public ImageView f7284e0;
    public TextView f;

    /* renamed from: f0  reason: collision with root package name */
    public ImageView f7285f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f7286g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Drawable f7287h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f7288i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Context f7289j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7290k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Drawable f7291l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f7292m0;

    /* renamed from: n0  reason: collision with root package name */
    public LayoutInflater f7293n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7294o0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        R1.j J02 = R1.j.J0(getContext(), attributeSet, AbstractC1091a.f11362n, R.attr.listMenuViewStyle);
        this.f7287h0 = J02.u0(5);
        TypedArray typedArray = (TypedArray) J02.f4683c;
        this.f7288i0 = typedArray.getResourceId(1, -1);
        this.f7290k0 = typedArray.getBoolean(7, false);
        this.f7289j0 = context;
        this.f7291l0 = J02.u0(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f7292m0 = obtainStyledAttributes.hasValue(0);
        J02.O0();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f7293n0 == null) {
            this.f7293n0 = LayoutInflater.from(getContext());
        }
        return this.f7293n0;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        int i7;
        ImageView imageView = this.f7284e0;
        if (imageView != null) {
            if (z7) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    @Override // o.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(o.j r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(o.j):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7285f0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7285f0.getLayoutParams();
            rect.top = this.f7285f0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    @Override // o.q
    public j getItemData() {
        return this.f7279a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = AbstractC1066z.f11214a;
        setBackground(this.f7287h0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f7282d = textView;
        int i7 = this.f7288i0;
        if (i7 != -1) {
            textView.setTextAppearance(this.f7289j0, i7);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f7284e0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7291l0);
        }
        this.f7285f0 = (ImageView) findViewById(R.id.group_divider);
        this.f7286g0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f7280b != null && this.f7290k0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7280b.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f7281c == null && this.f7283e == null) {
            return;
        }
        if ((this.f7279a.f14482x & 4) != 0) {
            if (this.f7281c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f7281c = radioButton;
                LinearLayout linearLayout = this.f7286g0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f7281c;
            view = this.f7283e;
        } else {
            if (this.f7283e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f7283e = checkBox;
                LinearLayout linearLayout2 = this.f7286g0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f7283e;
            view = this.f7281c;
        }
        if (z7) {
            compoundButton.setChecked(this.f7279a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f7283e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f7281c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if ((this.f7279a.f14482x & 4) != 0) {
            if (this.f7281c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f7281c = radioButton;
                LinearLayout linearLayout = this.f7286g0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f7281c;
        } else {
            if (this.f7283e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f7283e = checkBox;
                LinearLayout linearLayout2 = this.f7286g0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f7283e;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f7294o0 = z7;
        this.f7290k0 = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        int i7;
        ImageView imageView = this.f7285f0;
        if (imageView != null) {
            if (!this.f7292m0 && z7) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7279a.f14472n.getClass();
        boolean z7 = this.f7294o0;
        if (!z7 && !this.f7290k0) {
            return;
        }
        ImageView imageView = this.f7280b;
        if (imageView == null && drawable == null && !this.f7290k0) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f7280b = imageView2;
            LinearLayout linearLayout = this.f7286g0;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f7290k0) {
            this.f7280b.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f7280b;
        if (!z7) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f7280b.getVisibility() != 0) {
            this.f7280b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f7282d.setText(charSequence);
            if (this.f7282d.getVisibility() != 0) {
                this.f7282d.setVisibility(0);
            }
        } else if (this.f7282d.getVisibility() != 8) {
            this.f7282d.setVisibility(8);
        }
    }
}

package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import b4.C0597e;
import com.example.appecoactivate.R;
/* renamed from: p.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597n {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f14852b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C1597n f14853c;

    /* renamed from: a  reason: collision with root package name */
    public C1602p0 f14854a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, M3.q] */
    public static synchronized void b() {
        synchronized (C1597n.class) {
            if (f14853c == null) {
                ?? obj = new Object();
                f14853c = obj;
                obj.f14854a = C1602p0.d();
                C1602p0 c1602p0 = f14853c.f14854a;
                ?? obj2 = new Object();
                obj2.f3252a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f3254c = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f3255d = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                obj2.f3256e = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f3253b = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                c1602p0.l(obj2);
            }
        }
    }

    public static void c(Drawable drawable, C0597e c0597e, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C1602p0.f14861h;
        int[] state = drawable.getState();
        int[] iArr2 = O.f14702a;
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z7 = c0597e.f8247b;
            if (!z7 && !c0597e.f8246a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z7) {
                    colorStateList = (ColorStateList) c0597e.f8248c;
                } else {
                    colorStateList = null;
                }
                if (c0597e.f8246a) {
                    mode = (PorterDuff.Mode) c0597e.f8249d;
                } else {
                    mode = C1602p0.f14861h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C1602p0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable a(Context context, int i7) {
        return this.f14854a.f(context, i7);
    }
}

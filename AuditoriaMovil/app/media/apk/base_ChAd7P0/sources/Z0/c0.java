package z0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final a0 Companion;
    public static final c0 GONE;
    public static final c0 INVISIBLE;
    public static final c0 REMOVED;
    public static final c0 VISIBLE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, z0.a0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, z0.c0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, z0.c0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, z0.c0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, z0.c0] */
    static {
        ?? r42 = new Enum("REMOVED", 0);
        REMOVED = r42;
        ?? r52 = new Enum("VISIBLE", 1);
        VISIBLE = r52;
        ?? r62 = new Enum("GONE", 2);
        GONE = r62;
        ?? r7 = new Enum("INVISIBLE", 3);
        INVISIBLE = r7;
        $VALUES = new c0[]{r42, r52, r62, r7};
        Companion = new Object();
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup container) {
        kotlin.jvm.internal.j.e(view, "view");
        kotlin.jvm.internal.j.e(container, "container");
        int i7 = b0.f16757a[ordinal()];
        ViewGroup viewGroup = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }
}

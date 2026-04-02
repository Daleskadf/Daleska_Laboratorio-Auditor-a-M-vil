package io.flutter.view;

import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.AbstractC0978c;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class o extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final View f12497a;

    /* renamed from: b  reason: collision with root package name */
    public final V2.k f12498b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f12499c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f12500d;

    /* renamed from: e  reason: collision with root package name */
    public final io.flutter.plugin.platform.o f12501e;
    public final ContentResolver f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f12502g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f12503h;

    /* renamed from: i  reason: collision with root package name */
    public k f12504i;
    public Integer j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f12505k;

    /* renamed from: l  reason: collision with root package name */
    public int f12506l;

    /* renamed from: m  reason: collision with root package name */
    public k f12507m;

    /* renamed from: n  reason: collision with root package name */
    public k f12508n;

    /* renamed from: o  reason: collision with root package name */
    public k f12509o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f12510p;

    /* renamed from: q  reason: collision with root package name */
    public int f12511q;

    /* renamed from: r  reason: collision with root package name */
    public Integer f12512r;

    /* renamed from: s  reason: collision with root package name */
    public A.m f12513s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12514t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12515u;

    /* renamed from: v  reason: collision with root package name */
    public final a f12516v;

    /* renamed from: w  reason: collision with root package name */
    public final b f12517w;

    /* renamed from: x  reason: collision with root package name */
    public final d f12518x;

    /* renamed from: y  reason: collision with root package name */
    public final c f12519y;

    /* renamed from: z  reason: collision with root package name */
    public static final int f12496z = ((g.SCROLL_RIGHT.value | g.SCROLL_LEFT.value) | g.SCROLL_UP.value) | g.SCROLL_DOWN.value;

    /* renamed from: A  reason: collision with root package name */
    public static final int f12494A = ((((((((((i.HAS_CHECKED_STATE.value | i.IS_CHECKED.value) | i.IS_SELECTED.value) | i.IS_TEXT_FIELD.value) | i.IS_FOCUSED.value) | i.HAS_ENABLED_STATE.value) | i.IS_ENABLED.value) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.value) | i.HAS_TOGGLED_STATE.value) | i.IS_TOGGLED.value) | i.IS_FOCUSABLE.value) | i.IS_SLIDER.value;

    /* renamed from: B  reason: collision with root package name */
    public static final int f12495B = (g.DID_GAIN_ACCESSIBILITY_FOCUS.value & g.DID_LOSE_ACCESSIBILITY_FOCUS.value) & g.SHOW_ON_SCREEN.value;

    public o(View view, V2.k kVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        int i7;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.f12502g = new HashMap();
        this.f12503h = new HashMap();
        this.f12506l = 0;
        this.f12510p = new ArrayList();
        this.f12511q = 0;
        this.f12512r = 0;
        this.f12514t = false;
        this.f12515u = false;
        this.f12516v = new a(this);
        b bVar = new b(this);
        this.f12517w = bVar;
        c cVar = new c(this, new Handler());
        this.f12519y = cVar;
        this.f12497a = view;
        this.f12498b = kVar;
        this.f12499c = accessibilityManager;
        this.f = contentResolver;
        this.f12500d = accessibilityViewEmbedder;
        this.f12501e = oVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(this, accessibilityManager);
        this.f12518x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i7 = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i7 != Integer.MAX_VALUE && i7 >= 300) {
                this.f12506l |= f.BOLD_TEXT.value;
            } else {
                this.f12506l &= ~f.BOLD_TEXT.value;
            }
            ((FlutterJNI) kVar.f5966c).setAccessibilityFeatures(this.f12506l);
        }
        oVar.f11722h.f11685a = this;
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f12500d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType != 8) {
            if (eventType != 128) {
                if (eventType != 32768) {
                    if (eventType == 65536) {
                        this.f12505k = null;
                        this.j = null;
                        return true;
                    }
                    return true;
                }
                this.j = recordFlutterId;
                this.f12504i = null;
                return true;
            }
            this.f12509o = null;
            return true;
        }
        this.f12505k = recordFlutterId;
        this.f12507m = null;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [io.flutter.view.h, java.lang.Object] */
    public final h b(int i7) {
        HashMap hashMap = this.f12503h;
        h hVar = (h) hashMap.get(Integer.valueOf(i7));
        if (hVar == null) {
            ?? obj = new Object();
            obj.f12438c = -1;
            obj.f12437b = i7;
            obj.f12436a = 267386881 + i7;
            hashMap.put(Integer.valueOf(i7), obj);
            return obj;
        }
        return hVar;
    }

    public final k c(int i7) {
        HashMap hashMap = this.f12502g;
        k kVar = (k) hashMap.get(Integer.valueOf(i7));
        if (kVar == null) {
            k kVar2 = new k(this);
            kVar2.f12468b = i7;
            hashMap.put(Integer.valueOf(i7), kVar2);
            return kVar2;
        }
        return kVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        boolean z7;
        boolean z8;
        String str;
        i iVar;
        int i8;
        int length;
        int i9;
        boolean z9;
        boolean z10;
        boolean z11;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f12500d;
        if (i7 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i7);
        }
        HashMap hashMap = this.f12502g;
        View view = this.f12497a;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC0978c.k(obtain);
            }
            return obtain;
        }
        k kVar = (k) hashMap.get(Integer.valueOf(i7));
        if (kVar == null) {
            return null;
        }
        int i10 = kVar.f12474i;
        io.flutter.plugin.platform.o oVar = this.f12501e;
        if (i10 != -1 && oVar.m(i10)) {
            View g3 = oVar.g(kVar.f12474i);
            if (g3 == null) {
                return null;
            }
            return accessibilityViewEmbedder.getRootNode(g3, kVar.f12468b, kVar.f12466Y);
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i7);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            if (kVar.h(i.SCOPES_ROUTE) || (k.b(kVar) == null && (kVar.f12470d & (~f12495B)) == 0)) {
                z11 = false;
            } else {
                z11 = true;
            }
            AbstractC0978c.m(obtain2, z11);
        }
        CharSequence charSequence = StringUtils.EMPTY;
        obtain2.setViewIdResourceName(StringUtils.EMPTY);
        String str2 = kVar.f12479o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i7);
        obtain2.setFocusable(kVar.j());
        k kVar2 = this.f12507m;
        if (kVar2 != null) {
            if (kVar2.f12468b == i7) {
                z10 = true;
            } else {
                z10 = false;
            }
            obtain2.setFocused(z10);
        }
        k kVar3 = this.f12504i;
        if (kVar3 != null) {
            if (kVar3.f12468b == i7) {
                z9 = true;
            } else {
                z9 = false;
            }
            obtain2.setAccessibilityFocused(z9);
        }
        i iVar2 = i.IS_TEXT_FIELD;
        if (kVar.h(iVar2)) {
            obtain2.setPassword(kVar.h(i.IS_OBSCURED));
            if (!kVar.h(i.IS_READ_ONLY)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!kVar.h(iVar));
            int i12 = kVar.f12472g;
            if (i12 != -1 && (i9 = kVar.f12473h) != -1) {
                obtain2.setTextSelection(i12, i9);
            }
            k kVar4 = this.f12504i;
            if (kVar4 != null && kVar4.f12468b == i7) {
                obtain2.setLiveRegion(1);
            }
            if (k.a(kVar, g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(RecognitionOptions.QR_CODE);
                i8 = 1;
            } else {
                i8 = 0;
            }
            if (k.a(kVar, g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(RecognitionOptions.UPC_A);
                i8 = 1;
            }
            if (k.a(kVar, g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(RecognitionOptions.QR_CODE);
                i8 |= 2;
            }
            if (k.a(kVar, g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(RecognitionOptions.UPC_A);
                i8 |= 2;
            }
            obtain2.setMovementGranularities(i8);
            if (kVar.f12471e >= 0) {
                String str3 = kVar.f12482r;
                if (str3 == null) {
                    length = 0;
                } else {
                    length = str3.length();
                }
                obtain2.setMaxTextLength((length - kVar.f) + kVar.f12471e);
            }
        }
        if (k.a(kVar, g.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (k.a(kVar, g.COPY)) {
            obtain2.addAction(16384);
        }
        if (k.a(kVar, g.CUT)) {
            obtain2.addAction(65536);
        }
        if (k.a(kVar, g.PASTE)) {
            obtain2.addAction(RecognitionOptions.TEZ_CODE);
        }
        if (k.a(kVar, g.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (kVar.h(i.IS_BUTTON) || kVar.h(i.IS_LINK)) {
            obtain2.setClassName("android.widget.Button");
        }
        if (kVar.h(i.IS_IMAGE)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (k.a(kVar, g.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        k kVar5 = kVar.f12456O;
        if (kVar5 != null) {
            obtain2.setParent(view, kVar5.f12468b);
        } else {
            obtain2.setParent(view);
        }
        int i13 = kVar.f12442A;
        if (i13 != -1) {
            obtain2.setTraversalAfter(view, i13);
        }
        Rect rect = kVar.f12466Y;
        k kVar6 = kVar.f12456O;
        if (kVar6 != null) {
            Rect rect2 = kVar6.f12466Y;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        if (kVar.h(i.HAS_ENABLED_STATE) && !kVar.h(i.IS_ENABLED)) {
            z7 = false;
        } else {
            z7 = true;
        }
        obtain2.setEnabled(z7);
        if (k.a(kVar, g.TAP)) {
            if (kVar.f12460S != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, kVar.f12460S.f12440e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (kVar.h(i.IS_SLIDER)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (k.a(kVar, g.LONG_PRESS)) {
            if (kVar.f12461T != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, kVar.f12461T.f12440e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (k.a(kVar, gVar) || k.a(kVar, g.SCROLL_UP) || k.a(kVar, g.SCROLL_RIGHT) || k.a(kVar, g.SCROLL_DOWN)) {
            obtain2.setScrollable(true);
            if (kVar.h(i.HAS_IMPLICIT_SCROLLING)) {
                if (!k.a(kVar, gVar) && !k.a(kVar, g.SCROLL_RIGHT)) {
                    if (j(kVar)) {
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(kVar.j, 0, false));
                    } else {
                        obtain2.setClassName("android.widget.ScrollView");
                    }
                } else if (j(kVar)) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, kVar.j, false));
                } else {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                }
            }
            if (k.a(kVar, gVar) || k.a(kVar, g.SCROLL_UP)) {
                obtain2.addAction(RecognitionOptions.AZTEC);
            }
            if (k.a(kVar, g.SCROLL_RIGHT) || k.a(kVar, g.SCROLL_DOWN)) {
                obtain2.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (k.a(kVar, gVar2) || k.a(kVar, g.DECREASE)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (k.a(kVar, gVar2)) {
                obtain2.addAction(RecognitionOptions.AZTEC);
            }
            if (k.a(kVar, g.DECREASE)) {
                obtain2.addAction(8192);
            }
        }
        if (kVar.h(i.IS_LIVE_REGION)) {
            obtain2.setLiveRegion(1);
        }
        if (kVar.h(iVar2)) {
            obtain2.setText(k.e(kVar.f12482r, kVar.f12483s));
            if (i11 >= 28) {
                CharSequence[] charSequenceArr = {k.e(kVar.f12480p, kVar.f12481q), k.e(kVar.f12488x, kVar.f12489y)};
                CharSequence charSequence2 = null;
                for (int i14 = 0; i14 < 2; i14++) {
                    CharSequence charSequence3 = charSequenceArr[i14];
                    if (charSequence3 != null && charSequence3.length() > 0) {
                        if (charSequence2 != null && charSequence2.length() != 0) {
                            charSequence3 = TextUtils.concat(charSequence2, ", ", charSequence3);
                        }
                        charSequence2 = charSequence3;
                    }
                }
                z8 = false;
                io.flutter.plugin.editing.i.q(obtain2, charSequence2);
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
            if (!kVar.h(i.SCOPES_ROUTE)) {
                CharSequence b5 = k.b(kVar);
                if (i11 < 28 && kVar.f12490z != null) {
                    if (b5 != null) {
                        charSequence = b5;
                    }
                    b5 = ((Object) charSequence) + "\n" + kVar.f12490z;
                }
                if (b5 != null) {
                    obtain2.setContentDescription(b5);
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 28 && (str = kVar.f12490z) != null) {
            obtain2.setTooltipText(str);
        }
        boolean h8 = kVar.h(i.HAS_CHECKED_STATE);
        boolean h9 = kVar.h(i.HAS_TOGGLED_STATE);
        obtain2.setCheckable((h8 || h9) ? true : true);
        if (h8) {
            obtain2.setChecked(kVar.h(i.IS_CHECKED));
            if (kVar.h(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (h9) {
            obtain2.setChecked(kVar.h(i.IS_TOGGLED));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(kVar.h(i.IS_SELECTED));
        if (i15 >= 28) {
            obtain2.setHeading(kVar.h(i.IS_HEADER));
        }
        k kVar7 = this.f12504i;
        if (kVar7 != null && kVar7.f12468b == i7) {
            obtain2.addAction(RecognitionOptions.ITF);
        } else {
            obtain2.addAction(64);
        }
        ArrayList arrayList = kVar.f12459R;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f12436a, hVar.f12439d));
            }
        }
        Iterator it2 = kVar.f12457P.iterator();
        while (it2.hasNext()) {
            k kVar8 = (k) it2.next();
            if (!kVar8.h(i.IS_HIDDEN)) {
                int i16 = kVar8.f12474i;
                if (i16 != -1) {
                    View g4 = oVar.g(i16);
                    if (!oVar.m(kVar8.f12474i)) {
                        obtain2.addChild(g4);
                    }
                }
                obtain2.addChild(view, kVar8.f12468b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i7, int i8) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i8);
        View view = this.f12497a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i7);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z7) {
        k i7;
        if (!this.f12499c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f12502g;
        if (hashMap.isEmpty()) {
            return false;
        }
        k i8 = ((k) hashMap.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z7);
        if (i8 != null && i8.f12474i != -1) {
            if (z7) {
                return false;
            }
            return this.f12500d.onAccessibilityHoverEvent(i8.f12468b, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                k kVar = this.f12509o;
                if (kVar != null) {
                    g(kVar.f12468b, RecognitionOptions.QR_CODE);
                    this.f12509o = null;
                }
            } else {
                motionEvent.toString();
                return false;
            }
        } else {
            float x7 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (i7 = ((k) hashMap.get(0)).i(new float[]{x7, y2, 0.0f, 1.0f}, z7)) != this.f12509o) {
                if (i7 != null) {
                    g(i7.f12468b, RecognitionOptions.ITF);
                }
                k kVar2 = this.f12509o;
                if (kVar2 != null) {
                    g(kVar2.f12468b, RecognitionOptions.QR_CODE);
                }
                this.f12509o = i7;
            }
        }
        return true;
    }

    public final boolean f(k kVar, int i7, Bundle bundle, boolean z7) {
        int i8;
        int i9 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z8 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i10 = kVar.f12472g;
        int i11 = kVar.f12473h;
        if (i11 >= 0 && i10 >= 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 == 8 || i9 == 16) {
                            if (z7) {
                                kVar.f12473h = kVar.f12482r.length();
                            } else {
                                kVar.f12473h = 0;
                            }
                        }
                    } else if (z7 && i11 < kVar.f12482r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(kVar.f12482r.substring(kVar.f12473h));
                        if (matcher.find()) {
                            kVar.f12473h += matcher.start(1);
                        } else {
                            kVar.f12473h = kVar.f12482r.length();
                        }
                    } else if (!z7 && kVar.f12473h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(kVar.f12482r.substring(0, kVar.f12473h));
                        if (matcher2.find()) {
                            kVar.f12473h = matcher2.start(1);
                        } else {
                            kVar.f12473h = 0;
                        }
                    }
                } else if (z7 && i11 < kVar.f12482r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(kVar.f12482r.substring(kVar.f12473h));
                    matcher3.find();
                    if (matcher3.find()) {
                        kVar.f12473h += matcher3.start(1);
                    } else {
                        kVar.f12473h = kVar.f12482r.length();
                    }
                } else if (!z7 && kVar.f12473h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(kVar.f12482r.substring(0, kVar.f12473h));
                    if (matcher4.find()) {
                        kVar.f12473h = matcher4.start(1);
                    }
                }
            } else if (z7 && i11 < kVar.f12482r.length()) {
                kVar.f12473h++;
            } else if (!z7 && (i8 = kVar.f12473h) > 0) {
                kVar.f12473h = i8 - 1;
            }
            if (!z8) {
                kVar.f12472g = kVar.f12473h;
            }
        }
        if (i10 != kVar.f12472g || i11 != kVar.f12473h) {
            String str = kVar.f12482r;
            if (str == null) {
                str = StringUtils.EMPTY;
            }
            AccessibilityEvent d7 = d(kVar.f12468b, 8192);
            d7.getText().add(str);
            d7.setFromIndex(kVar.f12472g);
            d7.setToIndex(kVar.f12473h);
            d7.setItemCount(str.length());
            h(d7);
        }
        V2.k kVar2 = this.f12498b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 4 || i9 == 8 || i9 == 16) {
                    return true;
                }
            } else {
                if (z7) {
                    g gVar = g.MOVE_CURSOR_FORWARD_BY_WORD;
                    if (k.a(kVar, gVar)) {
                        kVar2.o(i7, gVar, Boolean.valueOf(z8));
                        return true;
                    }
                }
                if (!z7) {
                    g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
                    if (k.a(kVar, gVar2)) {
                        kVar2.o(i7, gVar2, Boolean.valueOf(z8));
                        return true;
                    }
                }
            }
        } else {
            if (z7) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (k.a(kVar, gVar3)) {
                    kVar2.o(i7, gVar3, Boolean.valueOf(z8));
                    return true;
                }
            }
            if (!z7) {
                g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (k.a(kVar, gVar4)) {
                    kVar2.o(i7, gVar4, Boolean.valueOf(z8));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
        } else {
            k kVar = this.f12507m;
            if (kVar != null) {
                return createAccessibilityNodeInfo(kVar.f12468b);
            }
            Integer num = this.f12505k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        }
        k kVar2 = this.f12504i;
        if (kVar2 != null) {
            return createAccessibilityNodeInfo(kVar2.f12468b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i7, int i8) {
        if (!this.f12499c.isEnabled()) {
            return;
        }
        h(d(i7, i8));
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (!this.f12499c.isEnabled()) {
            return;
        }
        View view = this.f12497a;
        view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void i(boolean z7) {
        if (this.f12514t == z7) {
            return;
        }
        this.f12514t = z7;
        if (z7) {
            this.f12506l |= f.ACCESSIBLE_NAVIGATION.value;
        } else {
            this.f12506l &= ~f.ACCESSIBLE_NAVIGATION.value;
        }
        ((FlutterJNI) this.f12498b.f5966c).setAccessibilityFeatures(this.f12506l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(io.flutter.view.k r3) {
        /*
            r2 = this;
            int r0 = r3.j
            if (r0 <= 0) goto L31
            io.flutter.view.k r0 = r2.f12504i
            r1 = 0
            if (r0 == 0) goto L17
            io.flutter.view.k r0 = r0.f12456O
        Lb:
            if (r0 == 0) goto L13
            if (r0 != r3) goto L10
            goto L14
        L10:
            io.flutter.view.k r0 = r0.f12456O
            goto Lb
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            goto L2f
        L17:
            io.flutter.view.k r3 = r2.f12504i
            if (r3 == 0) goto L2f
            io.flutter.view.k r3 = r3.f12456O
        L1d:
            if (r3 == 0) goto L2c
            io.flutter.view.i r0 = io.flutter.view.i.HAS_IMPLICIT_SCROLLING
            boolean r0 = r3.h(r0)
            if (r0 == 0) goto L29
            r1 = r3
            goto L2c
        L29:
            io.flutter.view.k r3 = r3.f12456O
            goto L1d
        L2c:
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r3 = 1
            goto L32
        L31:
            r3 = 0
        L32:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.o.j(io.flutter.view.k):boolean");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i8, Bundle bundle) {
        String str;
        if (i7 >= 65536) {
            boolean performAction = this.f12500d.performAction(i7, i8, bundle);
            if (performAction && i8 == 128) {
                this.j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f12502g;
        k kVar = (k) hashMap.get(Integer.valueOf(i7));
        if (kVar == null) {
            return false;
        }
        V2.k kVar2 = this.f12498b;
        switch (i8) {
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                kVar2.n(i7, g.TAP);
                return true;
            case RecognitionOptions.EAN_13 /* 32 */:
                kVar2.n(i7, g.LONG_PRESS);
                return true;
            case RecognitionOptions.EAN_8 /* 64 */:
                if (this.f12504i == null) {
                    this.f12497a.invalidate();
                }
                this.f12504i = kVar;
                kVar2.n(i7, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(kVar.f12468b));
                ((E.e) kVar2.f5965b).f0(hashMap2, null);
                g(i7, RecognitionOptions.TEZ_CODE);
                if (k.a(kVar, g.INCREASE) || k.a(kVar, g.DECREASE)) {
                    g(i7, 4);
                }
                return true;
            case RecognitionOptions.ITF /* 128 */:
                k kVar3 = this.f12504i;
                if (kVar3 != null && kVar3.f12468b == i7) {
                    this.f12504i = null;
                }
                Integer num = this.j;
                if (num != null && num.intValue() == i7) {
                    this.j = null;
                }
                kVar2.n(i7, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i7, 65536);
                return true;
            case RecognitionOptions.QR_CODE /* 256 */:
                return f(kVar, i7, bundle, true);
            case RecognitionOptions.UPC_A /* 512 */:
                return f(kVar, i7, bundle, false);
            case RecognitionOptions.AZTEC /* 4096 */:
                g gVar = g.SCROLL_UP;
                if (k.a(kVar, gVar)) {
                    kVar2.n(i7, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (k.a(kVar, gVar2)) {
                        kVar2.n(i7, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!k.a(kVar, gVar3)) {
                            return false;
                        }
                        kVar.f12482r = kVar.f12484t;
                        kVar.f12483s = kVar.f12485u;
                        g(i7, 4);
                        kVar2.n(i7, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (k.a(kVar, gVar4)) {
                    kVar2.n(i7, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (k.a(kVar, gVar5)) {
                        kVar2.n(i7, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!k.a(kVar, gVar6)) {
                            return false;
                        }
                        kVar.f12482r = kVar.f12486v;
                        kVar.f12483s = kVar.f12487w;
                        g(i7, 4);
                        kVar2.n(i7, gVar6);
                    }
                }
                return true;
            case 16384:
                kVar2.n(i7, g.COPY);
                return true;
            case RecognitionOptions.TEZ_CODE /* 32768 */:
                kVar2.n(i7, g.PASTE);
                return true;
            case 65536:
                kVar2.n(i7, g.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(kVar.f12473h));
                    hashMap3.put("extent", Integer.valueOf(kVar.f12473h));
                }
                kVar2.o(i7, g.SET_SELECTION, hashMap3);
                k kVar4 = (k) hashMap.get(Integer.valueOf(i7));
                kVar4.f12472g = ((Integer) hashMap3.get("base")).intValue();
                kVar4.f12473h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 1048576:
                kVar2.n(i7, g.DISMISS);
                return true;
            case 2097152:
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) {
                    str = bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                } else {
                    str = StringUtils.EMPTY;
                }
                kVar2.o(i7, g.SET_TEXT, str);
                kVar.f12482r = str;
                kVar.f12483s = null;
                return true;
            case 16908342:
                kVar2.n(i7, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f12503h.get(Integer.valueOf(i8 - 267386881));
                if (hVar == null) {
                    return false;
                }
                kVar2.o(i7, g.CUSTOM_ACTION, Integer.valueOf(hVar.f12437b));
                return true;
        }
    }
}

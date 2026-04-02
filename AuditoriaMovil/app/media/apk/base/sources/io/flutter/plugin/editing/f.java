package io.flutter.plugin.editing;

import K5.z;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class f extends SpannableStringBuilder {

    /* renamed from: X  reason: collision with root package name */
    public String f11640X;

    /* renamed from: Y  reason: collision with root package name */
    public int f11641Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11642Z;

    /* renamed from: a  reason: collision with root package name */
    public int f11643a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f11644b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11645c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f11646d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f11647e = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public int f11648e0;
    public String f;

    /* renamed from: f0  reason: collision with root package name */
    public int f11649f0;

    /* renamed from: g0  reason: collision with root package name */
    public final d f11650g0;

    public f(z zVar, View view) {
        this.f11650g0 = new d(view, this);
        if (zVar != null) {
            f(zVar);
        }
    }

    public final void a(e eVar) {
        if (this.f11644b > 0) {
            Log.e("ListenableEditingState", "adding a listener " + eVar.toString() + " in a listener callback");
        }
        if (this.f11643a > 0) {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f11646d.add(eVar);
            return;
        }
        this.f11645c.add(eVar);
    }

    public final void b() {
        this.f11643a++;
        if (this.f11644b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f11643a == 1 && !this.f11645c.isEmpty()) {
            this.f11640X = toString();
            this.f11641Y = Selection.getSelectionStart(this);
            this.f11642Z = Selection.getSelectionEnd(this);
            this.f11648e0 = BaseInputConnection.getComposingSpanStart(this);
            this.f11649f0 = BaseInputConnection.getComposingSpanEnd(this);
        }
    }

    public final void c() {
        boolean z7;
        int i7 = this.f11643a;
        if (i7 == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.f11645c;
        ArrayList arrayList2 = this.f11646d;
        if (i7 == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                this.f11644b++;
                ((e) it.next()).a(true);
                this.f11644b--;
            }
            if (!arrayList.isEmpty()) {
                String.valueOf(arrayList.size());
                boolean z8 = !toString().equals(this.f11640X);
                boolean z9 = false;
                if (this.f11641Y == Selection.getSelectionStart(this) && this.f11642Z == Selection.getSelectionEnd(this)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (this.f11648e0 != BaseInputConnection.getComposingSpanStart(this) || this.f11649f0 != BaseInputConnection.getComposingSpanEnd(this)) {
                    z9 = true;
                }
                d(z8, z7, z9);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.f11643a--;
    }

    public final void d(boolean z7, boolean z8, boolean z9) {
        if (z7 || z8 || z9) {
            Iterator it = this.f11645c.iterator();
            while (it.hasNext()) {
                this.f11644b++;
                ((e) it.next()).a(z7);
                this.f11644b--;
            }
        }
    }

    public final void e(e eVar) {
        if (this.f11644b > 0) {
            Log.e("ListenableEditingState", "removing a listener " + eVar.toString() + " in a listener callback");
        }
        this.f11645c.remove(eVar);
        if (this.f11643a > 0) {
            this.f11646d.remove(eVar);
        }
    }

    public final void f(z zVar) {
        int i7;
        b();
        replace(0, length(), (CharSequence) zVar.f2758a);
        int i8 = zVar.f2759b;
        if (i8 >= 0) {
            Selection.setSelection(this, i8, zVar.f2760c);
        } else {
            Selection.removeSelection(this);
        }
        int i9 = zVar.f2761d;
        if (i9 >= 0 && i9 < (i7 = zVar.f2762e)) {
            this.f11650g0.setComposingRegion(i9, i7);
        } else {
            BaseInputConnection.removeComposingSpans(this);
        }
        this.f11647e.clear();
        c();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [io.flutter.plugin.editing.h, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        super.setSpan(obj, i7, i8, i9);
        ArrayList arrayList = this.f11647e;
        String fVar = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj2 = new Object();
        obj2.f11659e = selectionStart;
        obj2.f = selectionEnd;
        obj2.f11660g = composingSpanStart;
        obj2.f11661h = composingSpanEnd;
        obj2.f11655a = fVar;
        obj2.f11656b = StringUtils.EMPTY;
        obj2.f11657c = -1;
        obj2.f11658d = -1;
        arrayList.add(obj2);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.f;
        if (str == null) {
            String spannableStringBuilder = super.toString();
            this.f = spannableStringBuilder;
            return spannableStringBuilder;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [io.flutter.plugin.editing.h, java.lang.Object] */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        if (this.f11644b > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String fVar = toString();
        int i11 = i8 - i7;
        boolean z7 = i11 != i10 - i9;
        for (int i12 = 0; i12 < i11 && !z7; i12++) {
            z7 |= charAt(i7 + i12) != charSequence.charAt(i9 + i12);
        }
        if (z7) {
            this.f = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i7, i8, charSequence, i9, i10);
        ArrayList arrayList = this.f11647e;
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        ?? obj = new Object();
        obj.f11659e = selectionStart2;
        obj.f = selectionEnd2;
        obj.f11660g = composingSpanStart2;
        obj.f11661h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        obj.f11655a = fVar;
        obj.f11656b = charSequence2;
        obj.f11657c = i7;
        obj.f11658d = i8;
        arrayList.add(obj);
        if (this.f11643a > 0) {
            return replace;
        }
        d(z7, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}

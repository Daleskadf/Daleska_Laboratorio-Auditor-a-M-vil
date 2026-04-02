package io.flutter.plugin.editing;

import B5.B;
import L5.r;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import b3.C0585f;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class c extends BaseInputConnection implements e {

    /* renamed from: a  reason: collision with root package name */
    public final B f11627a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11628b;

    /* renamed from: c  reason: collision with root package name */
    public final A.f f11629c;

    /* renamed from: d  reason: collision with root package name */
    public final f f11630d;

    /* renamed from: e  reason: collision with root package name */
    public final EditorInfo f11631e;
    public ExtractedTextRequest f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11632g;

    /* renamed from: h  reason: collision with root package name */
    public CursorAnchorInfo.Builder f11633h;

    /* renamed from: i  reason: collision with root package name */
    public final ExtractedText f11634i;
    public final InputMethodManager j;

    /* renamed from: k  reason: collision with root package name */
    public final DynamicLayout f11635k;

    /* renamed from: l  reason: collision with root package name */
    public final C0585f f11636l;

    /* renamed from: m  reason: collision with root package name */
    public final V2.k f11637m;

    /* renamed from: n  reason: collision with root package name */
    public int f11638n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(B b5, int i7, A.f fVar, V2.k kVar, f fVar2, EditorInfo editorInfo) {
        super(b5, true);
        FlutterJNI flutterJNI = new FlutterJNI();
        this.f11632g = false;
        this.f11634i = new ExtractedText();
        this.f11638n = 0;
        this.f11627a = b5;
        this.f11628b = i7;
        this.f11629c = fVar;
        this.f11630d = fVar2;
        fVar2.a(this);
        this.f11631e = editorInfo;
        this.f11637m = kVar;
        this.f11636l = new C0585f(flutterJNI, 6);
        this.f11635k = new DynamicLayout(fVar2, new TextPaint(), com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.j = (InputMethodManager) b5.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.e
    public final void a(boolean z7) {
        f fVar = this.f11630d;
        fVar.getClass();
        this.j.updateSelection(this.f11627a, Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar), BaseInputConnection.getComposingSpanStart(fVar), BaseInputConnection.getComposingSpanEnd(fVar));
        ExtractedTextRequest extractedTextRequest = this.f;
        InputMethodManager inputMethodManager = this.j;
        B b5 = this.f11627a;
        if (extractedTextRequest != null) {
            inputMethodManager.updateExtractedText(b5, extractedTextRequest.token, c(extractedTextRequest));
        }
        if (this.f11632g) {
            inputMethodManager.updateCursorAnchorInfo(b5, b());
        }
    }

    public final CursorAnchorInfo b() {
        CursorAnchorInfo.Builder builder = this.f11633h;
        if (builder == null) {
            this.f11633h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        CursorAnchorInfo.Builder builder2 = this.f11633h;
        f fVar = this.f11630d;
        fVar.getClass();
        int selectionStart = Selection.getSelectionStart(fVar);
        fVar.getClass();
        builder2.setSelectionRange(selectionStart, Selection.getSelectionEnd(fVar));
        fVar.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(fVar);
        fVar.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(fVar);
        if (composingSpanStart >= 0 && composingSpanEnd > composingSpanStart) {
            this.f11633h.setComposingText(composingSpanStart, fVar.toString().subSequence(composingSpanStart, composingSpanEnd));
        } else {
            this.f11633h.setComposingText(-1, StringUtils.EMPTY);
        }
        return this.f11633h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f11630d.b();
        this.f11638n++;
        return super.beginBatchEdit();
    }

    public final ExtractedText c(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f11634i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        CharSequence charSequence = this.f11630d;
        charSequence.getClass();
        extractedText.selectionStart = Selection.getSelectionStart(charSequence);
        charSequence.getClass();
        extractedText.selectionEnd = Selection.getSelectionEnd(charSequence);
        if (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) {
            charSequence = charSequence.toString();
        }
        extractedText.text = charSequence;
        return extractedText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final void closeConnection() {
        super.closeConnection();
        this.f11630d.e(this);
        while (this.f11638n > 0) {
            endBatchEdit();
            this.f11638n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        int i8;
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f11627a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    try {
                                        i8 = openInputStream.read(bArr);
                                    } catch (IOException unused) {
                                        i8 = -1;
                                    }
                                    if (i8 == -1) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("mimeType", mimeType);
                                        hashMap.put("data", byteArray);
                                        hashMap.put("uri", contentUri.toString());
                                        A.f fVar = this.f11629c;
                                        fVar.getClass();
                                        ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(this.f11628b), "TextInputAction.commitContent", hashMap), null);
                                        inputContentInfo.releasePermission();
                                        return true;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i8);
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused3) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x003f A[EDGE_INSN: B:197:0x003f->B:18:0x003f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01ad A[EDGE_INSN: B:203:0x01ad->B:108:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.d(boolean, boolean):boolean");
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        f fVar = this.f11630d;
        fVar.getClass();
        if (Selection.getSelectionStart(fVar) == -1) {
            return true;
        }
        return super.deleteSurroundingText(i7, i8);
    }

    public final boolean e(boolean z7, boolean z8) {
        f fVar = this.f11630d;
        int selectionStart = Selection.getSelectionStart(fVar);
        int selectionEnd = Selection.getSelectionEnd(fVar);
        boolean z9 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z8) {
            z9 = true;
        }
        beginBatchEdit();
        DynamicLayout dynamicLayout = this.f11635k;
        if (z9) {
            if (z7) {
                Selection.moveUp(fVar, dynamicLayout);
            } else {
                Selection.moveDown(fVar, dynamicLayout);
            }
            int selectionStart2 = Selection.getSelectionStart(fVar);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z7) {
                Selection.extendUp(fVar, dynamicLayout);
            } else {
                Selection.extendDown(fVar, dynamicLayout);
            }
            setSelection(Selection.getSelectionStart(fVar), Selection.getSelectionEnd(fVar));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f11638n--;
        this.f11630d.c();
        return endBatchEdit;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public final Editable getEditable() {
        return this.f11630d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        ExtractedTextRequest extractedTextRequest2;
        boolean z7 = true;
        if ((i7 & 1) == 0) {
            z7 = false;
        }
        if (z7) {
            extractedTextRequest2 = extractedTextRequest;
        } else {
            extractedTextRequest2 = null;
        }
        this.f = extractedTextRequest2;
        return c(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        beginBatchEdit();
        boolean z7 = true;
        f fVar = this.f11630d;
        if (i7 == 16908319) {
            setSelection(0, fVar.length());
        } else {
            B b5 = this.f11627a;
            if (i7 == 16908320) {
                int selectionStart = Selection.getSelectionStart(fVar);
                int selectionEnd = Selection.getSelectionEnd(fVar);
                if (selectionStart != selectionEnd) {
                    int min = Math.min(selectionStart, selectionEnd);
                    int max = Math.max(selectionStart, selectionEnd);
                    ((ClipboardManager) b5.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(min, max)));
                    fVar.delete(min, max);
                    setSelection(min, min);
                }
            } else if (i7 == 16908321) {
                int selectionStart2 = Selection.getSelectionStart(fVar);
                int selectionEnd2 = Selection.getSelectionEnd(fVar);
                if (selectionStart2 != selectionEnd2) {
                    ((ClipboardManager) b5.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", fVar.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
                }
            } else if (i7 == 16908322) {
                ClipData primaryClip = ((ClipboardManager) b5.getContext().getSystemService("clipboard")).getPrimaryClip();
                if (primaryClip != null) {
                    CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(b5.getContext());
                    int max2 = Math.max(0, Selection.getSelectionStart(fVar));
                    int max3 = Math.max(0, Selection.getSelectionEnd(fVar));
                    int min2 = Math.min(max2, max3);
                    int max4 = Math.max(max2, max3);
                    if (min2 != max4) {
                        fVar.delete(min2, max4);
                    }
                    fVar.insert(min2, coerceToText);
                    int length = coerceToText.length() + min2;
                    setSelection(length, length);
                }
            } else {
                z7 = false;
            }
        }
        endBatchEdit();
        return z7;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8 = this.f11628b;
        A.f fVar = this.f11629c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                if (i7 != 7) {
                                    fVar.getClass();
                                    ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.done"), null);
                                } else {
                                    fVar.getClass();
                                    ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.previous"), null);
                                }
                            } else {
                                fVar.getClass();
                                ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.next"), null);
                            }
                        } else {
                            fVar.getClass();
                            ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.send"), null);
                        }
                    } else {
                        fVar.getClass();
                        ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.search"), null);
                    }
                } else {
                    fVar.getClass();
                    ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.go"), null);
                }
            } else {
                fVar.getClass();
                ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.newline"), null);
            }
        } else {
            fVar.getClass();
            ((r) fVar.f10b).a("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i8), "TextInputAction.unspecified"), null);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        A.f fVar = this.f11629c;
        fVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        ((r) fVar.f10b).a("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(this.f11628b), hashMap), null);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        boolean z7;
        if ((i7 & 1) != 0) {
            this.j.updateCursorAnchorInfo(this.f11627a, b());
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11632g = z7;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f11637m.y(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean composingText;
        beginBatchEdit();
        if (charSequence.length() == 0) {
            composingText = super.commitText(charSequence, i7);
        } else {
            composingText = super.setComposingText(charSequence, i7);
        }
        endBatchEdit();
        return composingText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        beginBatchEdit();
        boolean selection = super.setSelection(i7, i8);
        endBatchEdit();
        return selection;
    }
}

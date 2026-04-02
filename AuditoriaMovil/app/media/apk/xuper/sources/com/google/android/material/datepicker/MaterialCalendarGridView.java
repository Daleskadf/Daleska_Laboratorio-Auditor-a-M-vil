package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import b0.c1;
import c0.g0;
import com.google.android.material.R;
import java.util.Calendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void gainFocus(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter2().lastPositionInMonth());
        } else if (i10 == 130) {
            setSelection(getAdapter2().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private static int horizontalMidPoint(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean skipMonth(Long l10, Long l11, Long l12, Long l13) {
        if (l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int dayToPosition;
        int horizontalMidPoint;
        int dayToPosition2;
        int horizontalMidPoint2;
        int i10;
        int i11;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.dateSelector;
        CalendarStyle calendarStyle = adapter2.calendarStyle;
        Long item = adapter2.getItem(adapter2.firstPositionInMonth());
        Long item2 = adapter2.getItem(adapter2.lastPositionInMonth());
        for (a0.d dVar : dateSelector.getSelectedRanges()) {
            Object obj = dVar.first;
            if (obj != null) {
                if (dVar.second == null) {
                    continue;
                } else {
                    long longValue = ((Long) obj).longValue();
                    long longValue2 = ((Long) dVar.second).longValue();
                    if (skipMonth(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        return;
                    }
                    if (longValue < item.longValue()) {
                        dayToPosition = adapter2.firstPositionInMonth();
                        if (adapter2.isFirstInRow(dayToPosition)) {
                            horizontalMidPoint = 0;
                        } else {
                            horizontalMidPoint = materialCalendarGridView.getChildAt(dayToPosition - 1).getRight();
                        }
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue);
                        dayToPosition = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition));
                    }
                    if (longValue2 > item2.longValue()) {
                        dayToPosition2 = adapter2.lastPositionInMonth();
                        if (adapter2.isLastInRow(dayToPosition2)) {
                            horizontalMidPoint2 = getWidth();
                        } else {
                            horizontalMidPoint2 = materialCalendarGridView.getChildAt(dayToPosition2).getRight();
                        }
                    } else {
                        materialCalendarGridView.dayCompute.setTimeInMillis(longValue2);
                        dayToPosition2 = adapter2.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                        horizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(dayToPosition2));
                    }
                    int itemId = (int) adapter2.getItemId(dayToPosition);
                    int itemId2 = (int) adapter2.getItemId(dayToPosition2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View childAt = materialCalendarGridView.getChildAt(numColumns);
                        int top = childAt.getTop() + calendarStyle.day.getTopInset();
                        int bottom = childAt.getBottom() - calendarStyle.day.getBottomInset();
                        if (numColumns > dayToPosition) {
                            i10 = 0;
                        } else {
                            i10 = horizontalMidPoint;
                        }
                        if (dayToPosition2 > numColumns2) {
                            i11 = getWidth();
                        } else {
                            i11 = horizontalMidPoint2;
                        }
                        canvas.drawRect(i10, top, i11, bottom, calendarStyle.rangeFill);
                        itemId++;
                        materialCalendarGridView = this;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            gainFocus(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().firstPositionInMonth()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter2().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter2().firstPositionInMonth()) {
            super.setSelection(getAdapter2().firstPositionInMonth());
        } else {
            super.setSelection(i10);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof MonthAdapter) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        c1.k0(this, new b0.a() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // b0.a
            public void onInitializeAccessibilityNodeInfo(View view, g0 g0Var) {
                super.onInitializeAccessibilityNodeInfo(view, g0Var);
                g0Var.Y(null);
            }
        });
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter */
    public ListAdapter getAdapter2() {
        return (MonthAdapter) super.getAdapter();
    }
}

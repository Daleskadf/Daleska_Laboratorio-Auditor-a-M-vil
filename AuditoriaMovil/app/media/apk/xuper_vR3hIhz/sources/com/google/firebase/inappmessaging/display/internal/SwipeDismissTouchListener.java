package com.google.firebase.inappmessaging.display.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
/* loaded from: classes2.dex */
public class SwipeDismissTouchListener implements View.OnTouchListener {
    private long mAnimationTime;
    private DismissCallbacks mDismissCallbacks;
    private float mDownX;
    private float mDownY;
    private int mMaxFlingVelocity;
    private int mMinFlingVelocity;
    private int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private View mView;
    private int mViewWidth = 1;

    /* loaded from: classes2.dex */
    public interface DismissCallbacks {
        boolean canDismiss(Object obj);

        void onDismiss(View view, Object obj);
    }

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismissCallbacks) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.mSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mAnimationTime = view.getContext().getResources().getInteger(17694720);
        this.mView = view;
        this.mToken = obj;
        this.mDismissCallbacks = dismissCallbacks;
    }

    private void animateTo(float f10, float f11, AnimatorListenerAdapter animatorListenerAdapter) {
        final float translationX = getTranslationX();
        final float f12 = f10 - translationX;
        final float alpha = this.mView.getAlpha();
        final float f13 = f11 - alpha;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(this.mAnimationTime);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = translationX + (valueAnimator.getAnimatedFraction() * f12);
                float animatedFraction2 = alpha + (valueAnimator.getAnimatedFraction() * f13);
                SwipeDismissTouchListener.this.setTranslationX(animatedFraction);
                SwipeDismissTouchListener.this.setAlpha(animatedFraction2);
            }
        });
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performDismiss() {
        final ViewGroup.LayoutParams layoutParams = this.mView.getLayoutParams();
        final int height = this.mView.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(height, 1).setDuration(this.mAnimationTime);
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.mDismissCallbacks.onDismiss(SwipeDismissTouchListener.this.mView, SwipeDismissTouchListener.this.mToken);
                SwipeDismissTouchListener.this.mView.setAlpha(1.0f);
                SwipeDismissTouchListener.this.mView.setTranslationX(0.0f);
                layoutParams.height = height;
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SwipeDismissTouchListener.this.mView.setLayoutParams(layoutParams);
            }
        });
        duration.start();
    }

    public float getTranslationX() {
        return this.mView.getTranslationX();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        motionEvent.offsetLocation(this.mTranslationX, 0.0f);
        if (this.mViewWidth < 2) {
            this.mViewWidth = this.mView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z14 = true;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3 && this.mVelocityTracker != null) {
                        startCancelAnimation();
                        this.mVelocityTracker.recycle();
                        this.mVelocityTracker = null;
                        this.mTranslationX = 0.0f;
                        this.mDownX = 0.0f;
                        this.mDownY = 0.0f;
                        this.mSwiping = false;
                    }
                } else {
                    VelocityTracker velocityTracker = this.mVelocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.mDownX;
                        float rawY = motionEvent.getRawY() - this.mDownY;
                        if (Math.abs(rawX) > this.mSlop && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.mSwiping = true;
                            if (rawX > 0.0f) {
                                i10 = this.mSlop;
                            } else {
                                i10 = -this.mSlop;
                            }
                            this.mSwipingSlop = i10;
                            this.mView.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.mView.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.mSwiping) {
                            this.mTranslationX = rawX;
                            setTranslationX(rawX - this.mSwipingSlop);
                            setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / this.mViewWidth))));
                            return true;
                        }
                    }
                }
            } else if (this.mVelocityTracker != null) {
                float rawX2 = motionEvent.getRawX() - this.mDownX;
                this.mVelocityTracker.addMovement(motionEvent);
                this.mVelocityTracker.computeCurrentVelocity(1000);
                float xVelocity = this.mVelocityTracker.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.mVelocityTracker.getYVelocity());
                if (Math.abs(rawX2) > this.mViewWidth / 2 && this.mSwiping) {
                    if (rawX2 > 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (this.mMinFlingVelocity <= abs && abs <= this.mMaxFlingVelocity && abs2 < abs && abs2 < abs && this.mSwiping) {
                    if (xVelocity < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (rawX2 < 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 == z12) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (this.mVelocityTracker.getXVelocity() <= 0.0f) {
                        z14 = false;
                    }
                    boolean z15 = z14;
                    z14 = z13;
                    z10 = z15;
                } else {
                    z10 = false;
                    z14 = false;
                }
                if (z14) {
                    startDismissAnimation(z10);
                } else if (this.mSwiping) {
                    startCancelAnimation();
                }
                VelocityTracker velocityTracker2 = this.mVelocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.mVelocityTracker = null;
                this.mTranslationX = 0.0f;
                this.mDownX = 0.0f;
                this.mDownY = 0.0f;
                this.mSwiping = false;
            }
            return false;
        }
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        if (this.mDismissCallbacks.canDismiss(this.mToken)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.mVelocityTracker = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }

    public void setAlpha(float f10) {
        this.mView.setAlpha(f10);
    }

    public void setTranslationX(float f10) {
        this.mView.setTranslationX(f10);
    }

    public void startCancelAnimation() {
        animateTo(0.0f, 1.0f, null);
    }

    public void startDismissAnimation(boolean z10) {
        int i10;
        if (z10) {
            i10 = this.mViewWidth;
        } else {
            i10 = -this.mViewWidth;
        }
        animateTo(i10, 0.0f, new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.SwipeDismissTouchListener.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SwipeDismissTouchListener.this.performDismiss();
            }
        });
    }
}

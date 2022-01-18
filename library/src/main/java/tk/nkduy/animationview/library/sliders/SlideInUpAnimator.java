package tk.nkduy.animationview.library.sliders;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class SlideInUpAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getHeight() - target.getTop();
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0, 1),
            ObjectAnimator.ofFloat(target, "translationY", distance, 0)
        );
    }
}

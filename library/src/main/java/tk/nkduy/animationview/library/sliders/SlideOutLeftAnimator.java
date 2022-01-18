package tk.nkduy.animationview.library.sliders;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class SlideOutLeftAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1, 0),
            ObjectAnimator.ofFloat(target, "translationX", 0, -target.getRight())
        );
    }
}

package tk.nkduy.animationview.library.fading_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class FadeInRightAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0, 1),
            ObjectAnimator.ofFloat(target, "translationX", target.getWidth() / 4, 0)
        );
    }
}

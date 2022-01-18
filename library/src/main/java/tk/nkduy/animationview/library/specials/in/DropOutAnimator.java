package tk.nkduy.animationview.library.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;
import tk.nkduy.animationeasing.Glider;
import tk.nkduy.animationeasing.Skill;

public class DropOutAnimator extends BaseViewAnimator {

    @Override
    protected void prepare(View target) {
        int distance = target.getTop() + target.getHeight();
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0, 1),
            Glider.glide(Skill.BounceEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "translationY", -distance, 0))
        );
    }
}

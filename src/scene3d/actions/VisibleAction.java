package scene3d.actions;

import scene3d.Action3d;


/** Sets the actor's {@link Actor#setVisible(boolean) visibility}.
 * @author Nathan Sweet */
public class VisibleAction extends Action3d {
        private boolean visible;

        @Override
        public boolean act (float delta) {
                actor3d.setVisible(visible);
                return true;
        }

        public boolean isVisible () {
                return visible;
        }

        public void setVisible (boolean visible) {
                this.visible = visible;
        }
}
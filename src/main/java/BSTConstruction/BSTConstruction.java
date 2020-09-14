package BSTConstruction;

public class BSTConstruction {

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            BST root = this;
            if (root == null){
                return this;
            }

            if(value >= root.value){

                if (root.right != null) {
                    root = root.right;
                    root.insert(value);
                }else{
                    root.right = new BSTConstruction.BST(value);
                    return this;
                }

            }else{
                if ( root.left!= null){
                    root = root.left;
                    root.insert(value);
                }else{
                    root.left = new BSTConstruction.BST(value);
                    return this;
                }
            }
            return this;
        }

        public boolean contains(int value) {
            // Write your code here.
            BST root = this;
            if (root == null) {
                return false;
            }
            if(root.value == value){
                return true;
            }
            if (root.left != null && root.left.contains(value)) {
                return true;
            } else if (root.right != null && root.right.contains(value)) {
                return true;
            }
            return false;
        }

        public BST remove(int value) {
            // Write your code here.
            // Do not edit the return statement of this method.
            return removeHelper(value,this);
        }

        private BST removeHelper(int value, BST root){
            if (root == null){
                return this;
            }

            BST left = this.left;
            BST right = this.right;

            if ( left != null && left.value == value ){
                root.left = null;
            }
            if(right != null && right.value == value){
                root.right = null;
            }

            if (this.value > value){
                if (left == null){
                    return this;
                }else{
                    left.removeHelper(value,left);
                }
            }

            return this;
        }
    }

}

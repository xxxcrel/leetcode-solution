package beer.cheese.greedy;

/**
 * LeetCode:605
 */
public class CanPlaceFlowers {
    public static void main(String[] args) {

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        for(int i = 0; i < flowerbed.length; ++i){
            //can place
            if(flowerbed[i] == 0){
                //first area or greedy place ignore whether subsequent can place
                if(i == 0 || flowerbed[i - 1] == 0){
                    n--;//count down
                    flowerbed[i] = 1;//place flower
                }
            }else{
                if(i > 0 && flowerbed[i - 1] == 1){
                    n++;//remove flower we place on it
                }
            }
        }
        return n <= 0;
    }
    //复杂版本
    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {
        if (flowerbed.length == 0) {
            return false;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            return n == 1 || n == 0;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 1) {
            return n == 0;
        }
        for (int i = 0; i < flowerbed.length; ) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    i += 2;
                } else {
                    i++;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    n--;
                    i += 2;
                } else {
                    i++;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n--;
                    i += 2;
                } else {
                    i++;
                }
            }
        }
        return n <= 0;
    }


}

package action.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:29
 */
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        //如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
        //这样颠倒一下，就可以实现反向排序了
        if (o1 < o2) {
            return 1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }
}

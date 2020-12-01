package action.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:41
 */
public class StragegyTest {
    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Comparator comparator = new MyComparator();
        Arrays.sort(a, comparator);

        DiscountStrategy giftGiving = new GiftGiving();
        DiscountContext discountContext = new DiscountContext(giftGiving);
        discountContext.promotion();

        DiscountStrategy shoppingCard = new ShoppingCard();
        discountContext = new DiscountContext(shoppingCard);
        discountContext.promotion();

    }
}

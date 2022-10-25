package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private double discountRate = 0.1;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return (int) (price * discountRate);
        }
        return 0;
    }
}

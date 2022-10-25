package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFIxAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){

            return discountFIxAmount;
        }
        return 0;
    }
}

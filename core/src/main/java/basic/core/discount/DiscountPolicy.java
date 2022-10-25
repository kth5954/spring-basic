package basic.core.discount;

import basic.core.member.Member;

public interface DiscountPolicy {
    public int discount(Member member, int price);
}

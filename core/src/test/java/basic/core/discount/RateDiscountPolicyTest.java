package basic.core.discount;

import basic.core.member.Grade;
import basic.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다. ")
    void vip_o(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("BASIC은 할인이 적용되지 않는다.")
    void basic_x(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId, "MemberA", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        Assertions.assertThat(discount).isEqualTo(0);
    }
}
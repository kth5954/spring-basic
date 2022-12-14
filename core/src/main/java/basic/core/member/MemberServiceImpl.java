package basic.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        this.memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return this.memberRepository.findById(memberId);
    }
}

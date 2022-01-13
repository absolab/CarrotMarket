package mul.camp.a.dao;

import java.util.List;

import mul.camp.a.dto.ReplyDto;

public interface ReplyDao {
    
    // cid(게시글)에 해당하는 댓글 데이터 배열 반환
    public List<ReplyDto> getReplyList(int cid);

    // 입력받은 내용을 DB에 추가
    public int addReply(ReplyDto dto);

    // 입력받은 내용으로 DB에 수정
    public int updateReply(ReplyDto dto);

    // rid(댓글)에 해당하는 댓글을 DB에서 제거
    public int deleteReply(int rid);

}

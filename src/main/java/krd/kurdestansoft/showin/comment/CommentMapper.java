package krd.kurdestansoft.showin.comment;


import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CommentMapper {

    Comment toComment(CommentDTO commentDTO);

    CommentDTO toCommentDTO(Comment comment);

    List<Comment> toComments(List<CommentDTO> commentDTOS);

    List<CommentDTO> toCommentDTOS(List<Comment> comments);

}

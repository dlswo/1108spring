package org.zerock.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardVO is a Querydsl query type for BoardVO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoardVO extends EntityPathBase<BoardVO> {

    private static final long serialVersionUID = -1298114071L;

    public static final QBoardVO boardVO = new QBoardVO("boardVO");

    public final NumberPath<Long> bno = createNumber("bno", Long.class);

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updatedate = createDateTime("updatedate", java.time.LocalDateTime.class);

    public final StringPath writer = createString("writer");

    public QBoardVO(String variable) {
        super(BoardVO.class, forVariable(variable));
    }

    public QBoardVO(Path<? extends BoardVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardVO(PathMetadata metadata) {
        super(BoardVO.class, metadata);
    }

}

